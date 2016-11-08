package com.heineken.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heineken.model.Restaurant;
import com.heineken.repository.RestaurantRepository;

@Service
@Transactional
public class RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;

	public RestaurantService() {
	}

	public List<Restaurant> getRestaurants() {
		return (List<Restaurant>) restaurantRepository.findAll();
	}

	public Restaurant get(Long id) {
		return restaurantRepository.findOne(id);
	}

}
