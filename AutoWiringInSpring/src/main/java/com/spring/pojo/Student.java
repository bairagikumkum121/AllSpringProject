package com.spring.pojo;

public class Student {
	private Teacher teacher;
	private int sid;
	private String sname;

	@Override
	public String toString() {
		return "Student [teacher=" + teacher + ", sid=" + sid + ", sname=" + sname + "]";
	}

	public Student(Teacher teacher, int sid, String sname) {
		super();
		this.teacher = teacher;
		this.sid = sid;
		this.sname = sname;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
