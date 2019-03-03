package com.bonobono.springboard.vote.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bonobono.springboard.vote.vo.Vote;

@Mapper
public interface VoteMapper {
	
	// DB에 화면에서 입력 받은 값을 저장 하기위한 값이 셋팅된 Vote vo 를 매개변수로 입력 해주준다.
	int insertVote(Vote vote);
	
	// DB에 각자 채점한 점수들을 합산하여 순위를 얻어내는 검색을 한다.
	List<Map<String,Integer>> selectVoteList();
}
