package codingame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task19 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    List<Integer> integers = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int xi = in.nextInt();
      integers.add((int) Math.pow(xi, 2));
    }
    int sum = 0;
    for (Integer integer : integers) {
      sum += integer;
    }

    System.out.println(sum);

  }

}
