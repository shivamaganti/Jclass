package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class Testsort {

	@Test
	void test() {
		//fail("Not yet implemented");
		DailyTasks dt = new DailyTasks();
		int[] expectarr = {1,2,3,5,5};
		int[] resultarr = dt.sortvalues(expectarr);
		assertArrayEquals(expectarr, resultarr);
	}

}
