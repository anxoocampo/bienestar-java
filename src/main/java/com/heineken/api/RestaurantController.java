package com.heineken.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heineken.model.Restaurant;
import com.heineken.service.RestaurantService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class RestaurantController {
	private Logger log = LoggerFactory.getLogger(RestaurantController.class);

	@Autowired
	private RestaurantService restaurantService;

	// GET LIST
	@ApiOperation(
		value = "Get restaurants list", 
		notes = "Returns all restaurants stored."
	)
	@RequestMapping("/restaurants")
	public List<Restaurant> getRestaurants() {
		log.info("Requested all restaurants");
		List<Restaurant> restaurants = restaurantService.getRestaurants();
		log.info("Number of Restaurants: " + (restaurants == null ? 0 : restaurants.size()));
		
		return restaurants;
	}

	// GET
	@ApiOperation(
		value = "Get restaurant details", 
		notes = "Returns the details for a restaurant with the specified id."
	)
	@ApiResponses(
		{ 
			@ApiResponse(
				code = 404, 
				message = "Restaurant not found") 
		}
	)
	
	@RequestMapping("/restaurant")
	public Restaurant get(@RequestParam(value = "id") long id) {
		log.info("Requested restaurant with id: " + id);
		Restaurant restaurant = restaurantService.get(id);
		log.info(restaurant.toString());
		
		return restaurantService.get(id);
	}

	// POST

	// PUT

	// DELETE
}