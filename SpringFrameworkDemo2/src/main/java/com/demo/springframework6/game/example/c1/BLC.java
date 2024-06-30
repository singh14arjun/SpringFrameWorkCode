package com.demo.springframework6.game.example.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BLC {
	private DataService dataService;

	public BLC(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
