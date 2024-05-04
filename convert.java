//Siddharth Singh

import java.util.*;
public class convert
{
    String decimalToBinary(int n)
    {
        String revbin = "";
        String bin = "";
        while(n!=0)
        {
            revbin += n%2;
            n = n/2;
        }
        for(int i = (revbin.length() - 1); i>=0; i--)
        {
            bin += revbin.charAt(i);
        }
        return (bin);
    }
    String decimalToOctal(int n)
    {
        String revoct = "";
        String oct = "";
        while(n!=0)
        {
            revoct += n%8;
            n = n/8;
        }
        for(int i = (revoct.length() - 1); i>=0; i--)
        {
            oct += revoct.charAt(i);
        }
        return (oct);
    }
    String decimalToHex(int n)
    {
        String revhex = "";
        String hex = "";
        while(n!=0)
        {
            if(n%16 < 10)
            {
                revhex += n%16;
            }
            else if(n%16 == 10)
            {
                revhex += "A";
            }
            else if(n%16 == 11)
            {
                revhex += "B";
            }
            else if(n%16 == 12)
            {
                revhex += "C";
            }
            else if(n%16 == 13)
            {
                revhex += "D";
            }
            else if(n%16 == 14)
            {
                revhex += "E";
            }
            else if(n%16 ==15)
            {
                revhex += "F";
            }
            n = n/16;
        }
        for(int i = (revhex.length() - 1); i>=0; i--)
        {
            hex += revhex.charAt(i);
        }
        return (hex);
    }
    int binaryToDecimal(String n)
    {
        int l = n.length();
        int dec = 0;
        for(int i = 1; i<=l; i++)
        {
            char b = n.charAt(l-i);
            if(b=='1')
            {
                dec = (int) (dec + Math.pow(2,(i-1)));
            }
        }
        return (dec);
    }
    String binaryToOctal(String n)
    {
        int l = n.length();
        String oct = "";
        if(l%3==1)
        {
            n = "00" + n;
            l += 2;
        }
        else if(l%3==2)
        {
            n = "0" + n;
            l += 1;
        }
        for(int i = 0, j = 3; j<=l+1; i+=3, j+=3)
        {
            String sub = n.substring(i,j);
            if(sub.equals("000"))
            {
                oct += "0";
            }
            if(sub.equals("001"))
            {
                oct += "1";
            }
            if(sub.equals("010"))
            {
                oct += "2";
            }
            if(sub.equals("011"))
            {
                oct += "3";
            }
            if(sub.equals("100"))
            {
                oct += "4";
            }
            if(sub.equals("101"))
            {
                oct += "5";
            }
            if(sub.equals("110"))
            {
                oct += "6";
            }
            if(sub.equals("111"))
            {
                oct += "7";
            }
        }
        return (oct);
    }
    String binaryToHex(String n)
    {
        int l = n.length();
        String hex = "";
        if(l%4==1)
        {
            n = "000" + n;
            l += 3;
        }
        else if(l%4==2)
        {
            n = "00" + n;
            l += 2;
        }
        else if(l%4==3)
        {
            n = "0" + n;
            l += 1;
        }
        for(int i = 0, j = 4; j<=l+1; i+=4, j+=4)
        {
            String sub = n.substring(i,j);
            if(sub.equals("0000"))
            {
                hex += "0";
            }
            if(sub.equals("0001"))
            {
                hex += "1";
            }
            if(sub.equals("0010"))
            {
                hex += "2";
            }
            if(sub.equals("0011"))
            {
                hex += "3";
            }
            if(sub.equals("0100"))
            {
                hex += "4";
            }
            if(sub.equals("0101"))
            {
                hex += "5";
            }
            if(sub.equals("0110"))
            {
                hex += "6";
            }
            if(sub.equals("0111"))
            {
                hex += "7";
            }
            if(sub.equals("1000"))
            {
                hex += "8";
            }
            if(sub.equals("1001"))
            {
                hex += "9";
            }
            if(sub.equals("1010"))
            {
                hex += "A";
            }
            if(sub.equals("1011"))
            {
                hex += "B";
            }
            if(sub.equals("1100"))
            {
                hex += "C";
            }
            if(sub.equals("1101"))
            {
                hex += "D";
            }
            if(sub.equals("1110"))
            {
                hex += "E";
            }
            if(sub.equals("1111"))
            {
                hex += "F";
            }
        }
        return (hex);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        convert obj = new convert();
        System.out.println("Enter D for Decimal conversions");
        System.out.println("Enter B for Binary conversions");
        char ch = sc.next().charAt(0);
        int ch2 = 0;
        String result;
        int result2;
        int decimal = 0;
        String binary = "";
        if(ch=='D')
        {
            System.out.println("Enter the decimal number");
            decimal = sc.nextInt();
            System.out.println("Enter 1 for decimal to binary");
            System.out.println("Enter 2 for decimal to octal");
            System.out.println("Enter 3 for decimal to hexadecimal");
            ch2 = sc.nextInt();
        }
        else if(ch=='B')
        {
            sc.nextLine();
            System.out.println("Enter the binary number");
            binary = sc.nextLine();
            System.out.println("Enter 4 for binary to decimal");
            System.out.println("Enter 5 for binary to octal");
            System.out.println("Enter 6 for binary to hexadecimal");
            ch2 = sc.nextInt();
        }
        if(ch2==1)
        {
            result = obj.decimalToBinary(decimal);
            System.out.println("Result: " + result);
        }
        else if(ch2==2)
        {
            result = obj.decimalToOctal(decimal);
            System.out.println("Result: " + result);
        }
        else if(ch2==3)
        {
            result = obj.decimalToHex(decimal);
            System.out.println("Result: " + result);
        }
        else if(ch2==4)
        {
            result2 = obj.binaryToDecimal(binary);
            System.out.println("Result: " + result2);
        }
        else if(ch2==5)
        {
            result = obj.binaryToOctal(binary);
            System.out.println("Result: " + result);
        }
        else if(ch2==6)
        {
            result = obj.binaryToHex(binary);
            System.out.println("Result: " + result);
        }
    }
}

