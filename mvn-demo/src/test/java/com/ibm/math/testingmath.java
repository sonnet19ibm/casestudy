package com.ibm.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testingmath {

	private math math;
	
	public void setup() {
		math= new math();
	}
	
	public void testAdd() {
		assertEquals(10,math.add(5,5));
	}
	
	public void testSub() {
		assertEquals(10,math.sub(20,10));
	}

}
