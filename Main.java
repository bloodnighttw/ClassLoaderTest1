/*
 *
 *  Repl.it:https://repl.it/@bbeenn1227/ClassLoaderTest1
 *  @Author bloodnighttw
 *  
 */

import java.util.Scanner;

import java.lang.ClassNotFoundException;
import java.lang.InstantiationException;
import java.lang.IllegalAccessException;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter the class' name u want to load?\n"
                    +"This is the class list u can enter\n"
                    +"=================\n"
                    +"M1\n"
                    +"M2\n"
                    +"Main\n"
                    +"Test\n"
                    +"=================\n"
                    +"Enter here:");
    
    try{
      Class<?> c=Class.forName("Test");
      ClassLoader classLoader = c.getClassLoader();
      Class<?> c2=classLoader.getSystemClassLoader().loadClass(sc.next());
      Class<? extends Test> c3=c2.asSubclass(Test.class);
      
      System.out.print(c3.getName());
      Object obj=c3.newInstance();
      Test ttt=(Test) obj;
      ttt.onStarting();

    }catch(ClassNotFoundException|InstantiationException|IllegalAccessException   e){  
      System.out.println("bangbangbang");
    }
  }
}