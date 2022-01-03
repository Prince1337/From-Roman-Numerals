package main;

import java.util.TreeMap;

public class RomanNumerals {

  private TreeMap<String, Integer> numerals;

  public RomanNumerals(TreeMap<String, Integer> numerals) {
    this.numerals = numerals;
    numerals.put("I", 1);
    numerals.put("V", 5);
    numerals.put("X", 10);
    numerals.put("L", 50);
    numerals.put("C", 100);
    numerals.put("D", 500);
    numerals.put("M", 1000);

    numerals.put("IV", 4);
    numerals.put("IX", 9);
    numerals.put("XL", 40);
    numerals.put("XC", 90);
    numerals.put("CD", 400);
    numerals.put("CM", 900);



  }

  public int translateRecursive (String romanNumeral){
    if(numerals.containsKey(romanNumeral))
      return numerals.get(romanNumeral);

    if(numerals.containsKey(String.valueOf(romanNumeral.charAt(0)) + String.valueOf(romanNumeral.charAt(1))))
      return numerals.get(String.valueOf(romanNumeral.charAt(0)) + String.valueOf(romanNumeral.charAt(1))) + translateRecursive(romanNumeral.substring(2));

    return numerals.get(String.valueOf(romanNumeral.charAt(0))) + translateRecursive(romanNumeral.substring(1));
  }
}
