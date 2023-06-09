package org.example._2023_06_09;

public class HW1 {
    //sequence
    //todo
    private static void getMaxSeq(int[] arr) {
        int maxLength = 1;
        int currentLength = 1;
        int endIndex = 0;
        int currentIndex = 0;

        //[1 3 5 2 4 7 6 8 9]
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = 1;
                }
            } else {
                currentLength = 1;
                endIndex = i;
            }
        }

        int u = endIndex - maxLength + 1;
        for (int i = u; i <= endIndex; i++) {
            System.out.print("[" + arr[i] + "], ");
        }
    }

    public static void main(String[] args) {
        getMaxSeq(new int[]{1, 3, 5, 2, 4, 7, 6, 8, 9});
    }
}
