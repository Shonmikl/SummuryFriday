package org.example._2023_06_09;

public class Ex345 {

    String name;

    public Ex345(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ex345: [" + name + "]";
    }

    public static void get(int[] s) {
        for (int j = 0; j < s.length; j++) {
            if(s[j] %2 == 0) {
                System.out.println(s[j]);
            }
        }
    }

    public static void main(String[] args) {
       Ex345 ex345 = new Ex345("345");
                     new Ex345("345");

                     get(new int[]{1});
    }
}
