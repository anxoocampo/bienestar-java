package com.heineken;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.heineken.model.Restaurant;
import com.heineken.repository.RestaurantRepository;

@SpringBootApplication
@EnableJpaRepositories("com.heineken.repository")
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Bean
	public DataSource dataSource() {
		// no need shutdown, EmbeddedDatabaseFactoryBean will take care of this
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL)
				.addScript("db/create-db.sql")
				.addScript("db/insert-data.sql").build();
		return db;
	}

	@Bean
	public CommandLineRunner demo(RestaurantRepository repository) {
		return (args) -> {
			// fetch all customers
			log.info("Restaurant found with findAll():");
			log.info("-------------------------------");
			for (Restaurant restaurant : repository.findAll()) {
				log.info(restaurant.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Restaurant restaurant = repository.findOne(1L);
			log.info("Restaurant found with findOne(1L):");
			log.info("--------------------------------");
			log.info(restaurant.toString());
			log.info("");

			// fetch customers by last name
			log.info("Restaurant found with findByName('Heineken1'):");
			log.info("--------------------------------------------");
			for (Restaurant heineken1 : repository.findByName("Heineken1")) {
				log.info(heineken1.toString());
			}
			log.info("");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
