package com.page;

import org.openqa.selenium.By;

public class tikupage  extends loginpage{
//��ת����߿��
public void tzzb() {
	driver.switchTo().frame("menu");
}

//������
public void tkgl() {
	driver.findElement(By.linkText("������")).click();
}
//�������
public void xztk() {
	 driver.findElement(By.linkText("�������")).click();

}
//��ת�����
public void tzyb() {
	 driver.switchTo().defaultContent();
     driver.switchTo().frame("main");
}
//�����������
public void tkmc() {
	driver.findElement(By.name("d_name")).sendKeys("MySQL");
	
}
//����ύ
public void tijiao() {
	driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
}
}