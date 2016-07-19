package com.hackday;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountingCentreController {
	@Autowired
	private VotingRepository votingRepositry;
	
	
	@RequestMapping(value="/count", method=RequestMethod.GET)
	public Map<String, Integer> count(){
		Map<String, Integer> votes = votingRepositry.getVotes();
		return votes;
	}
	
	@RequestMapping(value="/storeVotes", method=RequestMethod.POST)
	public void storeVotesFromClosedPollingStation(List<Vote> votes){
		for (Vote vote : votes) {
			votingRepositry.save(vote);
		}
	}
}
