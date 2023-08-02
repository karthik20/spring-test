package com.karthik.train.springtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.karthik.train.springtest.entity.Participant;
import com.karthik.train.springtest.exception.ParticipantException;
import com.karthik.train.springtest.repository.ParticipantsRepository;

@Service
public class ParticipantService {
    

    private final ParticipantsRepository participantsRepository;

    public ParticipantService(ParticipantsRepository participantsRepository) {
        this.participantsRepository = participantsRepository;
    }

    
    public List<Participant> getAllParticipants() {
        var allParticiapnts = participantsRepository.findAll();
        if(allParticiapnts.isEmpty()) {
            throw new ParticipantException("No participants data");
        }
        return allParticiapnts;
    }

}
