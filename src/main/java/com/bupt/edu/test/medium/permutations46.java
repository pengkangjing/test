package com.bupt.edu.test.medium;

import java.util.*;


public class permutations46 {
    public static void main(String[] args){

    }
    public List<List<Integer>> premute(int[] nums){

        List<List<Integer>> result = new ArrayList();
        int[] visited =new int[nums.length];

        backTrack(0,visited,nums,result);
        return result;
    }
    public void backTrack(int i,int[] visited, int[] nums,List<List<Integer>> result){
        if(i==nums.length) {
            List<Integer> list = new ArrayList<Integer>();
           for(int n:nums){
               list.add(n);
           }
            result.add(list);
        }
        for(int j=i;j<nums.length;j++){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            visited[i]=j;
            backTrack(i+1,visited,nums,result);
            temp = nums[i];
            nums[i] = nums[visited[i]];
            nums[visited[i]]=temp;
            visited[i]=0;
        }
    }

}
