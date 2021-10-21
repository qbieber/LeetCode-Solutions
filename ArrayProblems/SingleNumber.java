import java.util.HashSet;

class SingleNumber {
    public static int singleNumber(int[] nums){
        
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            res = res ^ nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 2, 1};

        System.out.print(singleNumber(nums));
    }
}