package com.gcirit.springAnno;

import org.springframework.stereotype.Component;

@Component // Non qualified and decapitilized -- > change name as("componentName")
//  @Primary annotation to handle component confusion id no primary component is declared
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("Snapdragon CPU");

	}

}
