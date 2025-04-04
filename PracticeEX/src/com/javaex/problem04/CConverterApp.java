package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {
        // 환율 설정
        CConverter.setRate(1464.7);

        // 원화 → 달러 변환
        double won = 1000000;
        double dollar = CConverter.toDoller(won);
        System.out.println("백만원은 " + dollar + " 달러입니다.");

        // 달러 → 원화 변환
        double usd = 100;
        double krw = CConverter.toKRW(usd);
        System.out.println("백달러는 " + krw + " 원입니다.");
    }
}


