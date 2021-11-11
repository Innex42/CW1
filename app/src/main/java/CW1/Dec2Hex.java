package CW1;
import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static String convert(String args[]){
	 try{

        Arg1 = Integer.parseInt(args[0]);
}

	catch(Exception e){System.out.println("Invaild input"); return "-1";}
	

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
	String hexadecimal="";
        num = Arg1;
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
	System.out.println(num);
        if (num==0){
		return "0";
	}else if (num <=-1){
		return "-1";}
	while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

	return hexadecimal;
        
	}
    public static void main(String args[])
    {
	String Result = convert(args);
	if (Result=="-1"){
		System.out.println("Invalid Input");
		return;}
	System.out.println("Hexadecimal representation is: " + Result);
    }
}
