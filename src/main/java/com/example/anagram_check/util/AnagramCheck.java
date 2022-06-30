package com.example.anagram_check.util;

import lombok.NoArgsConstructor;
import java.util.Arrays;

@NoArgsConstructor
public class AnagramCheck {

    public boolean checkWords(String firstWord, String secondWord){

        try{

            if(firstWord.length() != secondWord.length()){
                return false;
            }else{
                char[] wordFirstChar = firstWord.toLowerCase().toCharArray();
                char[] wordSecondChar = secondWord.toLowerCase().toCharArray();
                Arrays.sort(wordFirstChar);
                Arrays.sort(wordSecondChar);

                return Arrays.equals(wordFirstChar, wordSecondChar);

            }
        }catch (Exception var4){
            return false;
        }
    }

}
