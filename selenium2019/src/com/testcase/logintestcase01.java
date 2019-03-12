package com.testcase;

import org.testng.annotations.Test;
import com.busniss.loginbusniss;
import com.page.tiku01;
import com.util.loginutil;
public class logintestcase01 extends loginutil{
	@Test
	
	public void utils() throws InterruptedException {
loginbusniss lo=new loginbusniss();
lo.lourl();
lo.login();
tiku01 t=new tiku01();
Thread.sleep(2000);
t.tiku_gl();
t.tk();
t.zt();
t.tksm();
t.tijiao();
Thread.sleep(2000);
t.cg();
	}
}