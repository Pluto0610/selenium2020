package com.testcase;

import org.testng.annotations.Test;

import com.busniss.xzbjbusiness;
import com.busniss.loginbusniss;
import com.page.classpage;
import com.util.loginutil;

public class xzbjcase  extends loginutil{
@Test
public void utils() throws InterruptedException {
loginbusniss lo=new loginbusniss();
lo.lourl();
lo.login();
classpage page=new classpage();
Thread.sleep(6000);
page.tzzb();
page.bjgl();
page.xzbj();
page.tzyb01();
page.tjjg();
Thread.sleep(6000);
page.tijiao01();
	}

}
