/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.base.database;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * This class is used to define default for JSON Serialization and Deserialization for the project at a single place
 */
public class JsonMapperBase extends ObjectMapper {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = LoggerFactory.getLogger(JsonMapperBase.class);

    public JsonMapperBase() {

        setVisibility(PropertyAccessor.ALL, Visibility.NONE);
        setVisibility(PropertyAccessor.FIELD, Visibility.ANY);

        // Deserialization
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);

        // Serialization
        configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        getFactory().configure(Feature.ESCAPE_NON_ASCII, true);
    }

    public JsonMapperBase(int t) {

    	switch(t) {
    		case 0:
    			break;
	    	case 1:
	    		setVisibility(PropertyAccessor.ALL, Visibility.NONE);
	    		setVisibility(PropertyAccessor.FIELD, Visibility.DEFAULT);
	    		break;
	    	case 2:
	    		setVisibility(PropertyAccessor.ALL, Visibility.NONE);
	    		setVisibility(PropertyAccessor.FIELD, Visibility.PROTECTED_AND_PUBLIC);
	    		break;
	    	case 3:
	    		setVisibility(PropertyAccessor.ALL, Visibility.NONE);
	    		setVisibility(PropertyAccessor.GETTER, Visibility.ANY);
	    		setVisibility(PropertyAccessor.IS_GETTER, Visibility.ANY);
	    		break;
	    	default:
	    		setVisibility(PropertyAccessor.ALL, Visibility.NONE);
	            setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
	    		break;

    	}

        // Deserialization
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);

        // Serialization
        configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        getFactory().configure(Feature.ESCAPE_NON_ASCII, true);
    }



    public String objectToJson( Object object ) {
        String res = null;

        try {

        	res = writeValueAsString(object);

        } catch (JsonGenerationException e) {
            LOG.debug(e.toString());
        } catch (JsonMappingException e) {
            LOG.debug(e.toString());
        } catch (IOException e) {
            LOG.debug(e.toString());
        } catch (Exception e) {
            LOG.debug(e.toString());
        }

        return res;
    }

    public String objectListToJson( List<? extends Object> objectList ) {
        String res = null;

        try {

            StringWriter stringEmp = new StringWriter();
            writeValue(stringEmp, objectList);
            res = stringEmp.toString();
            stringEmp.close();

        } catch (JsonGenerationException e) {
            LOG.debug(e.toString());
        } catch (JsonMappingException e) {
            LOG.debug(e.toString());
        } catch (IOException e) {
            LOG.debug(e.toString());
        } catch (Exception e) {
            LOG.debug(e.toString());
        }

        return res;
    }

}
