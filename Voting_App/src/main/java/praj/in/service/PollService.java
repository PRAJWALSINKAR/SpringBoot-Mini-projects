package praj.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import praj.in.entity.OptionVote;
import praj.in.entity.Poll;
import praj.in.repo.PollRepository;

@Service
public class PollService {
		
		private final PollRepository pollRepository;
		
		public PollService(PollRepository pollRepository) {
			this.pollRepository = pollRepository;
		}
		public Poll createPoll(Poll poll) {
		return pollRepository.save(poll);
	}
		public List<Poll> getAllpolls() {
			
			return pollRepository.findAll();
		}
		public Optional<Poll> getPollById(Long id) {
			return pollRepository.findById(id);
		}
		
		public void vote(Long pollId, int optionIndex) {
			
			//Get poll from id
			Poll poll = pollRepository.findById(pollId)
					.orElseThrow(() -> new RuntimeException("poll is not found"));
			
			// get all option
			List<OptionVote> options = poll.getOptions();
			
			// if index for vote is not valid , throw error
			if(optionIndex < 0 || optionIndex >= options.size()) {
				throw new IllegalArgumentException("Invalid option Index");
			}
			
			//Get Selected Option
			OptionVote selectedOption = options.get(optionIndex);
			
			//Increment vote for Selected Option
			selectedOption.setVoteCount(selectedOption.getVoteCount() + 1);
			
			//Save Incremented option into the database
			pollRepository.save(poll);
			
		}

}
