package com.hackday;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface VotingRepository extends Repository<Vote, Long>{
	@Query("select candidateId, count(1) from Vote v group by candidateId")
	public Object[] getVotes();
	
	public void save(Vote vote);
}
