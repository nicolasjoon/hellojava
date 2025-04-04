package com.javaex.problem06;

import java.util.Scanner;

public class FriendAppEX {
    public static void main(String[] args) {
    	Friend[] friendArray = new Friend[3];  //Friend 타입의 객체만 받을 수 있다.
        Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해 주세요"); 
        
        //친구 정보 입력 받기 (스캐너 1)
        String temp = sc.nextLine();
        
        // 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
        String[] tempArr = temp.split(" ");
        
        System.out.println(tempArr[0]); 
        System.out.println(tempArr[1]);
        System.out.println(tempArr[2]);
        
        // Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
        Friend f = new Friend();
        f.setName(tempArr[0]);
        
        
        for (int i = 0; i < friendArray.length; i++) {
        temp = sc.nextLine();
        
        String[] tempArr = temp.split (" ");
        
        String name = tempArr[0];
        String hp = tempArr[1];
        String school = tempArr[2];
        
        friendArray[i] = new Friend(name, hp, school);
        }
        
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo(); 
        }                                                         
            // 친구정보 입력받기
            // 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
            // Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
            // 배열에 추가하기 ( friendArray <- friend객체 )
            //친구정보 출력 메소드 호출
    
        sc.close();
    }
}

// 정우성 010-2222-3333 초 
// 이효리 010-3232-6666 중
// 이정재 010-5434-9999 고


