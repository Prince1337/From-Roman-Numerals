package main;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap<>();
        RomanNumerals romanNumerals = new RomanNumerals(tree);
        System.out.println(romanNumerals.translateRecursive("I"));
//        System.out.println(romanNumerals.translateRecursive("II"));
        System.out.println(romanNumerals.translateRecursive("IV"));
        System.out.println(romanNumerals.translateRecursive("V"));
        System.out.println(romanNumerals.translateRecursive("IX"));
        System.out.println(romanNumerals.translateRecursive("XLII"));
        System.out.println(romanNumerals.translateRecursive("XCIX"));
        System.out.println(romanNumerals.translateRecursive("MMXIII"));

    }
}
