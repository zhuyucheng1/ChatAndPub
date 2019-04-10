package com.just.util;

import java.util.UUID;

public class SysUUID {

	public static String getId() {
		return UUID.randomUUID().toString().replaceAll("-","");
	}
}
