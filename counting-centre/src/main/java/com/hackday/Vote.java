package com.hackday;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vote {
	@Id
	private Integer id;

	private Integer candidateId;

	public Vote() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}

}