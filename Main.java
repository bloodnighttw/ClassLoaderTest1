import java.util.Scanner;
import java.lang.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
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