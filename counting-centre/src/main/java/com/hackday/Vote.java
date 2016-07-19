package com.hackday;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vote {
	@Id
	private int id;
	
	private int candidateId;

	public Vote(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
}
