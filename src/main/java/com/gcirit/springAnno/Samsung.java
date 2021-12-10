package com.gcirit.springAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Non qualified and decapitilized -- > change name as("componentName")

public class Samsung {

	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("OCta Core, 4GB Ram, 12MP Camera");
		cpu.process();
	}

}
