import java.util.ArrayList;

// can you remember how to set up your main function?
public class Arrays {
  // declare an array of Strings and print it
  public static void main(String[] args) {
  String names[] = { "Patrick", "Victor", "Damion" };

  System.out.println(names[0]);
  System.out.println(names[1]);
  System.out.println(names[2]);
  // declare an array of integers and print it
  int[] integerArray = new int[4];
  integerArray[0] = 6;
  integerArray[1] = 7;
  integerArray[2] = 8;
  integerArray[3] = 3246584;
  System.out.println(integerArray[3]);
  // declare an ArrayList of integers, add numbers to it, and then print it
  ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
  integerArrayList.add(6);
  integerArrayList.add(8);
  integerArrayList.add(10);
  integerArrayList.add(654681684);
  System.out.println(integerArrayList.get(3));
  System.out.println(integerArrayList.get(2));
  System.out.println(integerArrayList.get(1));
  }
}
