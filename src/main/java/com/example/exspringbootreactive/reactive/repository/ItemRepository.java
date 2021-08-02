package com.example.exspringbootreactive.reactive.repository;

import com.example.exspringbootreactive.reactive.domain.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item, String> {

}
