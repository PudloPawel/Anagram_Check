package com.example.anagram_check.controller;

import com.example.anagram_check.dto.AnagramsResponseDto;
import com.example.anagram_check.dto.InformationDto;
import com.example.anagram_check.dto.WordDto;
import com.example.anagram_check.service.AnagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class AnagramController {

    @Autowired
    private AnagramService anagramService;

    @GetMapping("/checkWords")
        public ResponseEntity<AnagramsResponseDto> checkAnagram(@RequestBody WordDto words){

        return new ResponseEntity<>(anagramService.checkAnagram(words), HttpStatus.OK);
    }


}
