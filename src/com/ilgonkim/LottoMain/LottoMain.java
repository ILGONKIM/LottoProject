package com.ilgonkim.LottoMain;

public class LottoMain {

	public static void main(String[] args) {
		// 주석을 추가했습니다.
		
		Lotto lotto = new Lotto();
		int numbers[]  = lotto.generate();
		
		for(int num: numbers) {
			System.out.println(num + ".");
		}
			
		
	}
	
	

}
