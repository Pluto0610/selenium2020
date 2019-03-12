package com.testcase;

import org.testng.annotations.Test;

import com.busniss.loginbusiness;
import com.busniss.xztkbusiness;
import com.util.loginutil;
@Test
public class xztktestcase extends loginutil{
loginbusiness login = new loginbusiness();
xztkbusiness tk = new xztkbusiness();
public void test() throws InterruptedException {
	login.login();
login.clicklogin();
}
}