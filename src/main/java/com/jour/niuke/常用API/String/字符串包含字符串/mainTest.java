package com.jour.niuke.常用API.String.字符串包含字符串;

public class mainTest {
    public static void main(String[] args) {
        int count1 = countOccurrences("a", "ab");
        System.out.println(count1);

        int count = countOccurrences("abcdeab", "ab");
        System.out.println(count);
    }

    public static int countOccurrences(String s1, String s2) {
        int count = 0;
        if(s1 == null || s2 == null || s1.length() < s2.length()){
            return 0;
        }

        //abcdeab    ab
        for(int i = 0; i <= s1.length() - s2.length(); i++){
            if(s1.substring(i, i + s2.length()).equals(s2) ){
                count++;
            }
        }
        return count;
    }
}
