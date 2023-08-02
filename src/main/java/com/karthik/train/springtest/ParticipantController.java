package com.karthik.train.springtest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.train.springtest.entity.Participant;
import com.karthik.train.springtest.service.ParticipantService;

@RestController
@RequestMapping("/participant")
public class ParticipantController {

    private ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    
    @GetMapping("/")
    public List<Participant> getAll() {
        return participantService.getAllParticipants();
    }
    
}
