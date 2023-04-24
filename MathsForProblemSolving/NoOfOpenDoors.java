package MathsForProblemSolving;

import java.util.Scanner;

public class NoOfOpenDoors {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int doors = sc.nextInt();

    // atlast the open door will be numbers with odd number of factors that is perfect squares

    int count = 0;
    int x = 1;

    while(x*x <= doors)
    {
      count++;
      x++;
    }

    System.out.println(count);
  }
  
}
