package dev.mnascimento0392.leetCode._1;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int x=0;x<nums.length;x++){
            for(int y=x;y<nums.length;y++){

                if(nums[x]+nums[y]==target && x!=y){
                    return new int[]{x,y};
                }
            }

        }
        return null;
    }
}