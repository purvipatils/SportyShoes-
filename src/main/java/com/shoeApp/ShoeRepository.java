package com.shoeApp;

import org.springframework.data.repository.CrudRepository;

public interface ShoeRepository extends CrudRepository<Shoe, Integer> {
}