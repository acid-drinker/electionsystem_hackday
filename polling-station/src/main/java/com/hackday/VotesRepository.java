package com.hackday;

import java.util.List;

public interface VotesRepository {
	public List<Vote> getAll();

	public void save(Vote vote);
}
