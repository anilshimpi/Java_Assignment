package com.yash.stringproblems;

//WAP to demonstrate how garbage collector work when any memory is not referenced by string object.
public class Task7_GarbageCollector {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
//		Task7 s = new Task7();//unreference
//		s = null;
//		System.gc();
		Task7_GarbageCollector s2 = new Task7_GarbageCollector();//reference
		Task7_GarbageCollector s3 = new Task7_GarbageCollector();
		s2=s3;
		System.gc();

	}

}
