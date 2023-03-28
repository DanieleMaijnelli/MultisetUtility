import java.util.Scanner;

public class CompareMultisets {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Insert the first list of multiset's elements: ");
    String multisetAsString = reader.nextLine();
    String[] multisetElementsAsString = multisetAsString.split(",");
    for (int forIndex = 0; forIndex < multisetElementsAsString.length; forIndex++) {
      multisetElementsAsString[forIndex] = multisetElementsAsString[forIndex].trim();
    }
    double[] multisetElements = new double[multisetElementsAsString.length];
    for (int forIndex = 0; forIndex < multisetElements.length; forIndex++) {
      multisetElements[forIndex] = Double.parseDouble(multisetElementsAsString[forIndex]);
    }
    Multiset firstMultiset = new Multiset(multisetElements);
    System.out.println("Insert the second list of multiset's elements: ");
    multisetAsString = reader.nextLine();
    multisetElementsAsString = multisetAsString.split(",");
    for (int forIndex = 0; forIndex < multisetElementsAsString.length; forIndex++) {
      multisetElementsAsString[forIndex] = multisetElementsAsString[forIndex].trim();
    }
    multisetElements = new double[multisetElementsAsString.length];
    for (int forIndex = 0; forIndex < multisetElements.length; forIndex++) {
      multisetElements[forIndex] = Double.parseDouble(multisetElementsAsString[forIndex]);
    }
    Multiset secondMultiset = new Multiset(multisetElements);
    if (firstMultiset.equals(secondMultiset)) {
      System.out.println("The two multisets are equal");
    }
    else {
      System.out.println("The two multisets are different");
    }
  }
}
