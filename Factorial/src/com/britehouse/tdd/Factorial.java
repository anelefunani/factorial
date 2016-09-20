package com.britehouse.tdd;

/**
 * Created by Anele on 9/6/2016.
 */
public class Factorial {

    public static int factorial(int num) {
        if (num < 2){
            return 1;
        }else{
            return factorial(num - 1) * num;
        }

    }
}
