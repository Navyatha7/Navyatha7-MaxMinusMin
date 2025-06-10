import java.util.Collections;
import java.util.List;

public class MaxMinusMin {
    public int difference(List<Integer> nums){
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty.");
        }
        return Collections.max(nums) - Collections.min(nums);
    }
}
