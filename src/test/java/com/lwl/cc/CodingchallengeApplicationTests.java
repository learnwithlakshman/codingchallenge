package com.lwl.cc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lwl.cc.service.CodingQuestionsService;

@SpringBootTest
class CodingchallengeApplicationTests {
	
	@Autowired
	private CodingQuestionsService codingService;

	

	@Test
	public void primeCountTest() {
		int res = codingService.countPrimes(new int[] {2,3,5,7,9,10,6});
		assertEquals(4, res);
	}
	
	@Test
	public void biggestOfThreeNumbers() {
		int res = codingService.biggest(2,4,9);
		assertEquals(9, res);
	}
	
	@Test
	public void biggestOfNnumbers() {
		int res = codingService.biggest(2,3,5,7,9,10,6);
		assertEquals(10, res);
	}
	
}
