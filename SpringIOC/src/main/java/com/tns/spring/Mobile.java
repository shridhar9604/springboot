package com.tns.spring;

public class Mobile {

	public static void main(String[] args) {
		Airtel a = new Airtel();
		a.calling();
		a.data();
		
		Jio j = new Jio();
		j.calling();
		j.data();

	}

}
