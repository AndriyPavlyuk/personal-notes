package com.bobocode.personalnotes.service;

import com.bobocode.personalnotes.domain.Note;
import com.bobocode.personalnotes.repository.PersonsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PersonalNotesService {

    private final PersonsRepository repository;

    @Transactional
    public void addNote(Long personId, Note note) {
        var person = repository.findById(personId).orElseThrow();
        person.addNote(note);
    }
}
