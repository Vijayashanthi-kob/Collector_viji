package regressiontest;

import org.openqa.selenium.By;

public class Locators {
//Signup locators
	public static By Fname=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[1]/input");
	public static By Lname=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[2]/input");
	public static By email=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[3]/input");
	public static By password=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[4]/input");
	public static By confmpass=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[5]/input");
	public static By terms=By.id("terms");
	public static By signupbtn=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[7]");
//Login page locators	
	public static By loginemail=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[1]/input");
	public static By loginpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[2]/div/input");
	public static By loginbtn=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[4]/button");
	public static By fogotpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[3]/a");
	public static By signup=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[4]/div/div/a");
	public static By signin=By.xpath("//*[@id=\"__next\"]/div/div/div/form/div[8]/span[2]");
	public static By confmsignin=By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div/div/span[2]");
	public static By momentables=By.xpath("//*[@id=\"__next\"]/div/div/div/div[1]/div[2]/nav/a[2]/span");
//momentable screen locators
	public static By walletmom=By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/main/div/div/div/button");
	
	public static By walletemail=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[3]/input");
	                                      
	public static By walletsignimn=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button/div[2]");
	
	public static By wallet_frame=By.xpath("//*[@id=\"FCL_IFRAME\"]");
	public static By bloctosignin=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button/div[2]");
	public static By bloctoconfm=By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/button[1]/div[2]");
	
	public static By collectedtab=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div[1]");
	public static By nomoment=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/h1");
	
	public static By forsaletab=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div[2]");
	
	public static By grid=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[3]/section/div/div/div");
	public static By startsalebtn=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[2]/div[2]/div[1]/button");
	public static By setprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[1]/div[2]/div[2]/div[3]/div/input");
	public static By publislist=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/button");
	public static By yeslist=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
	public static By cancellist=By.xpath("/html/body/div[2]/div/div[6]/button[3]");
	
	public static By testnetapprove=By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/button/div[2]");
	public static By ok=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
	public static By stopselling=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[3]/div[2]/div[1]/button");
	public static By closetestnet=By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[2]/span/svg");
	public static By transcancel=By.xpath("//*[@id=\"swal2-title\"]");
	
	public static By successok=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
	public static By stopsale=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[2]/div[2]/div[1]/button");
	public static By yesstop=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
	public static By cancelstop=By.xpath("/html/body/div[2]/div/div[6]/button[3]");
	public static By threedot=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/span/svg/path[2]");
	public static By copylink =By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[4]/section/div/div[1]/div/div[1]/div/ul/li[3]");

	
	public static By path= By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div[1]/span[1]");
	
	public static By forgotpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div/div[3]/a");
	public static By emailforgot=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[1]/input");
	public static By forgotbtn=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[1]/button");
	
	public static By summaryprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/div[2]/div");
	public static By totalprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/div[3]/table/tbody/tr[2]/td[2]");
	public static By Onsaleprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/div[4]/table/tbody/tr[3]/td[2]");
	public static By minproprice=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/div[2]/div/div[2]/div/div[4]/table/tbody/tr[4]/td[2]");
	public static By walleticon=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div/img");
	public static By connnetwalletmsg=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/div/h1/text()");
	public static By loading=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/main/div/p");
	
	public static By emailone=By.xpath("//*[@id=\":67\"]");
	public static By newpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[1]/input");
	public static By confirmnew=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[2]/input");
	public static By submitpass=By.xpath("//*[@id=\"__next\"]/div/div/div[2]/form/div[2]/button");
}

