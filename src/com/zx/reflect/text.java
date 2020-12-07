package com.zx.reflect;

public class text {

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,1,2};
        System.out.println(findMinNum(nums));
    }

    public static int findMinNum(int[] nums){
        if(nums.length == 0) return -1;
        int left = 0;
        int right = nums.length-1;
        return findByDigui(left, right, nums);
    }

    private static int findByDigui(int left, int right, int[] nums){
        int mod;
        while(left != right-1){
            mod = (right+left)/2;
            if(nums[mod] > nums[right]){
                return findByDigui(mod, right, nums);
            } else {
                return findByDigui(left, mod, nums);
            }
        }
        return nums[right];
    }

}
