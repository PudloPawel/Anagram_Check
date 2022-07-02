package com.example.anagram_check.controller;

import com.example.anagram_check.dto.AnagramsResponseDto;
import com.example.anagram_check.dto.StatusAnagramDto;
import com.example.anagram_check.dto.WordDto;
import com.example.anagram_check.service.AnagramService;
import com.example.anagram_check.service.serviceImpl.AnagramServiceImpl;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment =
        SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
class AnagramControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void checkRequestResult() throws Exception {

        //given
        final String baseUrl = createURL("/checkWords");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstWord","Arka");
        jsonObject.put("secondWord","Kara");

        //then
        this.mockMvc.perform(get(baseUrl)
                .contentType(MediaType.APPLICATION_JSON)
                .content(String.valueOf(jsonObject)))
                .andDo(print()).andExpect(status().isOk());

    }

    private String createURL(String uri) {
        return "http://localhost:8080/api" + uri;
    }

}

