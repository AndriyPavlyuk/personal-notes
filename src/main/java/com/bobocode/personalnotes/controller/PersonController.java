package com.bobocode.personalnotes.controller;

import com.bobocode.personalnotes.domain.Person;
import com.bobocode.personalnotes.repository.PersonsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonsRepository repository;

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        repository.save(person);
        var location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(person.getId())
                .toUri();
        return ResponseEntity.created(location).body(person);
    }

    @GetMapping
    public List<Person> getPersons() {
        return repository.findAll();
    }
}
