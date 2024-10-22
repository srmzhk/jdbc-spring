package org.srmzhk.jdbcspring.Contoroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.srmzhk.jdbcspring.Model.User;
import org.srmzhk.jdbcspring.Service.DbService;

import java.util.List;

@RestController
public class DbController {

    private final DbService dbService;

    public DbController(DbService dbService) {
        this.dbService = dbService;
    }

    @GetMapping("/record-count")
    public int getRecordCount() {
        return dbService.getRecordCount();
    }

    @GetMapping("/all-users")
    public List<User> getAllUsers() {
        return dbService.getAllUsers();
    }
}
