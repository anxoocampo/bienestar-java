package com.heineken.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heineken.model.Restaurant;
import com.heineken.repository.RestaurantRepository;

@Service
@Transactional
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	// TODO: quitar
	private List<Restaurant> fakeList;
	

	public RestaurantService() {
		
		fakeList = new ArrayList<Restaurant>();
		
		fakeList.add(new Restaurant(0L,"Casa Paco"));
		fakeList.add(new Restaurant(1L,"Casa Pepe"));
		fakeList.add(new Restaurant(2L,"O'Curruncho"));
		fakeList.add(new Restaurant(3L,"La tradición"));

	}
	
	public List<Restaurant> getRestaurants() {
		restaurantRepository.save(fakeList);
		
		return (List<Restaurant>) restaurantRepository.findAll();
	}

	public Restaurant get(Long id) {
		return restaurantRepository.findOne(id);
	}

}
