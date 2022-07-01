package com.example.anagram_check.service.serviceImpl;

import com.example.anagram_check.dto.AnagramsResponseDto;
import com.example.anagram_check.dto.WordDto;
import com.example.anagram_check.service.AnagramService;
import com.example.anagram_check.util.AnagramCheck;
import org.springframework.stereotype.Service;

@Service
public class AnagramServiceImpl implements AnagramService {

    @Override
    public AnagramsResponseDto checkAnagram(WordDto words) {

        AnagramCheck anagramCheck = new AnagramCheck();

        return anagramCheck.checkWords(words);
    }

}

