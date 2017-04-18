import java.util.ArrayList;
import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases

  }

  public static int oddAverage(List<Integer> nums) {
    int average = 0;
    int counter = 0;
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) % 2 != 0) {
        average = average + nums.get(i);
        counter ++;
      }
    }
    return average / counter;
  }

}