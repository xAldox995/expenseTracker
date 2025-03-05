package marco_aldo_project.expenseTracker.controllers;

import marco_aldo_project.expenseTracker.entities.Users;
import marco_aldo_project.expenseTracker.payloads.UserDTO;
import marco_aldo_project.expenseTracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Users save(@RequestBody UserDTO body) {


        return this.userService.save(body);
    }
}
