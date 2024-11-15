package com.example.demo;

public class SwapToNumber {
    public static void main(String[] args) {
        int x =4;
        int y = 8;
        x = x ^ y;

        // need x in  y
        y = x ^ y;// x ^ y ^ y => x

        //need y in x
        x = x ^ y ;//since y is the original x  ,x^y^x=> y

        System.out.println(x);
        System.out.println(y);

    }
}
