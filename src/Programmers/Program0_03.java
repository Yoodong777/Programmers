package Programmers;

import java.util.Scanner;

public class Program0_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = (2023 - year + 1) + 7;
        }
        else if (age_type.equals("Year")) {
            answer = (2023 - year) + 7;
        }

        System.out.println(answer);
    }
}