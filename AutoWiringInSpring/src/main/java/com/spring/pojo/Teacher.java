package com.spring.pojo;

public class Teacher {
	private int tid;
	private String tname;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}

	public Teacher(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
}
