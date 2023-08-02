package com.karthik.train.springtest.solution;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class ParticipantControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetAllParticipants() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/participant"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(
                    MockMvcResultMatchers.jsonPath("$.[0].name")
                    .value("Jessica Jones"));
    }

}
