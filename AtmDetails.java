public class AtmDetails
{
public static  string debitCardName;
public static int debitCardPin;
public static float debitCardNumber;
public static boolean isDebitCard;

public static void getDetails()
{
System.out.println("debit card name is:"+debitCardName);
System.out.println("debit card pin is:"+debitCardPin);
System.out.println("debit card Number:"+debitCardNumber);
System.out.println("is debit card is vallid:"+isDebitCard);
}
public static void getDebitCardPin(int debitCard_Pin)
{
System.out.println("debit Card Pin":+debitCard_Pin);
System.out.println("debit Card Pin":+debitCardPin);
}
public static  float getdebitCardNumber(float card_Number)
{
System.out.println("debit card number is":+debitCardNumber);
System.out.println("debit card number ":+card_Number);

if(debitCardNumber==card_Number)
{
	return debitCardNumber+card_Number;
}
else
{
	System.out.println("debit card number");
	return card_Number;
}
}
}