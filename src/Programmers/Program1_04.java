package Programmers;

import java.util.Arrays;
import java.util.List;

public class Program1_04 {

    class Solution {
        public String[] solution(String[] players, String[] callings) {
            String[] answer = players;
            List<String> ansArr = Arrays.asList(answer);

            for (int i = 0; i < callings.length; i++) {
                int rank = ansArr.indexOf(callings[i]);

                String name = answer[rank - 1];

                answer[rank - 1] = answer[rank];
                answer[rank] = name;
            }
            return answer;
        }
    }
}

