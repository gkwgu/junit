package org.example;
import org.example.util.StringUtil;

public class App {
    public static void main (String[] args)
    {
        String str = "J@va the be$t!123";
        StringUtil reversed= new StringUtil();
        String reversedStr = reversed.reverseLetters(str);
        System.out.println("Перевернутая строка: " + reversedStr);
        String str1=new String ("test");
        String str2=new String ("test");
        System.out.println(str1==str2);
    }
}
