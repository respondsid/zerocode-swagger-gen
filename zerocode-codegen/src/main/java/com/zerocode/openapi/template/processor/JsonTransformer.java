package com.zerocode.openapi.template.processor;

import java.util.Map;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.parser.OpenAPIV3Parser;

// TODO: Auto-generated Javadoc
/**
 * The Class JsonTransformer.
 */
@Component
public class JsonTransformer {

	/** The source. */
	@Value("${source}")
	String source;

	/** The target. */
	@Value("${target}")
	String target;
	
	/** The target. */
	@Value("${template.dir}")
	String templateDir;

	/** The template location. */
	@Autowired
	Map<String, String> templateLocation;

	/**
	 * Transform.
	 */
	public void transform() {
		OpenAPI openAPI = (new OpenAPIV3Parser()).read(source);
		openAPI.getComponents().getSchemas().keySet().forEach(p->processSchema(openAPI.getComponents().getSchemas().get(p)));
		openAPI.getPaths().keySet().stream().forEach(System.out::println);
	}

	private Consumer<? super String> processSchema(Schema object) {
		// TODO Auto-generated method stub
		System.out.print(object);
		return null;
	}

	private Object processPath(PathItem pathItem) {
		return null;
	}

}
