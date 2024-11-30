package com.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Son {
	@Autowired
	@Qualifier(value = "mom1")
	private Mom mom3;

	public Son(Mom mom3) {
		super();
		this.mom3 = mom3;
	}

	@Override
	public String toString() {
		return "Son [mom=" + mom3 + "]";
	}

	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mom getMom() {
		return mom3;
	}

	public void setMom(Mom mom) {
		this.mom3 = mom;
	}
}
