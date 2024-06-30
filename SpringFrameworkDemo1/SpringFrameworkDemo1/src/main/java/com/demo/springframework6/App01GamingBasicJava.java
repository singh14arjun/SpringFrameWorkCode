package com.demo.springframework6;

import com.demo.springframework6.game.GameRunner;
import com.demo.springframework6.game.PockMan;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game=new MarioGame();
		
//		var game =new SuperContraGame();
		var game=new PockMan();
       var gamRunner=new GameRunner(game);
       gamRunner.run();
	}

}
