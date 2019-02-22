package com.lesson10One;

public enum Langues {
/*
	PYTHON,
	JAVA,
	GO;
	*/
	
	

	PYTHON ("djano","id"),
	JAVA("eclips","swift"),
	GO("new ","google");
	
	private String name="";
	private String ide="";
	
	private Langues(String name, String ide) {
		this.name = name;
		this.ide = ide;
	}

	public String getIde() {
		return "the IDE :"+ide.toString().toUpperCase();
	}
	
	
	
}
