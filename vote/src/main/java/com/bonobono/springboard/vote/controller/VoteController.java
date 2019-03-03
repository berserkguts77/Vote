package com.bonobono.springboard.vote.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bonobono.springboard.vote.service.VoteService;
import com.bonobono.springboard.vote.vo.Vote;

@Controller
public class VoteController {
	@Autowired
	private VoteService voteService;
	
	// vote 입력 폼 get방식
	@GetMapping("vote")
	public String addVote() {
		System.out.println("addVote Get");
		return "vote";
	}
		
	// vote 입력 처리 post방식
	@PostMapping("/voteAction")
	public String addVote(Vote vote, HttpServletRequest request) {
		System.out.println("voteAction Post");
		vote.setIp(request.getRemoteAddr());
		voteService.addVote(vote);
		System.out.println(vote+"vote 확인");
		
		return "redirect:/index"; 
	}
	
	// index로 보내기
	@GetMapping("index")
	public String index() {
		System.out.println("index Get");
		return "index";
	}
	
	// vote 순위 채점 결과 검색
	@GetMapping("voteResult")
	public String getVoteList(Model model) {
		System.out.println("vote 결과 및 순위 확인");
		List<Map<String,Integer>> list = voteService.getVoteList();
		model.addAttribute("list", list);
		System.out.println("list ->"+list);
		return "voteResult";
	}
}
