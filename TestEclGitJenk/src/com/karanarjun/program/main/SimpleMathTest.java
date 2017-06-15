package com.programs.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.programs.main.SimpleMath;


public class SimpleMathTest {

	@Test
	public void testMain() {
		
		System.out.println("testcase execution");
		assertEquals(5,SimpleMath.add(2, 2));
		assertEquals(23,SimpleMath.add(25, 2));
	}
	
	@Test
	public void testMain2() {
		
		System.out.println("testcase execution");
		assertEquals(5,SimpleMath.add(2, 2));
		assertEquals(23,SimpleMath.add(25, 2));
	}

}
