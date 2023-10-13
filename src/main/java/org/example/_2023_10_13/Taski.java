package org.example._2023_10_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Taski {
    // String s = "UDUD";
    private static boolean isAtPoint(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'U' || c == 'R') {
                count++;
            } else count--;
        }
        return count == 0;
    }

//    private static int getQ(int[][] king, int[][] queens) {
//        int count = 0;
//        for (int i = 0; i < queens.length; i++) {
//            for (int j = 0; j < queens[i].length; j++) {
//                if (king[i] == queens[i] || king[j] == queens[j]) {
//                    count++;
//                }
//                if (Math.abs(king[i] - queens[i]) == Math.abs(king[j] - queens[j])) {
//
//                }
//            }
//        }
//        return count;
//    }


    // source = "ad#aa" /aaa/ template = "aa"
    // source = "ad##aa#" /a/  template = "aa"
    // source = "##aa#" /a/  template = "aa"
    // source = "s###" /null/  template = "aa"
    // source = "########w" /w/  template = "aa"
    private static boolean isEquals(String source, String template) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < source.length(); i++) {
            char c  = source.charAt(i);
            if(c == '#') {
                if(!stack.empty()) {
                    stack.pop();
                }
            } else stack.add(c);
        }
        for (int i = 0; i < stack.size(); i++) {
            result.append(stack.pop());
        }
        return result.reverse().toString().equals(template);
    }

    public static boolean isEquals1 (String str, String templ){
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c != '#') {
                sb.append(c);
            }
            if (c == '#' && !sb.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString().equals(templ);
    }

//    private static boolean ivan(String str, String templ) {
//        String s = "ab#ba#";
//        char[] arrChar = s.toCharArray();
//        List<Character> result = new ArrayList<>();
//
//        for (int i = 0; i < arrChar.length; i++) {
//            if (arrChar[i] != '#') {
//                result.add(arrChar[i]);
//            } else if (arrChar[i] == '#') {
//                result.remove(result.size() - 1);
//            }
//        }
//    }

    /**
     * все массивы четной длины и одинаковые
     * int[] a = {1,8,6,3}
     * int[] b = {7,2,10,11}
     * 1 8 6 3 7 2 10 11
     * int[] result = {2 1 6 3 8 7 10 11}
     */


    public static void main(String[] args) {
        System.out.println(isEquals1("#a#aa#a#", "aa"));
    }
}
