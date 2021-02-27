import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    System.out.println("Welcome to the calculator \nEnter a command:\n");
    Calculator calculator = new Calculator();
    Scanner myObj = new Scanner(System.in);
    String name = myObj.next();

    while(!name.equals("quit")){
      if(name.equals("add")){
        System.out.println(calculator.add(myObj.nextInt(),myObj.nextInt()));
      }
      if(name.equals("subtract")){
        System.out.println(calculator.subtract(myObj.nextInt(),myObj.nextInt()));
      }
      if(name.equals("multiply")){
        System.out.println(calculator.multiply(myObj.nextInt(),myObj.nextInt()));
      }
      if(name.equals("divide")){
        System.out.println(calculator.divide(myObj.nextInt(),myObj.nextInt()));
      }
      if(name.equals("fibonacci")){
        System.out.println(calculator.fibonacciNumberFinder(myObj.nextInt()));
      }
      if(name.equals("binary")){
        System.out.println(calculator.intToBinaryNumber(myObj.nextInt()));
      }


      System.out.println("\nEnter a command:\n");
      name = myObj.next();

    }

  }


}
