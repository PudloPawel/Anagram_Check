package com.example.anagram_check.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AnagramsResponseDto {

    private WordDto wordDto;
    private StatusAnagramDto.Validation status;
    private String message;

}
