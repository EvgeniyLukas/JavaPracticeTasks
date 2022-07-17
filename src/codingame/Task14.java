package codingame;

import java.util.Scanner;

public class Task14 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    if (in.hasNextLine()) {
      in.nextLine();
    }
    String F = in.nextLine();
    String[] strings = {"a little", "a lot", "passionately", "not at all"};
    for (int i = 0; i < N; i++) {
      int i1 = Integer.parseInt(F);
      for (int j = 0; j < i1; j++) {
        System.out.println(strings[i]);
      }
    }

    Scanner t = new Scanner(System.in);
    t.nextInt();
    int v = 0;
    t.nextLine();
    for (String a : t.nextLine().split(" ")) {
      v = Integer.valueOf(a) % 4;
      if (v > 0) {
        break;
      }
    }
    System.out.print("not at all,a little,a lot,passionately".split(",")[v]);
  }
}

