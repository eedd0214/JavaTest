package com.test2;

interface Cake{
	public void showCakeSize();
	
}
class CheeseCake implements Cake{
	public void showCakeSize() {
		System.out.println("CheeseCake");
	}
}
	
public class Test3 {
	public static void main(String[] args) {
		CheeseCake c =new CheeseCake();
		c.showCakeSize();
		Cake c2 =new CheeseCake();
		c2.showCakeSize();
		
	}
}