package com.karthik.train.springtest.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.karthik.train.springtest.entity.Participant;
import com.karthik.train.springtest.repository.ParticipantsRepository;
import com.karthik.train.springtest.service.ParticipantService;

@ExtendWith(MockitoExtension.class)
public class ParticipantServiceTest {


    @Mock
    private ParticipantsRepository participantsRepository;

    @InjectMocks
    private ParticipantService participantService;


    @Test
    void returnsAllParticipants_whenfound() {
        var participant1 = new Participant();
        participant1.setName("John");
        when(participantsRepository.findAll()).thenReturn(List.of(participant1));
        assertEquals(1, participantService.getAllParticipants().size());
        assertEquals("JOHN", participantService.getAllParticipants().get(0).getName());
    }
    
}
