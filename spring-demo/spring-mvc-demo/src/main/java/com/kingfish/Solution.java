package com.kingfish;

public class Solution {

    public static void main(String[] args) {
        int taobao = strStr("www.taobao.sdscom", "taobao");

        System.out.println("taobao = " + taobao);
    }

    public static int strStr(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[index]) {
                flag = true;
                if (index + 1 == chars2.length) {
                    return i - index;
                }
                ++index;
            } else if (flag) {
                flag = false;
                index = 0;
            }
        }
        return -1;
    }
}