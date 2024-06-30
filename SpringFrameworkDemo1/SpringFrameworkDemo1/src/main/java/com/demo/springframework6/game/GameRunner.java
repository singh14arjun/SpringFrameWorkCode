package com.demo.springframework6.game;

public class GameRunner {
 private GamingConsole game;
  
	

public GameRunner(GamingConsole game) {
	super();
	this.game = game;
}

public void run() {
System.out.println("Running Game : "+game);	
game.up();
game.down();
game.left();
game.right();
}
 
}
