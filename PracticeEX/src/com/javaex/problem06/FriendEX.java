package com.javaex.problem06;
public class FriendEX {
    private String name;
    private String hp;
    private String school;
    //필요한 메소드 작성
	public FriendEX(String name, String hp, String school) {
		super();
		this.name = name;
		this.hp = hp;
		this.school = school;
	}    
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }
	
}


