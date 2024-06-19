package com.library.devleofulco.repository;

import com.library.devleofulco.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
