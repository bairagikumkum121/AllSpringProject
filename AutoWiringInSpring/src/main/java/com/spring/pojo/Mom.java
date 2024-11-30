package com.spring.pojo;

public class Mom {
private String name;
private String sonName;

@Override
public String toString() {
	return "Mom [name=" + name + ", sonName=" + sonName + "]";
}

public Mom() {
	super();
	// TODO Auto-generated constructor stub
}

public Mom(String name, String sonName) {
	super();
	this.name = name;
	this.sonName = sonName;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSonName() {
	return sonName;
}

public void setSonName(String sonName) {
	this.sonName = sonName;
}
}
