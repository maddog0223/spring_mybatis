package mybatis.controllers;

import java.sql.Statement;
import java.util.ArrayList;


import com.mysql.jdbc.PreparedStatement;
import mybatis.model.User;
import mybatis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    //RequestMapping maps URLs to methods

    //Get
    @GetMapping("/")
    public ArrayList<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable(value="id")int id) {
        return userService.getById(id);
    }

    @GetMapping("/manual")
    public ArrayList<User> getUsersManually() {
        //write the necessary code to get all users and return
        //them in json to the browser without using mybatis
        return userService.getAllUsersManually();
    }

    //Create
    @PostMapping
    public User addNew(@RequestBody User user) {
        return userService.addNew(user);
    }

    //Update
    @PutMapping
    public User updateById(@RequestBody User user) {
        return userService.updateById(user);
    }

    //Delete
    @DeleteMapping
    public User deleteById(@RequestParam(value="id")int id){
        return userService.deleteById(id);
    }

}
