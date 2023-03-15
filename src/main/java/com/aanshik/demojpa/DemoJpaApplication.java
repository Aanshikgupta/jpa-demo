package com.aanshik.demojpa;

import com.aanshik.demojpa.Entities.Student;
import com.aanshik.demojpa.Repository.StudentJpaRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;

@SpringBootApplication(exclude = SqlInitializationAutoConfiguration.class)
public class DemoJpaApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);

	}

	@Autowired
	StudentJpaRepo studentJpaRepo;

	private org.slf4j.Logger logger= (org.slf4j.Logger) LoggerFactory.getLogger(this.getClass());

	@Override
	public void run(String... args) throws Exception {
//		personJpaRepo.insert();
//		logger.info("All users -> {}",personJpaRepo.findAll());
		//logger.info("Update user with id 1001 -> {}",studentJpaRepo.save(new Student("Golu",20,"Golu@gmail.com")));
		//logger.info("All users with id 1001 -> {}",studentJpaRepo.findById(1001).orElse(null));
		//logger.info("Update user with id 1001 -> {}",studentJpaRepo.save(new Student("Golu",20,"Golu@gmail.com")));
		logger.info("Insert new user -> {}",studentJpaRepo.save(new Student("HelloMe",22,"gg@gmail.com")));

	}
}
