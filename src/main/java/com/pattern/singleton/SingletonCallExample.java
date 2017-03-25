package com.pattern.singleton;
public class SingletonCallExample {

	/**
	 * Sample to check java native class using singleton
	 */
	public static void main(String[] args) {
		Runtime myRunTime = Runtime.getRuntime();
		myRunTime.gc();
		System.out.println(myRunTime);
		Runtime secRunTime = Runtime.getRuntime();
		System.out.println(secRunTime);
		secRunTime.gc();
		if (myRunTime == secRunTime) {
			System.out.println("Both are same");
		}
	}

}
