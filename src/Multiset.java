import java.util.Arrays;

public class Multiset {
  private double[] multisetElements;

  public Multiset(double[] multisetElements) {
    this.multisetElements = new double[multisetElements.length];
    System.arraycopy(multisetElements, 0, this.multisetElements, 0, multisetElements.length);
  }

  @Override
  public String toString() {
    String multisetAsString = "{";
    for (double multisetElement : multisetElements) {
      multisetAsString = multisetAsString.concat(multisetElement + ", ");
    }
    multisetAsString = multisetAsString.concat("}");
    return multisetAsString;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof Multiset otherMultiset)) {
      return false;
    }
    if (this.multisetElements.length != otherMultiset.multisetElements.length) {
      return false;
    }
    Arrays.sort(this.multisetElements);
    Arrays.sort(otherMultiset.multisetElements);
    for (int forIndex = 0; forIndex < this.multisetElements.length; forIndex++) {
      if (this.multisetElements[forIndex] != otherMultiset.multisetElements[forIndex]) {
        return false;
      }
    }
    return true;
  }
}
