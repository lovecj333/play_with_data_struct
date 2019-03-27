package com.datastruct.set;

import java.util.HashSet;

public class Leecode804 {

    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hashSet = new HashSet<>();
        for(String word : words){
            StringBuilder res = new StringBuilder();
            for(int i=0;i<word.length();i++){
                res.append(codes[word.charAt(i) - 'a']);
            }
            hashSet.add(res.toString());
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new Leecode804().uniqueMorseRepresentations(words));
    }
}
