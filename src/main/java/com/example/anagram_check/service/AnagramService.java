package com.example.anagram_check.service;

import com.example.anagram_check.dto.InformationDto;
import com.example.anagram_check.dto.WordDto;

public interface AnagramService {

    InformationDto checkAnagram(String firstWord, String secondWord);

    InformationDto checkAnagramDto(WordDto words);

}
