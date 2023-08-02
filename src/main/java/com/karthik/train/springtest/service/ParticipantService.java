package com.karthik.train.springtest.service;

import java.util.List;
import java.util.stream.Collectors;

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
        return allParticiapnts.stream().map(p -> {
            var name = p.getName();
            p.setName(decorateParticipantName(name));
            return p;
        }).collect(Collectors.toList());
    }

    public String decorateParticipantName(String name) {
        return name.trim().toUpperCase();
    }

}
