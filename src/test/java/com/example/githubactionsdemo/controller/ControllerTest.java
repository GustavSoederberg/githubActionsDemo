package com.example.githubactionsdemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@WebMvcTest(ControllerTest.class)
class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void welcome() throws Exception{
        mockMvc.perform(get(""))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"));

    }


}