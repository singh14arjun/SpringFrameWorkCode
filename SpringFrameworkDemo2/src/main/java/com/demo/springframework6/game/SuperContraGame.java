package com.demo.springframework6.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGame")
public class SuperContraGame implements GamingConsole {
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
