package com.chengzhx76.github;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/7/27
 */
public class Interface1 {

    interface Formula{

        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(positive(a));
        }

        static int positive(int a) {
            return a > 0 ? a : 0;
        }
    }

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        double n = formula.calculate(100);
        System.out.println(n);
        formula.sqrt(-23);
        Formula.positive(-4);

    }

}
