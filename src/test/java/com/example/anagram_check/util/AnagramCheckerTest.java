package com.example.anagram_check.util;

import com.example.anagram_check.dto.AnagramsResponseDto;
import com.example.anagram_check.dto.StatusAnagramDto;
import com.example.anagram_check.dto.WordDto;
import com.example.anagram_check.service.AnagramService;
import com.example.anagram_check.service.serviceImpl.AnagramServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class AnagramCheckerTest {

    private AnagramChecker anagramChecker;
    private WordDto testWordsDtoGoodAnagram;
    private WordDto testWordsDtoFailAnagram;

    @BeforeEach
    public void SetUp(){
        this.testWordsDtoGoodAnagram = new WordDto("Kara", "Arka");
        this.testWordsDtoFailAnagram = new WordDto("Maga", "Waga");
        this.anagramChecker = new AnagramChecker();
    }

    @Test
    public void should_successful_check_anagram_status() {
        //given
        //when
        //then
        Assert.assertEquals(this.anagramChecker.checkWords(this.testWordsDtoGoodAnagram).getStatus()
                , StatusAnagramDto.Validation.SUCCESSFUL);
        Assert.assertEquals(this.anagramChecker.checkWords(this.testWordsDtoFailAnagram).getStatus()
                ,StatusAnagramDto.Validation.FAILED);

    }

    @Test
    public void should_failed_check_anagram_status() {
        //given
        //when
        //then
        Assert.assertNotEquals(this.anagramChecker.checkWords(this.testWordsDtoGoodAnagram).getStatus()
                ,StatusAnagramDto.Validation.FAILED);
        Assert.assertNotEquals(this.anagramChecker.checkWords(this.testWordsDtoFailAnagram).getStatus()
                ,StatusAnagramDto.Validation.SUCCESSFUL);
    }
}
