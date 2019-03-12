package com.testcase;
import org.testng.annotations.Test;

import com.busniss.loginbusiness;

import com.util.loginutil;

@Test
public class logintestcase {
	public void utils() throws InterruptedException {
loginutil util=new loginutil();
util.a4();
loginbusiness lo=new loginbusiness();
lo.login();

	}
	}