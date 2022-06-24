package com.bobocode.personalnotes.repository;

import com.bobocode.personalnotes.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepository extends JpaRepository<Person, Long> {
}
