package com.example.demo.model;

import java.util.*;

public class User {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(10, 11);
        HashSet<Integer> integers1 = new HashSet<>(integers);
        int max = calcMaxFreeSize(integers1);
        System.out.println(max);
    }

    public static int calcMaxFreeSize(Set<Integer> freeSeg) {

        List<Integer> list = new ArrayList<>(freeSeg);
        if (list.size() <= 1) {
            return list.size();
        }

        int maxFreeSize = 1;
        int tempFreeSize = 1;
        Integer pointer = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == pointer + 1) {
                tempFreeSize++;
            } else {
                tempFreeSize = 1;
            }
            maxFreeSize = Math.max(tempFreeSize, maxFreeSize);
            pointer = list.get(i);
        }
        return maxFreeSize;
    }
}
