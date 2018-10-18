import java.util.*;

// can you remember how to set up your main function?
public class LoopThroughArray {
  public static void main(String[] args) {
    // loop through an integer array and print out each element
    Integer arr[] = { 1, 2, 3, 4 };

    // simple for loop
    for(int i=0; i < arr.length; i++){
      System.out.println("for: " + arr[i]);
    }

    // enhanced for loop
    for(int number: arr){
      System.out.println("enhanced: " + number);
    }
  }
}
