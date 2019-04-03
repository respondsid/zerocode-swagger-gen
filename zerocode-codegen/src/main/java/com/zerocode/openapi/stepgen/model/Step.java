package com.zerocode.openapi.stepgen.model;

import java.util.Map;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Instantiates a new step.
 */

/**
 * Instantiates a new step.
 */
@Data

/** The Constant log. */

/** The Constant log. */
@Slf4j
@Builder
public class Step {

	/** The path. */
	String path;

	/** The operation. */
	String operation;

	/** The url. */
	String url;

	/** The request body. */
	String requestBody;

	/** The response body. */
	String responseBody;

	/** The seperator. */
	String seperator = ",";

	/** The request. */
	Map<String, Object> request;
	
	/** The response. */
	Map<String, Object> response;

	/**
	 * Reset seperator.
	 */
	public void resetSeperator() {
		this.seperator = "";
	}
}
