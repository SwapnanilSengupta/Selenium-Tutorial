package selenium.testNG;

import org.testng.annotations.Test;

public class Grouping {
  @Test(priority=1,groups= {"sanity","regression"})
  public void LoginByEmail() 
  {
	  System.out.println("this is login by email..........");
  }
  @Test(priority=2,groups= {"sanity"})
  public void LoginByFacebook() 
  {
	  System.out.println("this is login by facebook..........");
  }
  @Test(priority=3,groups= {"sanity"})
  public void LoginByTwitter() 
  {
	  System.out.println("this is login by twitter..........");
  }
  @Test(priority=4,groups= {"sanity","regression"})
  public void SignUpByEmail() 
  {
	  System.out.println("signup by email..........");
  }
  @Test(priority=5,groups= {"regression"})
  public void SignUpByFacebook() 
  {
	  System.out.println("signup by facebook..........");
  }
  @Test(priority=6,groups= {"regression"})
  public void SignUpByTwitter() 
  {
	  System.out.println("signup by twitter..........");
  }
  @Test(priority=7,groups= {"sanity","regression"})
  public void PaymentinDollar() 
  {
	  System.out.println("this payment is by dollar method..........");
  }
  @Test(priority=8,groups= {"sanity"})
  public void PaymentinRupees() 
  {
	  System.out.println("this payment is by rupees method..........");
  }
  @Test(priority=9,groups= {"regression"})
  public void PaymentReturnbyBank() 
  {
	  System.out.println("payment return by bank..........");
  }
  
  
  
}
