package com.example.anagram_check.controller;

import com.example.anagram_check.dto.InformationDto;
import com.example.anagram_check.service.AnagramService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class AnagramController {

    private AnagramService anagramService;


    public AnagramController(AnagramService anagramService) {
        this.anagramService = anagramService;
    }

    @GetMapping("/checkWords")
    public ResponseEntity<InformationDto> checkAnagram(@RequestParam(value = "firstWord") String firstWord,
                                                       @RequestParam(value = "secondWord") String secondWord){

        return new ResponseEntity<>(anagramService.checkAnagram(firstWord,secondWord), HttpStatus.OK);
    }
/*
    @GetMapping("/checkWords")
    public ResponseEntity<InformationDto> getPlayersOfTeam(@RequestBody WordDto words){

        return new ResponseEntity<>(, HttpStatus.OK);
    }

 */

}
