package ch15collection.book;
import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}



