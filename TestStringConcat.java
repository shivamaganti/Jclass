package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestStringConcat {

	@Test
	void test() {
		DailyTasks con = new DailyTasks();
		
		assertEquals("shivachandu", con.dostring_concat("shiva", "chandu")); 
	}

}
