package com.springdidemo.entity;

import com.springdidemo.interfaces.Door;

public class Car {
	private Door door;

	public Car() {
	}

	public Car(Door door) {
		super();
		this.door = door;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public void unlock() {
		door.openDoor();
	}
}
