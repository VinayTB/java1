public class LapTopTester1
{
  public static void main(String args[])
  {
  LapTop1.lapTopName = "lenovo";
  LapTop1.numberNumbers = 10;
  LapTop1.funcButton = 12;
  LapTop1.workCond = 'W';
  if(LapTop1.lapTopName=="lenovo")
  {
  System.out.println("Laptop name is correct:"+LapTop1.lapTopName);
  }
  else{
	  System.out.println("laptop ame is incorrect:"+LapTop1.lapTopName);
  }
  if(LapTop1.numberNumbers==10)
  {
    System.out.println("Number of numbers is correct:"+LapTop1.numberNumbers);
  }
else{
     System.out.println("number of number is incorrect:"+LapTop1.numberNumbers);
  }
  if(LapTop1.funcButton==12)
  {	  
    System.out.println("function keys is correct:"+LapTop1.funcButton);
  }
  else{
     System.out.println("function keys is incorrect:"+LapTop1.funcButton);
  }
if(LapTop1.workCond=='W')
  {	  
	System.out.println("Working condition is start:"+LapTop1.workCond);
  }
  else{
     System.out.println("working condition not start:"+LapTop1.workCond);
  }	 
    System.out.println("Number Of laptops:"+LapTop1.numberOfLapTops);  
    System.out.println("Login Hours:"+LapTop1.loginHours);
    System.out.println("Owner number:"+LapTop1.ownerNum);
    System.out.println("Cost of laptop:"+LapTop1.totalCost);
    System.out.println("Is this machine:"+LapTop1.isThisMachine);
    System.out.println("Available for sale:"+LapTop1.availableSale);
	}
	
}