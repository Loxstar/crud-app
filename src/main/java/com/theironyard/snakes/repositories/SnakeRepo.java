package com.theironyard.snakes.repositories;

import com.theironyard.snakes.models.Snake;
import org.springframework.data.repository.CrudRepository;

public interface SnakeRepo
        extends CrudRepository<Snake, Integer> {
}
