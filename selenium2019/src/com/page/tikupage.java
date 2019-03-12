package com.page;

import org.openqa.selenium.By;

public class tikupage  extends loginpage{
//跳转到左边框架
public void tzzb() {
	driver.switchTo().frame("menu");
}

//题库管理
public void tkgl() {
	driver.findElement(By.linkText("题库管理")).click();
}
//新增题库
public void xztk() {
	 driver.findElement(By.linkText("新增题库")).click();

}
//跳转回左边
public void tzyb() {
	 driver.switchTo().defaultContent();
     driver.switchTo().frame("main");
}
//输入题库名称
public void tkmc() {
	driver.findElement(By.name("d_name")).sendKeys("MySQL");
	
}
//点击提交
public void tijiao() {
	driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
}
}