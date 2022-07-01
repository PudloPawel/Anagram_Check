package com.example.anagram_check.service;

import com.example.anagram_check.dto.AnagramsResponseDto;
import com.example.anagram_check.dto.InformationDto;
import com.example.anagram_check.dto.WordDto;

public interface AnagramService {

    AnagramsResponseDto checkAnagram(WordDto words);


}
