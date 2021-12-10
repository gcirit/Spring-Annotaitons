package com.gcirit.springAnno;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

	public void process() {
		System.out.println("MediaTek CPU");

	}

}
