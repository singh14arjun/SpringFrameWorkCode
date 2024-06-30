package com.demo.springframework6.game.example.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {4,7,5,49,9};
	}

}
