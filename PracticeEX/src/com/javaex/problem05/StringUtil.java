package com.javaex.problem05;

public class StringUtil {
    	public static String concatString(String[] arr) {
            
    		String result = "";  // 빈 문자열 생성
            
            // 배열의 각 요소를 result 문자열에 추가
            for (int i = 0; i < arr.length; i++) {
                result = result + arr[i];
            }
            
            return result; // 최종 문자열 반환
        }

    }


// String temp = arr[0] + arr[1] + arr[2];
 
   // return temp;

// 결국 반복문으로 돌린다