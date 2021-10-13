class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int size = nums.length;
        int start = 0;
        int end = 0;

        int maxSoFar = nums[0], maxEndingHere = nums[0];

        for(int i = 0; i < size; i++) {
            if(nums[i] > maxEndingHere + nums[i]){
                start = i;
                maxEndingHere = nums[i];
            }
            else {
                maxEndingHere = maxEndingHere + nums[i];
            }
            if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
                end = i;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.print("The largest subarray sum is: " + maxSubArray(nums));
    }
}