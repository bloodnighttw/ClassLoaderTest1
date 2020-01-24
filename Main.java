class Main {
  public static void main(String[] args) {
    
    try{
      Class<?> c=Class.forName("Test");
      ClassLoader classLoader = c.getClassLoader();
      Class<?> c2=classLoader.getSystemClassLoader().loadClass("Test");
      System.out.print("b");
      Test test=new Test();

      Object t=c2.forName("Test").cast(test);
      test=(Test) t;
      test.testSuccess();

    }catch(ClassNotFoundException e){
      System.out.print("sss");
    }
    
  }
}