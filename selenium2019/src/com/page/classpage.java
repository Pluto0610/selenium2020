package com.page;

import org.openqa.selenium.By;

import com.util.loginutil;

public class classpage extends loginutil{
	//��ת�����
	public void tzzb() {
		driver.switchTo().frame("menu");
		driver.findElement(By.className("tmc_menu_user")).click();
	}


	public void bjgl() {
		driver.findElement(By.linkText("�༶����")).click();
	}
	//�����༶
	public void xzbj() {
		driver.switchTo().parentFrame();
		driver.switchTo().frame("main");
		 driver.findElement(By.linkText("�����༶")).click();

	}
	//��ת�����
	public void tzyb01() {
		 driver.switchTo().defaultContent();
	     driver.switchTo().frame("main");
	}
	//����༶����
	public void tjjg() {
		driver.findElement(By.name("b_name")).sendKeys("�����İ�");
		
	}
	//����ύ
	public void tijiao01() {
		driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
		
}

