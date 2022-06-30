package com.example.anagram_check.service.serviceImpl;

import com.example.anagram_check.dto.InformationDto;
import com.example.anagram_check.dto.WordDto;
import com.example.anagram_check.service.AnagramService;
import com.example.anagram_check.util.AnagramCheck;
import org.springframework.stereotype.Service;

@Service
public class AnagramServiceImpl implements AnagramService {

    @Override
    public InformationDto checkAnagram(String firstWord, String secondWord) {

        AnagramCheck anagramCheck = new AnagramCheck();

        return new InformationDto(anagramCheck.checkWords(firstWord,secondWord));
    }

    @Override
    public InformationDto checkAnagramDto(WordDto words) {
        return null;
    }
}

