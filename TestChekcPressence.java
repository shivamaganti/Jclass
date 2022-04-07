package com.wipro.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestChekcPressence {

	@Test
	void test() {
		//fail("Not yet implemented");
		DailyTasks dt = new DailyTasks();
		assertTrue(dt.checkpressence("shiva", "a"));
		assertFalse(dt.checkpressence("chandu", "s"));
	}

}
