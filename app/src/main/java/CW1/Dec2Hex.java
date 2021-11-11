package CW1;
import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static boolean ArrayError=false;
    public static boolean NumberError=false;
    public static String convert(String args[]){
	 try{

        Arg1 = Integer.parseInt(args[0]);

        }catch(ArrayIndexOutOfBoundsException e){System.out.println("A number was not entered"); ArrayError=true;}

        catch(NumberFormatException e){System.out.println("That was an invalid input"); NumberError=true;}

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
	String hexadecimal="";
        if (ArrayError==true){
                System.out.println("Please try again with a valid number");
        }else if  (NumberError==true){
                System.out.println("Please try again with a valid number");
        }else{
        num = Arg1;
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
}
	return hexadecimal;
        
	}
    public static void main(String args[])
    {
	String Result = convert(args);
	System.out.println("Hexadecimal representation is: " + Result);
    }
}
