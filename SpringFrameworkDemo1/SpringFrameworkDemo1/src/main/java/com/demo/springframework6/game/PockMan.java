package com.demo.springframework6.game;

public class PockMan implements GamingConsole {

	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Get in the hole ");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("accelrated");
	}

}
