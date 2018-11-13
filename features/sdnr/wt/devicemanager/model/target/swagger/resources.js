function getSpec() {
	return '{"apiVersion":"1.0.0","swaggerVersion":"1.2","apis":[{"path":"config(2013-04-05)","description":null},{"path":"devicemanager-api(2017-03-17)","description":null}]}';
}

function jsonFor(resource) {
	switch(resource) {
		case "config(2013-04-05)": return '{"apiVersion":"1.0.0","swaggerVersion":"1.2","basePath":"restconf","resourcePath":null,"produces":["application/json","application/xml"],"apis":[{"path":"/config","operations":[{"method":"POST","summary":null,"notes":"This module contains the base YANG definitions for NS-OS\\nconfiguration subsystem. The system modeled revolves around two\\nmajor concepts: modules and services.","type":"(config)config_modulePOST","nickname":"POST-config_module","consumes":["application/json","application/xml"],"parameters":[{"name":"**(config)modules","description":null,"required":false,"type":"config(config)modules-TOP","paramType":"body"},{"name":"**(config)services","description":null,"required":false,"type":"config(config)services-TOP","paramType":"body"}],"responseMessages":null}]},{"path":"/config/config:modules","operations":[{"method":"GET","summary":null,"notes":"Top level container encapsulating configuration of all modules.","type":"(config)modules","nickname":"GET-modules","consumes":null,"parameters":[],"responseMessages":null},{"method":"PUT","summary":null,"notes":"Top level container encapsulating configuration of all modules.","type":"config(config)modules-TOP","nickname":"PUT-modules","consumes":["application/json","application/xml"],"parameters":[{"name":"(config)modules","description":null,"required":false,"type":"config(config)modules-TOP","paramType":"body"}],"responseMessages":null},{"method":"DELETE","summary":null,"notes":"Top level container encapsulating configuration of all modules.","type":null,"nickname":"DELETE-modules","consumes":null,"parameters":[],"responseMessages":null},{"method":"POST","summary":null,"notes":"Top level container encapsulating configuration of all modules.","type":"(config)modulesPOST","nickname":"POST-modules","consumes":["application/json","application/xml"],"parameters":[{"name":"**(config)module","description":null,"required":false,"type":"config/modules(config)module-TOP","paramType":"body"}],"responseMessages":null}]},{"path":"/config/config:modules/module/{type}/{name}","operations":[{"method":"GET","summary":null,"notes":null,"type":"(config)module","nickname":"GET-module","consumes":null,"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"},{"name":"name","description":"Unique module instance name","required":false,"type":"string","paramType":"path"}],"responseMessages":null},{"method":"PUT","summary":null,"notes":null,"type":"config/modules(config)module-TOP","nickname":"PUT-module","consumes":["application/json","application/xml"],"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"},{"name":"name","description":"Unique module instance name","required":false,"type":"string","paramType":"path"},{"name":"(config)module","description":null,"required":false,"type":"config/modules(config)module-TOP","paramType":"body"}],"responseMessages":null},{"method":"DELETE","summary":null,"notes":null,"type":null,"nickname":"DELETE-module","consumes":null,"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"},{"name":"name","description":"Unique module instance name","required":false,"type":"string","paramType":"path"}],"responseMessages":null}]},{"path":"/operational/config:modules","operations":[{"method":"GET","summary":null,"notes":"Top level container encapsulating configuration of all modules.","type":"(operational)modules","nickname":"GET-modules","consumes":null,"parameters":[],"responseMessages":null}]},{"path":"/config/config:services","operations":[{"method":"GET","summary":null,"notes":null,"type":"(config)services","nickname":"GET-services","consumes":null,"parameters":[],"responseMessages":null},{"method":"PUT","summary":null,"notes":null,"type":"config(config)services-TOP","nickname":"PUT-services","consumes":["application/json","application/xml"],"parameters":[{"name":"(config)services","description":null,"required":false,"type":"config(config)services-TOP","paramType":"body"}],"responseMessages":null},{"method":"DELETE","summary":null,"notes":null,"type":null,"nickname":"DELETE-services","consumes":null,"parameters":[],"responseMessages":null},{"method":"POST","summary":null,"notes":null,"type":"(config)servicesPOST","nickname":"POST-services","consumes":["application/json","application/xml"],"parameters":[{"name":"**(config)service","description":null,"required":false,"type":"config/services(config)service-TOP","paramType":"body"}],"responseMessages":null}]},{"path":"/config/config:services/service/{type}","operations":[{"method":"GET","summary":null,"notes":null,"type":"(config)service","nickname":"GET-service","consumes":null,"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"}],"responseMessages":null},{"method":"PUT","summary":null,"notes":null,"type":"config/services(config)service-TOP","nickname":"PUT-service","consumes":["application/json","application/xml"],"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"},{"name":"(config)service","description":null,"required":false,"type":"config/services(config)service-TOP","paramType":"body"}],"responseMessages":null},{"method":"DELETE","summary":null,"notes":null,"type":null,"nickname":"DELETE-service","consumes":null,"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"}],"responseMessages":null},{"method":"POST","summary":null,"notes":null,"type":"(config)servicePOST","nickname":"POST-service","consumes":["application/json","application/xml"],"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"},{"name":"**(config)instance","description":null,"required":false,"type":"config/services/service(config)instance-TOP","paramType":"body"}],"responseMessages":null}]},{"path":"/config/config:services/service/{type}/instance/{name}","operations":[{"method":"GET","summary":null,"notes":null,"type":"(config)instance","nickname":"GET-instance","consumes":null,"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"},{"name":"name","description":null,"required":false,"type":"string","paramType":"path"}],"responseMessages":null},{"method":"PUT","summary":null,"notes":null,"type":"config/services/service(config)instance-TOP","nickname":"PUT-instance","consumes":["application/json","application/xml"],"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"},{"name":"name","description":null,"required":false,"type":"string","paramType":"path"},{"name":"(config)instance","description":null,"required":false,"type":"config/services/service(config)instance-TOP","paramType":"body"}],"responseMessages":null},{"method":"DELETE","summary":null,"notes":null,"type":null,"nickname":"DELETE-instance","consumes":null,"parameters":[{"name":"type","description":null,"required":false,"type":"string","paramType":"path"},{"name":"name","description":null,"required":false,"type":"string","paramType":"path"}],"responseMessages":null}]},{"path":"/operational/config:services","operations":[{"method":"GET","summary":null,"notes":null,"type":"(operational)services","nickname":"GET-services","consumes":null,"parameters":[],"responseMessages":null}]}],"models":{"unique_empty_identifier":{},"(config)config_modulePOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)config_modulePOST","properties":{"modules":{"type":"object","items":{"$ref":"config(config)modules"}},"services":{"type":"object","items":{"$ref":"config(config)services"}}}},"config/modules(config)module":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:name":{"description":"Unique module instance name","required":true,"type":"Optional.empty"},"config:type":{"required":true,"type":"Optional.empty"}},"id":"config/modules(config)module"},"(config)modulePOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)modulePOST","properties":{"name":{"description":"Unique module instance name","required":true,"type":"Optional.empty"},"type":{"required":true,"type":"Optional.empty"}}},"config/modules(config)module-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:module":{"type":"array","items":{"$ref":"config/modules(config)module"}}},"id":"config/modules(config)module-TOP"},"config(config)modules":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:module":{"type":"array","items":{"$ref":"config/modules(config)module"}}},"id":"config(config)modules"},"(config)modulesPOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)modulesPOST","properties":{"module":{"type":"array","items":{"$ref":"config/modules(config)module"}}}},"config(config)modules-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:modules":{"type":"object","items":{"$ref":"config(config)modules"},"description":"Top level container encapsulating configuration of all modules."}},"id":"config(config)modules-TOP"},"config(operational)modules":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{},"id":"config(operational)modules"},"config(operational)modules-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:modules":{"type":"object","items":{"$ref":"config(operational)modules"},"description":"Top level container encapsulating configuration of all modules."}},"id":"config(operational)modules-TOP"},"config/services/service(config)instance":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:name":{"required":false,"type":"Optional.empty"},"config:provider":{"required":true,"type":"Optional.empty"}},"id":"config/services/service(config)instance"},"(config)instancePOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)instancePOST","properties":{"name":{"required":false,"type":"Optional.empty"},"provider":{"required":true,"type":"Optional.empty"}}},"config/services/service(config)instance-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:instance":{"type":"array","items":{"$ref":"config/services/service(config)instance"}}},"id":"config/services/service(config)instance-TOP"},"config/services(config)service":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:type":{"required":false,"type":"Optional.empty"},"config:instance":{"type":"array","items":{"$ref":"config/services/service(config)instance"}}},"id":"config/services(config)service"},"(config)servicePOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)servicePOST","properties":{"type":{"required":false,"type":"Optional.empty"},"instance":{"type":"array","items":{"$ref":"config/services/service(config)instance"}}}},"config/services(config)service-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:service":{"type":"array","items":{"$ref":"config/services(config)service"}}},"id":"config/services(config)service-TOP"},"config(config)services":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:service":{"type":"array","items":{"$ref":"config/services(config)service"}}},"id":"config(config)services"},"(config)servicesPOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)servicesPOST","properties":{"service":{"type":"array","items":{"$ref":"config/services(config)service"}}}},"config(config)services-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:services":{"type":"object","items":{"$ref":"config(config)services"}}},"id":"config(config)services-TOP"},"config(operational)services":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{},"id":"config(operational)services"},"config(operational)services-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"config:services":{"type":"object","items":{"$ref":"config(operational)services"}}},"id":"config(operational)services-TOP"},"service-type":{"id":"service-type","description":"Service identity base type. All service identities must be\\nderived from this type. A service type uniquely defines a single\\natomic API contract, such as a Java interface, a set of C\\nfunction declarations, or similar.\\n\\nIf the service type has a corresponding Java interface, the name\\nof that interface should be attached to the derived identity MUST\\ninclude a java-class keyword, whose name argument points to that\\ninterface.","subTypes":["devicemanager-api"],"properties":{}},"module-type":{"id":"module-type","description":"Module identity base type. All module identities must be derived\\nfrom this type. A module type uniquely defines a single atomic\\ncomponent, such as an application. Each such component is assumed\\nto have its unique, stable and versioned configuration structure.","subTypes":[],"properties":{}}}}';
		case "devicemanager-api(2017-03-17)": return '{"apiVersion":"1.0.0","swaggerVersion":"1.2","basePath":"restconf","resourcePath":null,"produces":["application/json","application/xml"],"apis":[{"path":"/operations/devicemanager-api:get-required-network-element-keys","operations":[{"method":"POST","summary":null,"notes":"Returns a list of netconf nodes for each data store space","type":"(get-required-network-element-keys)output-TOP","nickname":"get-required-network-element-keys","consumes":null,"parameters":null,"responseMessages":null}]},{"path":"/operations/devicemanager-api:show-required-network-element","operations":[{"method":"POST","summary":null,"notes":"Get information for required network element","type":"(show-required-network-element)output-TOP","nickname":"show-required-network-element","consumes":["application/json","application/xml"],"parameters":[{"name":null,"description":null,"required":false,"type":"(show-required-network-element)input-TOP","paramType":"body"}],"responseMessages":null}]},{"path":"/operations/devicemanager-api:test-maintenance-mode","operations":[{"method":"POST","summary":null,"notes":"Send test pattern similar to notification that are test from algorithm","type":"(test-maintenance-mode)output-TOP","nickname":"test-maintenance-mode","consumes":["application/json","application/xml"],"parameters":[{"name":null,"description":null,"required":false,"type":"(test-maintenance-mode)input-TOP","paramType":"body"}],"responseMessages":null}]},{"path":"/operations/devicemanager-api:get-maintenance-mode","operations":[{"method":"POST","summary":null,"notes":"Get maintenance mode Configuration","type":"(get-maintenance-mode)output-TOP","nickname":"get-maintenance-mode","consumes":["application/json","application/xml"],"parameters":[{"name":null,"description":null,"required":false,"type":"(get-maintenance-mode)input-TOP","paramType":"body"}],"responseMessages":null}]},{"path":"/operations/devicemanager-api:set-maintenance-mode","operations":[{"method":"POST","summary":null,"notes":"Set maintenance mode for network element","type":"(set-maintenance-mode)output-TOP","nickname":"set-maintenance-mode","consumes":["application/json","application/xml"],"parameters":[{"name":null,"description":null,"required":false,"type":"(set-maintenance-mode)input-TOP","paramType":"body"}],"responseMessages":null}]},{"path":"/operations/devicemanager-api:clear-current-fault-by-nodename","operations":[{"method":"POST","summary":null,"notes":"try to clear alarms and sync the alarm with the devices currently connected","type":"(clear-current-fault-by-nodename)output-TOP","nickname":"clear-current-fault-by-nodename","consumes":["application/json","application/xml"],"parameters":[{"name":null,"description":null,"required":false,"type":"(clear-current-fault-by-nodename)input-TOP","paramType":"body"}],"responseMessages":null}]}],"models":{"unique_empty_identifier":{},"(config)devicemanager-api_modulePOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)devicemanager-api_modulePOST","properties":{}},"(get-required-network-element-keys)output":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:mountpoint-names":{"type":"array","items":{"type":"Optional.empty"},"description":"List of required-network-element keys that are the mountpoint-names"}},"id":"(get-required-network-element-keys)output"},"(get-required-network-element-keys)output-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:output":{"type":"object","items":{"$ref":"(get-required-network-element-keys)output"}}},"id":"(get-required-network-element-keys)output-TOP"},"(show-required-network-element)input":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:mountpoint-name":{"description":"Mountpoint-name as key of the node to be displayed.","required":true,"type":"Optional.empty"}},"id":"(show-required-network-element)input"},"(show-required-network-element)input-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:input":{"type":"object","items":{"$ref":"(show-required-network-element)input"}}},"id":"(show-required-network-element)input-TOP"},"devicemanager-api(config)required-network-element":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:mountpoint-name":{"description":"The name of the mountpoint","required":false,"type":"Optional.empty"},"devicemanager-api:status":{"description":"Status: pre-provisoning, installed, end-of-life (Later enum)","required":false,"type":"Optional.empty"},"devicemanager-api:description":{"description":"Device description","required":false,"type":"Optional.empty"}},"id":"devicemanager-api(config)required-network-element"},"(config)required-network-elementPOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)required-network-elementPOST","properties":{"mountpoint-name":{"description":"The name of the mountpoint","required":false,"type":"Optional.empty"},"status":{"description":"Status: pre-provisoning, installed, end-of-life (Later enum)","required":false,"type":"Optional.empty"},"description":{"description":"Device description","required":false,"type":"Optional.empty"}}},"devicemanager-api(config)required-network-element-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:required-network-element":{"type":"object","items":{"$ref":"devicemanager-api(config)required-network-element"}}},"id":"devicemanager-api(config)required-network-element-TOP"},"(show-required-network-element)output":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:required-network-element":{"type":"object","items":{"$ref":"devicemanager-api(config)required-network-element"}}},"id":"(show-required-network-element)output"},"(show-required-network-element)output-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:output":{"type":"object","items":{"$ref":"(show-required-network-element)output"}}},"id":"(show-required-network-element)output-TOP"},"(test-maintenance-mode)input":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:mountpoint-name":{"description":"mountpoint for test","required":true,"type":"Optional.empty"},"devicemanager-api:object-id-ref":{"description":"object id for test","required":true,"type":"Optional.empty"},"devicemanager-api:problem-name":{"description":"problem for test","required":true,"type":"Optional.empty"},"devicemanager-api:test-date":{"description":"point in time used for the test","required":true,"type":"Optional.empty"}},"id":"(test-maintenance-mode)input"},"(test-maintenance-mode)input-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:input":{"type":"object","items":{"$ref":"(test-maintenance-mode)input"}}},"id":"(test-maintenance-mode)input-TOP"},"devicemanager-api/filter(config)definition":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:object-id-ref":{"description":"object id to filter on","required":true,"type":"Optional.empty"},"devicemanager-api:problem":{"description":"name of the problem to filter","required":true,"type":"Optional.empty"}},"id":"devicemanager-api/filter(config)definition"},"(config)definitionPOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)definitionPOST","properties":{"object-id-ref":{"description":"object id to filter on","required":true,"type":"Optional.empty"},"problem":{"description":"name of the problem to filter","required":true,"type":"Optional.empty"}}},"devicemanager-api/filter(config)definition-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:definition":{"type":"object","items":{"$ref":"devicemanager-api/filter(config)definition"}}},"id":"devicemanager-api/filter(config)definition-TOP"},"devicemanager-api(config)filter":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:definition":{"type":"object","items":{"$ref":"devicemanager-api/filter(config)definition"}},"devicemanager-api:description":{"description":"Node-name as node","required":true,"type":"Optional.empty"},"devicemanager-api:start-date":{"description":"begin of maintenance-mode","required":true,"type":"Optional.empty"},"devicemanager-api:end-date":{"description":"end of maintenance-mode","required":true,"type":"Optional.empty"}},"id":"devicemanager-api(config)filter"},"(config)filterPOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)filterPOST","properties":{"definition":{"type":"object","items":{"$ref":"devicemanager-api/filter(config)definition"}},"description":{"description":"Node-name as node","required":true,"type":"Optional.empty"},"start-date":{"description":"begin of maintenance-mode","required":true,"type":"Optional.empty"},"end-date":{"description":"end of maintenance-mode","required":true,"type":"Optional.empty"}}},"devicemanager-api(config)filter-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:filter":{"type":"array","items":{"$ref":"devicemanager-api(config)filter"}}},"id":"devicemanager-api(config)filter-TOP"},"(test-maintenance-mode)output":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:result-string":{"description":"Describin if mountpoint was found and result of maintenance mode testing","required":true,"type":"Optional.empty"},"devicemanager-api:mountpoint-name":{"description":"Mountpoint-name as key of node","required":true,"type":"Optional.empty"},"devicemanager-api:node-name":{"description":"Node-name as node","required":true,"type":"Optional.empty"},"devicemanager-api:filter":{"type":"array","items":{"$ref":"devicemanager-api(config)filter"}}},"id":"(test-maintenance-mode)output"},"(test-maintenance-mode)output-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:output":{"type":"object","items":{"$ref":"(test-maintenance-mode)output"}}},"id":"(test-maintenance-mode)output-TOP"},"(get-maintenance-mode)input":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:mountpoint-name":{"description":"Mountpoint-name as key of node","required":true,"type":"Optional.empty"}},"id":"(get-maintenance-mode)input"},"(get-maintenance-mode)input-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:input":{"type":"object","items":{"$ref":"(get-maintenance-mode)input"}}},"id":"(get-maintenance-mode)input-TOP"},"(get-maintenance-mode)output":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:mountpoint-name":{"description":"Mountpoint-name as key of node","required":true,"type":"Optional.empty"},"devicemanager-api:node-name":{"description":"Node-name as node","required":true,"type":"Optional.empty"},"devicemanager-api:filter":{"type":"array","items":{"$ref":"devicemanager-api(config)filter"}}},"id":"(get-maintenance-mode)output"},"(get-maintenance-mode)output-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:output":{"type":"object","items":{"$ref":"(get-maintenance-mode)output"}}},"id":"(get-maintenance-mode)output-TOP"},"(set-maintenance-mode)input":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:mountpoint-name":{"description":"Mountpoint-name as key of node","required":true,"type":"Optional.empty"},"devicemanager-api:node-name":{"description":"Node-name as node","required":true,"type":"Optional.empty"},"devicemanager-api:filter":{"type":"array","items":{"$ref":"devicemanager-api(config)filter"}}},"id":"(set-maintenance-mode)input"},"(set-maintenance-mode)input-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:input":{"type":"object","items":{"$ref":"(set-maintenance-mode)input"}}},"id":"(set-maintenance-mode)input-TOP"},"(set-maintenance-mode)output":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:mountpoint-name":{"description":"Mountpoint-name as key of node","required":true,"type":"Optional.empty"},"devicemanager-api:node-name":{"description":"Node-name as node","required":true,"type":"Optional.empty"},"devicemanager-api:filter":{"type":"array","items":{"$ref":"devicemanager-api(config)filter"}}},"id":"(set-maintenance-mode)output"},"(set-maintenance-mode)output-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:output":{"type":"object","items":{"$ref":"(set-maintenance-mode)output"}}},"id":"(set-maintenance-mode)output-TOP"},"(clear-current-fault-by-nodename)input":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:nodenames":{"type":"array","items":{"type":"Optional.empty"},"description":"list of network-elements to clear alarms for nodenames, if list empty then all"}},"id":"(clear-current-fault-by-nodename)input"},"(clear-current-fault-by-nodename)input-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:input":{"type":"object","items":{"$ref":"(clear-current-fault-by-nodename)input"}}},"id":"(clear-current-fault-by-nodename)input-TOP"},"(clear-current-fault-by-nodename)output":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:nodenames":{"type":"array","items":{"type":"Optional.empty"},"description":"list of network-elements alarms cleared"}},"id":"(clear-current-fault-by-nodename)output"},"(clear-current-fault-by-nodename)output-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"devicemanager-api:output":{"type":"object","items":{"$ref":"(clear-current-fault-by-nodename)output"}}},"id":"(clear-current-fault-by-nodename)output-TOP"},"devicemanager-api":{"id":"devicemanager-api","properties":{"type":"service-type"}}}}';
	}
	return "";
}