package regressiontest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase {

	@BeforeTest()
	public void launchchrome() throws InterruptedException
	{
		Methods.launch(); //load momentable signup page in chrome browser
	}
	
	@Test
	public static void Signupscenerio() throws IOException, InterruptedException
	{ 	
		
		//Methods.Signupform(0);//Signup scenarios
		//Methods.Signupform(2); //successfull signup
		//Methods.linkclick(Locators.confmsignin);
		//Methods.Loginform(3);	  //Login scenarios
		//Methods.forgotpassword(5);
		Methods.resetpassordgmail();
		Methods.Resetpassword(6);
		//Methods.forgotpassword(4);
		//Methods.forgotpassword(5);
		
		//Methods.momentablewallet();
		//Methods.collectedtab();
		//Methods.startsale();
		//Methods.startsalecancel();
		Methods.linkclick(Locators.momentables);
		Methods.startsaleclosetesnet();
		Methods.linkclick(Locators.momentables);
		Methods.moment_diconnectwallet();
		
		Methods.linkclick(Locators.momentables);
		Methods.Setsale_diconnectwallet();
		//Methods.ForSaletab();
		//Methods.emailotp();
	}





}


