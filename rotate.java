public class rotate {
    
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int k=3;
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]); 
        }
    }
}
