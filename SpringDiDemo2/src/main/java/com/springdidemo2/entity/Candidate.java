package com.springdidemo2.entity;

import java.util.Properties;

public class Candidate {
	private Properties interviews;

	public Candidate() {
	}

	public Candidate(Properties interviews) {
		super();
		this.interviews = interviews;
	}

	public Properties getInterviews() {
		return interviews;
	}

	public void setInterviews(Properties interviews) {
		this.interviews = interviews;
	}

}
