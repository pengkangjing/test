package com.bupt.edu.test.other;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args){
        int requiredSlotForJob =5;
        int numSlotsPerWorker =4;
        int requiredTmForJob = (int)Math.ceil((float)requiredSlotForJob/numSlotsPerWorker);

        Map<String,Integer> m = new HashMap<String,Integer>();
        m.put("apus.job.slot.max.limit",-1);
        //String res =

        System.out.println(requiredTmForJob);
    }
}
