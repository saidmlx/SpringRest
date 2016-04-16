
package io.saidmlx.controller.rest;

import io.saidmlx.persistence.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import java.util.*;

@RestController
@RequestMapping(value = "/user")
public class UserController{


  private List<User> users = new ArrayList<User>();

  public UserController(){
    User user1 = new User();
    user1.setId(1);
    user1.setName("Usuario 1");
    user1.setPhone("01 800 9753 2579");
    users.add(user1);
  }

  @RequestMapping(value = "/all", method = RequestMethod.GET)
  public ResponseEntity<List<User>> allUser(){

    return new ResponseEntity<List<User>>(users, HttpStatus.OK);
}

}
