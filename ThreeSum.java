 import java.util.*;

public class ThreeSum {

    public List<List<Integer>> findTripletsThatSumToZero(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum sol = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> triplets = sol.findTripletsThatSumToZero(nums);

        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
