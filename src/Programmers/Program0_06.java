package Programmers;

import java.util.Arrays;

public class Program0_06 {
    public static void solution(int[] numbers, int[] our_score, int[] score_list) {
        /* void == return 값이 없다*/
        /* static == 찾아보자 */
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }
        System.out.println(Arrays.toString(answer));
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4};
        int[] our_score = {85, 93};
        int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};

        solution(numbers, our_score, score_list);
    }
}