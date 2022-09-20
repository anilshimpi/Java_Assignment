package com.yash.java8.multithreading8;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // First Thread Demo

	       Runnable thread1 = () -> {
	            for (int i = 1; i <= 10; i++) {
	                System.out.println("Value Of I Is " + i);
	                try {
	                    Thread.sleep(5000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };



	       Thread t = new Thread(thread1);
	        t.setName("Eren");
	        t.start();



	       Runnable thread2 = () -> {
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(i * 2);
	                try {
	                    Thread.sleep(2000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };
	        
	        Thread t2=new Thread(thread2);
	        t2.setName("TableThread");
	        t2.start();
	}

}
