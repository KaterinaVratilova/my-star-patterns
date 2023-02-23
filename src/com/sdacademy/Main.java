package com.sdacademy;
/*
Solve different star patterns
 */
public class Main {

    public static void main(String[] args) {

      // print 1 star
      System.out.println("One star:");
      System.out.println("*");
      System.out.println();

// print first and last column of a square - Parallel bars
      System.out.println("First and last column of a square:");
        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if (j == 1 || j== n)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            }

        // Plus Pattern
      System.out.println("Plus pattern:");
      for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (i == n/2 + 1 || j == n/2 + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Cross Pattern
      System.out.println("Cross pattern:");
      for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Hollow Square Pattern
      System.out.println("Hollow square pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }

        // Hollow Increasing Triangle
      System.out.println("Hollow increasing triangle:");
      for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==n || j==1 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Hollow decrreasing triangle
      System.out.println("Hollow decreasing triangle:");
      for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i == 1 || j == i || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


    }
}
