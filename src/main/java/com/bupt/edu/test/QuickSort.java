package com.bupt.edu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author :pengkangjing
 * @Date : 2021-04-24 18:53
 * @Version : 1.0
 */

public class QuickSort {
    public static void main(String[] args){

        int[][] a = {{1,4},{2,3},{8,10},{15,18}};

        sort(a,0,a.length-1);
        for(int[] n :a){
            System.out.println(n[0]);
            System.out.println(n[1]);
        }
        int[][]  result = merge(a);
        for(int[] n :result){
            System.out.println(n[0]);
            System.out.println(n[1]);
        }
    }
    public static int[][] merge(int[][] intervals) {
        Stack<int[]> stack = new Stack();
        stack.push(intervals[0]);
        System.out.println("size"+intervals.length);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][1]<=stack.peek()[1]){
                continue;
            }else if(intervals[i][0]<=stack.peek()[1]){
                System.out.println("fff"+intervals[i][0]);
                stack.push(new int[]{stack.pop()[0],intervals[i][1]});
                System.out.println("----");
                System.out.println("jjj"+stack.peek()[0]);
                System.out.println("jjj"+stack.peek()[1]);

            }else{
                stack.push(intervals[i]);
                System.out.println("sss"+stack.peek()[0]);
                System.out.println("sss"+stack.peek()[1]);
            }
        }
        System.out.println("kkkk"+stack.size());
        int[][] result = new int[stack.size()][2];
        int size = stack.size();
        for(int j=0;j<size;j++){
            result[size-1-j]=stack.pop();
            System.out.println("rrr"+result[j][0]);
            System.out.println("rrr"+result[j][1]);
        }
        return result;
    }
   /* private static void sort(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
       List<int[]> l = new ArrayList<>();

        int i = left;
        int j = right;
        int temp = nums[i];
        while(i<j){
            while((j>i)&&(nums[j]>temp)){
                j--;
            }
            nums[i] = nums[j];
            while((j>i)&&(nums[i]<=temp)){
                i++;
            }
            nums[j] = nums [i];
        }
        nums[i] = temp;
        sort(nums,left,i-1);
        sort(nums,i+1,right);

    }*/
    public static void sort(int[][] nums,int left,int right){
        if(left>=right){
            return ;
        }
        int i=left;
        int j=right;
        int[] temp=nums[i];
        while(i<j){
            while((i<j)&&(nums[j][0]>temp[0])){
                j--;
            }
            nums[i]=nums[j];
            while((i<j)&&(nums[i][0]<=temp[0])){
                i++;
            }
            nums[j]=nums[i];
        }
        nums[i]=temp;
        sort(nums,left,i-1);
        sort(nums,i+1,right);
    }
}
