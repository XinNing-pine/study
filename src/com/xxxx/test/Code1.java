package com.xxxx.test;

public class Code1 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,15};
        int target=9;
        twoSum(nums,target);
		//ce shi
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] num=new  int[2];
        for(int i=0;i < (nums.length-1);i++){
            if(nums[i]+nums[i+1]==target){
                 num[0]=i;
                 num[1]=i+1;
                break;
            }
        }
        return  num;
    }
}
