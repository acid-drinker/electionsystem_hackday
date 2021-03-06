package com.hackday;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface VotesRepository extends Repository<Vote, Long>{
	public List<Vote> findAll();

	public void save(Vote vote);
}
