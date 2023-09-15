package c12api.lecture;

import java.util.Arrays;
public class C19hangul {}

     class Solution {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);
            int n = numbers.length;
            return Math.max(numbers[0] * numbers[1], numbers[n-1] * numbers[n-2]);
        }
     }


