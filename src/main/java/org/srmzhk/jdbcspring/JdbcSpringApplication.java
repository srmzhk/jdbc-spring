package org.srmzhk.jdbcspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.srmzhk.jdbcspring.Model.User;
import org.srmzhk.jdbcspring.Service.DbService;

import java.util.List;

//@SpringBootApplication
//public class JdbcSpringApplication implements CommandLineRunner {
//
//	private final DbService dbService;
//
//	public JdbcSpringApplication(DbService dbService) {
//		this.dbService = dbService;
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(JdbcSpringApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		int recordCount = dbService.getRecordCount();
//		System.out.println("Количество записей в таблице: " + recordCount);
//		List<User> users = dbService.getAllUsers();
//		for (User user : users){
//			System.out.println(user.toString());
//		}
//	}
//}

@SpringBootApplication
public class JdbcSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(JdbcSpringApplication.class, args);
	}
}
