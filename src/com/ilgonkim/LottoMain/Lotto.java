package com.ilgonkim.LottoMain;
import java.util.Random;

public class Lotto {
	
	public int[] generate(int count) {
		int[] result = new int[count];
		
		//36개의 코드 중에 6개를 랜덤으로 출력
		Random random = new Random();
		
		for(int i=0; i<count; i++)
		{
			int randomNumber = random.nextInt(35) + 1;
			
			System.out.println("test");
			if(!isExit(randomNumber, result)) {
				result[i] = randomNumber;
				i = i + 1;
			}else {
				i = i - 1;
			
			}
		
		}
		return result; 
		
	}
	
	private boolean isExit(int randomNumber, int randomArray[])
	{
		boolean result = false;
		for(int num: randomArray) {
			if(num == randomNumber) 
				result = true; 
		}
		
		System.out.println(result);
		return result;
	}
	
	final int DEFAULT_COUNT = 6;
	
	public int[] generate() {
	
		return generate(DEFAULT_COUNT);
	}
	
}
