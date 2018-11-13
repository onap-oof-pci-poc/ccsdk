function getSpec() {
	return '{"apiVersion":"1.0.0","swaggerVersion":"1.2","apis":[{"path":"goodbyeworld(2015-01-05)","description":null}]}';
}

function jsonFor(resource) {
	switch(resource) {
		case "goodbyeworld(2015-01-05)": return '{"apiVersion":"1.0.0","swaggerVersion":"1.2","basePath":"restconf","resourcePath":null,"produces":["application/json","application/xml"],"apis":[{"path":"/operations/goodbyeworld:greeting","operations":[{"method":"POST","summary":null,"notes":null,"type":"(greeting)output-TOP","nickname":"greeting","consumes":["application/json","application/xml"],"parameters":[{"name":null,"description":null,"required":false,"type":"(greeting)input-TOP","paramType":"body"}],"responseMessages":null}]}],"models":{"unique_empty_identifier":{},"(config)goodbyeworld_modulePOST":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","id":"(config)goodbyeworld_modulePOST","properties":{}},"(greeting)input":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"goodbyeworld:salutation":{"required":false,"type":"Optional.empty"}},"id":"(greeting)input"},"(greeting)input-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"goodbyeworld:input":{"type":"object","items":{"$ref":"(greeting)input"}}},"id":"(greeting)input-TOP"},"(greeting)output":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"goodbyeworld:response":{"required":false,"type":"Optional.empty"}},"id":"(greeting)output"},"(greeting)output-TOP":{"$schema":"http://json-schema.org/draft-04/schema","type":"object","properties":{"goodbyeworld:output":{"type":"object","items":{"$ref":"(greeting)output"}}},"id":"(greeting)output-TOP"}}}';
	}
	return "";
}