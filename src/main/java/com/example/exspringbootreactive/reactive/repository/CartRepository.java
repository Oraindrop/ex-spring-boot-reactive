package com.example.exspringbootreactive.reactive.repository;

import com.example.exspringbootreactive.reactive.domain.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {
}
