package com.hackday;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PollingStationController {
	@Autowired
	private VotesRepository votesRepository;
	
	private boolean isClosed = false;
	
	@RequestMapping(value="/close")
	public void close(){
		isClosed = true;
		
		List<Vote> allVotes = votesRepository.findAll();
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForLocation("http://vmlin907:5303/storeVotes", allVotes);
	}
	
	@RequestMapping(value="castVote", method=RequestMethod.POST)
	public void castVote(Vote vote){
		if(! isClosed){
			votesRepository.save(vote);
		}
	}
}
