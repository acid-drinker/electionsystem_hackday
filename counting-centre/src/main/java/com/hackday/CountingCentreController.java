package com.hackday;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountingCentreController {
	@Autowired
	private VotingRepository votingRepositry;

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public Object[] count() {
		Object[] votes = votingRepositry.getVotes();
		return votes;
	}

	@RequestMapping(value = "/storeVotes", method = RequestMethod.POST)
	public void storeVotesFromClosedPollingStation(
			@RequestBody ArrayList<Vote> votes) {
		for (Vote vote : votes) {
			votingRepositry.save(vote);
		}
	}
}
