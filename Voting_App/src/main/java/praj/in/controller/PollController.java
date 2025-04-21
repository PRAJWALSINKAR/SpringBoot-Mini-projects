package praj.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import praj.in.entity.Poll;
import praj.in.request.Vote;
import praj.in.service.PollService;

@RestController
@RequestMapping("/api/polls")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

public class PollController {
	
						
   private PollService pollService;
   
     public PollController(PollService pollService) {
	this.pollService = pollService;
} 

	@PostMapping
	public Poll createPoll(@RequestBody Poll poll) {
		return pollService.createPoll(poll);
	}
	
	@GetMapping
	public List<Poll> getAllPolles(){
		return pollService.getAllpolls();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Poll> getAllPoll(@PathVariable Long id){
		return pollService.getPollById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/{pollId}/vote")
	public void vote(@RequestBody Vote vote) {
	    pollService.vote(vote.getPollId(), vote.getOptionIndex());
	}

	}


/*
"question": "what programming language Would you like to run ?",
"options":[
    {"voteOption": "Rust","voteCount" : 0},
    {"voteOption": "GO","voteCount" : 0},
    {"voteOption": "recat","voteCount" : 0},
    {"voteOption": "c","voteCount" : 0}
    */