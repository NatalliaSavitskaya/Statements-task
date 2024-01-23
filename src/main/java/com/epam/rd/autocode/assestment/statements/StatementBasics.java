package com.epam.rd.autocode.assestment.statements;

public class StatementBasics {
    public static int addPositive(int value) {
        if (value > 0) {
            value++;
        } else {   }
        return value;
    }

    public static int addPositiveSubtractNegative(int value) {
        if (value > 0) {
            value++;
        } else {
            value=value-2;
        }
        return value;
    }

    public static int addPositiveSubtractNegativeReplaceZero(int value) {
        if (value > 0) {
            value++;
        } else if (value < 0) {
            value=value-2;
        } else {
            value=3;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(addPositive(5));
        System.out.println(addPositive(-6));
        System.out.println(addPositive(0));
        System.out.println(addPositiveSubtractNegative(12));
        System.out.println(addPositiveSubtractNegative(-8));
        System.out.println(addPositiveSubtractNegative(0));
        System.out.println(addPositiveSubtractNegativeReplaceZero(45));
        System.out.println(addPositiveSubtractNegativeReplaceZero(-16));
        System.out.println(addPositiveSubtractNegativeReplaceZero(0));
    }
}
