package com.springdidemo2.entity;

public class Container {
	private ABC ref1;
	private PQR ref2;

	public ABC getRef1() {
		return ref1;
	}

	public void setRef1(ABC ref1) {
		this.ref1 = ref1;
		System.out.println("ref1 callesd.");
	}

	public PQR getRef2() {
		return ref2;
	}

	public void setRef2(PQR ref2) {
		this.ref2 = ref2;
		System.out.println("ref2 called.");
	}

	public Container(ABC ref1, PQR ref2) {
		this.ref1 = ref1;
		this.ref2 = ref2;
		System.out.println("Patametrized container called.");
	}

	public Container() {
	}
}
