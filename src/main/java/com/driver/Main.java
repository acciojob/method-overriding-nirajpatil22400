package com.driver;

class A
  {  
    //defining a method  
    void meth()
    {
      System.out.println("Invoking method from class A");
    }  
  }  
  //Creating a child class  
  class B extends A
  {  
    //defining the same method as in the parent class  
    void meth()
    {
    System.out.println("Method is overridden in Extendend class B");
    }
  }  

public class Main 
{
  public static void main(String args[])
    {  
      B obj = new B();//creating object  
      obj.meth();//calling method  
    }   
}
