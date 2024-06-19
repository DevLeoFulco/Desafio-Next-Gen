package com.library.devleofulco.repository;

import com.library.devleofulco.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
