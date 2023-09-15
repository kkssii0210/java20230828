package ch17stream.book;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public int numIdenticalParis(int[] nums){
        return (int) IntStream.range(0,nums.length)
                .flatMap(i -> IntStream.range(i + 1, nums.length).filter(j -> nums[i] == nums[j]))
                .count();
    }
}
