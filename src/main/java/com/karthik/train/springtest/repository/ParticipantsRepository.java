package com.karthik.train.springtest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.train.springtest.entity.Participant;

public interface ParticipantsRepository extends JpaRepository<Participant, Long> {

    public Optional<Participant> findById(Long id);

    
}
