class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int sumOfAll = (n *(n + 1)) / 2;
        int sumOfArray = 0;

        for (int i = 0; i < n; i++) {
            sumOfArray += nums[i];
        }

        int missingNumber = sumOfAll - sumOfArray;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,5,8,9,7,6,0};
        System.out.print(missingNumber(nums));
    }
}