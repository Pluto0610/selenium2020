package com.page;

import org.openqa.selenium.By;

import com.util.loginutil;

public class classpage extends loginutil{
	//跳转到左边
	public void tzzb() {
		driver.switchTo().frame("menu");
		driver.findElement(By.className("tmc_menu_user")).click();
	}


	public void bjgl() {
		driver.findElement(By.linkText("班级管理")).click();
	}
	//新增班级
	public void xzbj() {
		driver.switchTo().parentFrame();
		driver.switchTo().frame("main");
		 driver.findElement(By.linkText("新增班级")).click();

	}
	//跳转回左边
	public void tzyb01() {
		 driver.switchTo().defaultContent();
	     driver.switchTo().frame("main");
	}
	//输入班级名称
	public void tjjg() {
		driver.findElement(By.name("b_name")).sendKeys("测试四班");
		
	}
	//点击提交
	public void tijiao01() {
		driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
		
}

