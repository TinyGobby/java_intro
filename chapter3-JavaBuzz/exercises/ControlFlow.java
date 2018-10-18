// what imports will you need?
import java.util.*;

// can you remember how to set up your main function?
public class ControlFlow {
  public static void main(String[] args) {
    // find a way to read in user input
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    // write a method that will check if a number is odd or even
    // (assume user only ever enters integers)
    // print the answer to the console
    if(number % 2 == 0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}
