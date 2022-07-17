package codingame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task20 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int nCount = in.nextInt();
    List<Integer> integers = new ArrayList<>();
    for (int i = 0; i < nCount; i++) {
      int x = in.nextInt();
      integers.add((int) Math.pow(x, 2));
    }
    int sum = 0;
    for (Integer integer : integers) {
      sum += integer;
    }

    List<Integer> integers1 = new ArrayList<>();
    for (int i = 0; i < nCount; i++) {
      int y = in.nextInt();
      integers.add((int) Math.pow(y, 2));
    }
    int sum1 = 0;
    for (Integer integer1 : integers1) {
      sum1 += integer1;
    }

    System.out.println(sum + sum1);
  }
}
