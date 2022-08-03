package com.company;

import java.util.HashMap;
import java.util.Objects;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        System.out.println(s.length());
        System.out.println(t.length());
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (smap.containsKey(s.charAt(i))) smap.put(s.charAt(i), smap.get(s.charAt(i)) + 1);
            else  smap.put(s.charAt(i), 1);
            if (tmap.containsKey(t.charAt(i))) tmap.put(t.charAt(i), tmap.get(t.charAt(i)) + 1);
            else  tmap.put(t.charAt(i), 1);
        }

        for (char c: smap.keySet()) {
            if (!Objects.equals(smap.get(c), tmap.get(c))) {
                System.out.println(c);
                return false;
            }
        }
        return true;


    }

}
