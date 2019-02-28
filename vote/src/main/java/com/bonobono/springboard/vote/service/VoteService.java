package com.bonobono.springboard.vote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bonobono.springboard.vote.mapper.VoteMapper;
import com.bonobono.springboard.vote.vo.Vote;

@Service
@Transactional
public class VoteService {
	@Autowired
	private VoteMapper voteMapper;
	
	// insert
	public int addVote(Vote vote) {
		return voteMapper.insertVote(vote);
	}
	
	// 순위 검색
	public List<Vote> getVoteList(){
		return voteMapper.selectVoteList();
	}
	
}
