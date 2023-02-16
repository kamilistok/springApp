package com.spring.springApp.repositories;

import com.spring.springApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
