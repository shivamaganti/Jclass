package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;
import com.wipro.test.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Testsort.class,
	TestChekcPressence.class,
	TestStringConcat.class
})

public class Test_suite {
	
	public class AllTests {
		
	}
}
