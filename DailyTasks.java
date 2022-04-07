package com.wipro.task;
import java.util.Arrays;

public class DailyTasks {

	public String dostring_concat(String s1, String s2) {
		String s3 = s1 + s2;
		return s3;
	}
	
	public int[] sortvalues(int[] arrays) {
		Arrays.sort(arrays);
		return arrays;
	}
	
	public boolean checkpressence(String str, String a) {
		return str.contains(a);
	}

}
