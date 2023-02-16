package com.spring.springApp.services;

import com.spring.springApp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
