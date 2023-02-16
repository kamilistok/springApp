package com.spring.springApp.services;

import com.spring.springApp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
