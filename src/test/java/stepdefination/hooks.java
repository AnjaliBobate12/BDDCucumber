package stepdefination;

import io.cucumber.java.Before;

public class hooks {

	@Before("@NetBanking")
	public void netbankingSetUp() {
		System.out.println("****************************");
		System.out.println("Setup the entries in netbanking database");
	}
	@Before("@Mortage")
	public void MortageSetup() {
		System.out.println("****************************");
		System.out.println("Setup the entries in Mortage database");
	}
	public void tearDown() {
		System.out.println("****************************");
		System.out.println("clear the entries");
	}
}

//Before>>>>Background>>>>Scenario>>>>After