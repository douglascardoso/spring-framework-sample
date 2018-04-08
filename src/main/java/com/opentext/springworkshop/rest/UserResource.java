package com.opentext.springworkshop.rest;

import com.opentext.springworkshop.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {
/*
    private static final Logger logger = LoggerFactory.getLogger(UserResource.class);*/

    @RequestMapping(value = "/{userid}", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getUser(@PathVariable("userid") String userId) {
//        logger.debug("User ID: {}", userId);
        System.out.println("userid " + userId);
        return ResponseEntity.ok(new UserDto());
    }
}
