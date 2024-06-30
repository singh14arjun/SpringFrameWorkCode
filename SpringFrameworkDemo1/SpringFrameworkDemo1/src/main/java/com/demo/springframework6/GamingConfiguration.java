package com.demo.springframework6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.demo.springframework6.game.GameRunner;
import com.demo.springframework6.game.GamingConsole;
import com.demo.springframework6.game.MarioGame;
import com.demo.springframework6.game.PockMan;
import com.demo.springframework6.game.SuperContraGame;

@Configuration
public class GamingConfiguration 
{
	@Bean
	public GamingConsole game1() {
		var game=new PockMan();
		return game;
	}
	@Bean
	public GamingConsole game2() {
		var game=new MarioGame();
		return game;
	}
	
	@Bean
	@Primary
	public GamingConsole game3() {
		var game=new SuperContraGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner1() {
		var gameRunner=new GameRunner(game1());
		return gameRunner;
	}
	@Bean
	@Primary
	public GameRunner gameRunner2() {
		var gameRunner=new GameRunner(game2());
		return gameRunner;
	}
	@Bean
	public GameRunner gameRunner3() {
		var gameRunner=new GameRunner(game2());
		return gameRunner;
	}

}
