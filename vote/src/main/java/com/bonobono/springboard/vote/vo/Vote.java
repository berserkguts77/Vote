package com.bonobono.springboard.vote.vo;

import org.springframework.stereotype.Component;

@Component
public class Vote {
	private String ip;
	private int team;
	private int completion;
	private int ui;
	private int ux;
	private int collaboration;
	private int presentation;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public int getCompletion() {
		return completion;
	}
	public void setCompletion(int completion) {
		this.completion = completion;
	}
	public int getUi() {
		return ui;
	}
	public void setUi(int ui) {
		this.ui = ui;
	}
	public int getUx() {
		return ux;
	}
	public void setUx(int ux) {
		this.ux = ux;
	}
	public int getCollaboration() {
		return collaboration;
	}
	public void setCollaboration(int collaboration) {
		this.collaboration = collaboration;
	}
	public int getPresentation() {
		return presentation;
	}
	public void setPresentation(int presentation) {
		this.presentation = presentation;
	}
	@Override
	public String toString() {
		return "Score [ip=" + ip + ", team=" + team + ", completion=" + completion + ", ui=" + ui + ", ux=" + ux
				+ ", collaboration=" + collaboration + ", presentation=" + presentation + "]";
	}
	
}
