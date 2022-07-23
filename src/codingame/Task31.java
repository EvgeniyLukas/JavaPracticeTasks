package codingame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task31 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String A = in.nextLine();
    String c = in.nextLine();
    List<Integer> nums = new ArrayList<>();
    for (int i = 0; i < A.length(); i++) {
      for (int j = 0; j < c.length(); j++) {
        if (c.charAt(j) == A.charAt(i)) {
          nums.add(i);
        }
      }
    }
    for (int i = nums.size() + 1; i >= 0; i--) {
      System.out.println((char) (nums.get(i) + 65));
    }
  }
}

