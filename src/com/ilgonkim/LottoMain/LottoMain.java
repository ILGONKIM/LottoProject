package com.ilgonkim.LottoMain;

public class LottoMain {

	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		int numbers[]  = lotto.generate();
		
		for(int num: numbers) {
			System.out.println(num + ".");
		}
			
		
	}
	
	

}
