/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.trim;
/**
 *
 * @author EGOR
 */
public class JavaApplication1 {
    
    
     public static void main(String[] args) {
        // TODO code application logic here
     Text  d;
     Number num;
     symbol symb;
     num=new Number(4);
     String stroka;
     Scanner in =new Scanner(System.in);
     System.out.println("Введите текст для задания");
      stroka = in.nextLine();
     
    Text t=new Text(stroka);
    
    symb=new symbol("a");

    String str1= t.Gettext();
    String[] s =str1.split(" ");
     String h=symb.GetSymbol();
    int number=num.GetNumber();
System.out.println(number);
 for(int i=0;i<s.length;i++)
 {
     char ch2 = h.charAt(0);
     StringBuffer sb = new StringBuffer(s[i]); 
  sb.setCharAt(number, ch2); 
System.out.println(sb);
 }
  
    }
    
    
}
