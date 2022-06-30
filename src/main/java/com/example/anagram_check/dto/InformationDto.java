package com.example.anagram_check.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class InformationDto {

    private boolean isAnagram;

    public InformationDto(boolean isAnagram) {
        this.isAnagram = isAnagram;
    }
}

