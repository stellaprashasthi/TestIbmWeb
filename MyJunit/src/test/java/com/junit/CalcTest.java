package com.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CalcTest {
	Calc c;
	@BeforeAll
	static void initAll() {
		System.out.println("Test Started");
	}
	@AfterAll
	static void destroyAll() {
		System.out.println("Test Completed");
	}
	@BeforeEach
	void init() {
		c = new Calc();
	}
	
	@AfterEach
	void destroy() {
		System.out.println("Test done");

}
	@Test
	void calcAvg() {
		Calc c = new Calc();
		assertEquals(15,c.avg(10, 20),"Logic Error in Method");
		System.out.println("Avg Test Completed");
	}
	@Test
	void calcAdd() {
		Calc c = new Calc();
		assertEquals(c.expectedAdd,c.add(10, 20),"Add Logic Error in Method");
		System.out.println("Tests Completed");
	}
	

}
