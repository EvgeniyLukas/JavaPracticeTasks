package codingame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task26 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    if (in.hasNextLine()) {
      in.nextLine();
    }

    List<String> strings = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      String line = in.nextLine();
      strings.add(line);
    }

    for (int i = 0; i < strings.size(); i++) {
      if (i % 2 == 0) {
        System.out.println(strings.get(i));

      }
    }
    for (int i = 0; i < strings.size(); i++) {
      if (i % 2 == 1) {
        System.out.println(strings.get(i));

      }
    }

  }
}
