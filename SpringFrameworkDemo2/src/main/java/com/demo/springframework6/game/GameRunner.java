package com.demo.springframework6.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
 private GamingConsole game;
  
	
public GameRunner(@Qualifier("SuperContraGame") GamingConsole game) {
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
