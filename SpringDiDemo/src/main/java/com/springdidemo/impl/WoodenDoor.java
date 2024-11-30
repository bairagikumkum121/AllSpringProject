package com.springdidemo.impl;

import com.springdidemo.interfaces.Door;

public class WoodenDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("Wooden door open.");
	}

}
