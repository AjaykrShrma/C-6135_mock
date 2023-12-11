import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
    void anag()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings ");
        String str1=sc.next();
        String str2=sc.next();
        System.out.println("String1= "+str1+"\n"+"String2= "+str2);
       boolean status=true;
       if (str1.length()!=str2.length())
       status=false;
       else
       {
           char[] Arstr1= str1.toLowerCase().toCharArray();
           char[] Arstr2=str2.toLowerCase().toCharArray();
           Arrays.sort(Arstr1);
           Arrays.sort(Arstr2);
           status=Arrays.equals(Arstr1,Arstr2);
       }
       if (status){
           System.out.println("Anagram");
       }
       else System.out.println("Not Anagram");
    }
    public static void main(String[]ak)
    {
        Anagram an=new Anagram();
        an.anag();
    }
}
/*
Enter two Strings 
Ajay
yaja
String1= Ajay
String2= yaja
Anagram
    */
