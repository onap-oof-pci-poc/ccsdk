/*
 * Copyright © 2017-2018 AT&T Intellectual Property.
 * Modifications Copyright © 2018 IBM.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onap.ccsdk.features.params.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.onap.ccsdk.features.model.ConfigModelConstant;
import org.onap.ccsdk.features.model.data.DataType;
import org.onap.ccsdk.features.model.data.NodeTemplate;
import org.onap.ccsdk.features.model.data.NodeType;
import org.onap.ccsdk.features.model.data.ServiceTemplate;
import org.onap.ccsdk.features.model.data.TopologyTemplate;
import org.onap.ccsdk.features.model.data.dict.ResourceDefinition;
import org.onap.ccsdk.features.model.utils.TransformationUtils;

public class ServiceTemplateCreateUtils {

    public void createNodeTypes(String serviceTemplateFileName) throws IOException {
        if (StringUtils.isNotBlank(serviceTemplateFileName)) {
            String fileContent =
                    FileUtils.readFileToString(new File(serviceTemplateFileName), Charset.defaultCharset());
            if (StringUtils.isNotBlank(fileContent)) {
                // System.out.println("NodeTypeCreateUtils.createNodeTypes()" +fileContent );
                ServiceTemplate serviceTemplate = TransformationUtils.readValue(fileContent, ServiceTemplate.class);

                String formattedServiceTemplateContent = TransformationUtils.getJson(serviceTemplate, true);

                FileUtils.writeStringToFile(new File("src/test/resources/service_templates/default.json"),
                        formattedServiceTemplateContent, Charset.defaultCharset());

                createVrrNodeTemplate(serviceTemplate);
                createDictionarySchema();

            }
        }
    }

    public void createNodeTypes(ServiceTemplate serviceTemplate) throws IOException {

        if (serviceTemplate != null && serviceTemplate.getNodeTypes() != null) {
            serviceTemplate.getNodeTypes().forEach((nodeTypeKey, node_types) -> {

                if (node_types != null && StringUtils.isNotBlank(node_types.getDerivedFrom())) {

                    try {
                        String fileName = "src/test/resources/node_types/";
                        if (ConfigModelConstant.MODEL_TYPE_NODE_VNF.equalsIgnoreCase(node_types.getDerivedFrom())) {
                            fileName = fileName + "vnf/" + nodeTypeKey + ".json";
                        }
                        if (ConfigModelConstant.MODEL_TYPE_NODE_DG.equalsIgnoreCase(node_types.getDerivedFrom())) {
                            fileName = fileName + "dg/" + nodeTypeKey + ".json";
                        }
                        if (ConfigModelConstant.MODEL_TYPE_NODE_COMPONENT
                                .equalsIgnoreCase(node_types.getDerivedFrom())) {
                            fileName = fileName + "component/" + nodeTypeKey + ".json";
                        }
                        String content = TransformationUtils.getJson(node_types, true);
                        FileUtils.write(new File(fileName), content, Charset.defaultCharset());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("NodeTypeCreateUtils.createNodeTypes()" + nodeTypeKey);
            });
        }

    }

    public void createResourceAssignmentNodeTemplate(ServiceTemplate serviceTemplate) throws IOException {
        if (serviceTemplate != null) {
            ServiceTemplate workingServiceTemplate = new ServiceTemplate();
            workingServiceTemplate.setMetadata(serviceTemplate.getMetadata());

            Map<String, DataType> data_types = new HashMap<String, DataType>();
            data_types.put("datatype-property", serviceTemplate.getDataTypes().get("datatype-property"));
            data_types.put("datatype-resource-assignment",
                    serviceTemplate.getDataTypes().get("datatype-resource-assignment"));

            workingServiceTemplate.setDataTypes(data_types);

            TopologyTemplate topology_template = new TopologyTemplate();
            Map<String, NodeTemplate> node_templates = new HashMap<String, NodeTemplate>();

            Map<String, NodeTemplate> node_Templates = serviceTemplate.getTopologyTemplate().getNodeTemplates();

            node_templates.put("base-config-template", node_Templates.get("base-config-template"));
            node_templates.put("licence-template", node_Templates.get("licence-template"));

            node_templates.put("resource-assignment-action", node_Templates.get("resource-assignment-action"));
            node_templates.put("resource-assignment", node_Templates.get("resource-assignment"));

            topology_template.setNodeTemplates(node_templates);
            topology_template.setInputs(serviceTemplate.getTopologyTemplate().getInputs());

            Map<String, NodeType> node_types = new HashMap<String, NodeType>();
            node_types.put("artifact-config-template", serviceTemplate.getNodeTypes().get("artifact-config-template"));
            node_types.put("dg-resource-assignment", serviceTemplate.getNodeTypes().get("dg-resource-assignment"));
            node_types.put("component-resource-assignment",
                    serviceTemplate.getNodeTypes().get("component-resource-assignment"));

            workingServiceTemplate.setNodeTypes(node_types);
            workingServiceTemplate.setTopologyTemplate(topology_template);

            String workingServiceTemplateConmtent = TransformationUtils.getJson(workingServiceTemplate, true);

            FileUtils.writeStringToFile(new File("src/test/resources/service_templates/resource_assignment.json"),
                    workingServiceTemplateConmtent, Charset.defaultCharset());

            File lcmFile = new File(
                    "../../../northbound/selfservice-api/provider/src/test/resources/service_templates/resource_assignment.json");
            FileUtils.writeStringToFile(lcmFile, workingServiceTemplateConmtent, Charset.defaultCharset());

            File resourceAssignmetFile = new File(
                    "../../../plugin/assignment/provider/src/test/resources/service_templates/resource_assignment.json");
            FileUtils.writeStringToFile(resourceAssignmetFile, workingServiceTemplateConmtent,
                    Charset.defaultCharset());

            System.out.println("NodeTypeCreateUtils.createNodeTemplate() :" + workingServiceTemplateConmtent);
        }

    }

    public void createVrrNodeTemplate(ServiceTemplate serviceTemplate) throws IOException {
        if (serviceTemplate != null) {
            ServiceTemplate workingServiceTemplate = new ServiceTemplate();
            workingServiceTemplate.setMetadata(serviceTemplate.getMetadata());

            TopologyTemplate topology_template = new TopologyTemplate();
            Map<String, NodeTemplate> node_templates = new HashMap<String, NodeTemplate>();

            Map<String, NodeTemplate> node_Templates = serviceTemplate.getTopologyTemplate().getNodeTemplates();

            node_templates.put("resource-assignment-action", node_Templates.get("resource-assignment-action"));
            node_templates.put("resource-assignment", node_Templates.get("resource-assignment"));

            node_templates.put("activate-action", node_Templates.get("activate-action"));
            node_templates.put("base-config-template", node_Templates.get("base-config-template"));
            node_templates.put("licence-template", node_Templates.get("licence-template"));
            node_templates.put("vrr-netconf-device", node_Templates.get("vrr-netconf-device"));
            node_templates.put("get-netconf-config", node_Templates.get("get-netconf-config"));
            node_templates.put("edit-netconf-config", node_Templates.get("edit-netconf-config"));
            node_templates.put("transaction-netconf-baseconfig", node_Templates.get("transaction-netconf-baseconfig"));

            topology_template.setNodeTemplates(node_templates);
            topology_template.setInputs(serviceTemplate.getTopologyTemplate().getInputs());

            workingServiceTemplate.setTopologyTemplate(topology_template);

            String workingServiceTemplateContent = TransformationUtils.getJson(workingServiceTemplate, true);

            FileUtils.writeStringToFile(new File("src/test/resources/service_templates/vrr_config.json"),
                    workingServiceTemplateContent, Charset.defaultCharset());

        }
    }

    public void createDictionarySchema() throws IOException {
        String schema = TransformationUtils.getJsonSchema(ResourceDefinition.class);
        FileUtils.writeStringToFile(new File("src/test/resources/dictionary/dictionary_schema.json"), schema,
                Charset.defaultCharset());
    }

    public static void main(String[] args) {
        try {
            ServiceTemplateCreateUtils utils = new ServiceTemplateCreateUtils();
            utils.createNodeTypes("src/test/resources/service_templates/default.json");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
