package com.heineken.api;

import java.util.List;

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
	
    @Autowired
	private RestaurantService restaurantService;

    
	// GET LIST
    @ApiOperation(
            value = "Get restaurants list",
            notes = "Returns all restaurants stored."
        )
    @RequestMapping("/restaurants")
    public List<Restaurant> getRestaurants() {       
    	return restaurantService.getRestaurants();
    }

    // GET
    @ApiOperation(
        value = "Get restaurant details",
        notes = "Returns the details for a restaurant with the specified id."
    )
    @ApiResponses({
        @ApiResponse(
            code=404, message = "Restaurant not found"
        )
    })
    @RequestMapping("/restaurants/{id}")
    public Restaurant get(@RequestParam(value="id") long id) {       
    	return restaurantService.get(id);
    }
    
    // POST
    
    // PUT
    
    // DELETE
}