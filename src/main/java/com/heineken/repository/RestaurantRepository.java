package com.heineken.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.heineken.model.Restaurant;

@Transactional
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
	List<Restaurant> findByName(String name);
}
