import java.util.*;
import java.util.stream.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = Arrays.stream(nums).distinct()
                .boxed().collect(Collectors.toList());
        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}