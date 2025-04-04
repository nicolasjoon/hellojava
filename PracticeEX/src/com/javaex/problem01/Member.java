package com.javaex.problem01;

public class Member {
	private String id;  // 회원 아이디
	private String name; // 회원 이름
	private int point;  // 회원 포인트
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public Member() {
		super();
	}
	
	public Member(String id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
}


// 1. 우측클릭  source - generate gatters setters - all 선택 - generate

// 2. 우측클릭  source - generate constructor using Fields - 전체 풀고 - generate

// 다시 우측클릭  source - generate constructor using Fields - all 선택 - generate

//회원(Member) 클래스는 회원 아이디를 나타내는 id(문자열)와 회원 이름을 