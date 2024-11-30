package com.springdidemo.impl;

import com.springdidemo.interfaces.Door;

public class GlassDoor implements Door{

	@Override
	public void openDoor() {
     System.out.println("Glass door open.");		
	}

}
