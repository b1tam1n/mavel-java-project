/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author EGOR
 */
public class Text {
    String text;
    private String text1;
    Text(String t)
    {
        text1=t;
        
    }    
    public  String Gettext()
    {
       return this.text1;
                
    }
                        
      void Show()
      {
          System.out.println(text1);
      }
}