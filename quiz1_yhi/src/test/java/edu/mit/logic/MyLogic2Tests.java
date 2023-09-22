package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;



@Log4j
public class MyLogic2Tests {
	
	@Test
	public void test() {
		MyLogic2 myLogic2 = new MyLogic2();
		log.info(myLogic2.addUp(1, 10));
		log.info(myLogic2.evenAddUp(1, 10));
	}
	
}









