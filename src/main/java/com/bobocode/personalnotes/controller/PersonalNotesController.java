package com.bobocode.personalnotes.controller;

import com.bobocode.personalnotes.domain.Note;
import com.bobocode.personalnotes.service.PersonalNotesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons/{personId}/notes")
@RequiredArgsConstructor
public class PersonalNotesController {
    private final PersonalNotesService personalNotesService;

    @PostMapping
    public void addNote(@PathVariable Long personId, @RequestBody Note note) {
        personalNotesService.addNote(personId, note);
    }
}
