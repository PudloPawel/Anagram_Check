package com.example.anagram_check.util;

import com.example.anagram_check.dto.AnagramsResponseDto;
import com.example.anagram_check.dto.StatusAnagramDto;
import com.example.anagram_check.dto.WordDto;
import lombok.NoArgsConstructor;
import java.util.Arrays;

@NoArgsConstructor
public class AnagramCheck {

    public AnagramsResponseDto checkWords(WordDto words){

        try{
            String firstWord = words.getFirstWord();
            String secondWord = words.getSecondWord();
            if(firstWord.length() != secondWord.length()){
                return AnagramsResponseDto
                        .builder()
                        .wordDto(words)
                        .status(StatusAnagramDto.Validation.FAILED)
                        .message("Words have another the length of characters")
                        .build();
            }else{
                char[] wordFirstChar = firstWord.toLowerCase().toCharArray();
                char[] wordSecondChar = secondWord.toLowerCase().toCharArray();
                Arrays.sort(wordFirstChar);
                Arrays.sort(wordSecondChar);

                StatusAnagramDto.Validation status;
                String information;

                if(Arrays.equals(wordFirstChar,wordSecondChar)){
                    status = StatusAnagramDto.Validation.SUCCESSFUL;
                    information = "Successful validation";
                }else{
                    status = StatusAnagramDto.Validation.FAILED;
                    information = "Words have another the characters";
                }

                return AnagramsResponseDto
                        .builder()
                        .wordDto(words)
                        .status(status)
                        .message(information)
                        .build();
            }

        }catch (Exception var4){
            return AnagramsResponseDto
                    .builder()
                    .wordDto(words)
                    .status(StatusAnagramDto.Validation.FAILED)
                    .message(var4.getMessage())
                    .build();
        }
    }

}
