package example;

import mypackage.Calculate;
import mypackage.CalculateServiceLocator;

import javax.xml.rpc.ServiceException;
import java.util.Scanner;

public class HelloWorld {
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  public static void main(String[] args) throws Exception{
    int result = 0;
      Calculate cl = new CalculateServiceLocator().getCalculatePort();
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入你的工资：");
      int income = sc.nextInt();
      result = cl.calculateTax(income);
    System.out.println("您需要交税："+result);

  }
}
