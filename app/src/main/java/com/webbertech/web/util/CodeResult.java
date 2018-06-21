package com.webbertech.web.util;

public class CodeResult {
	String stdout;
	String exception;
	
	public CodeResult() {}
	
	public CodeResult(String stdout, String exception) {
		super();
		this.stdout = stdout;
		this.exception = exception;
	}

	/**
	 * @return the stdout
	 */
	public String getStdout() {
		return stdout;
	}

	/**
	 * @param stdout the stdout to set
	 */
	public void setStdout(String stdout) {
		this.stdout = stdout;
	}

	/**
	 * @return the exception
	 */
	public String getException() {
		return exception;
	}

	/**
	 * @param exception the exception to set
	 */
	public void setException(String exception) {
		this.exception = exception;
	}
   	
}