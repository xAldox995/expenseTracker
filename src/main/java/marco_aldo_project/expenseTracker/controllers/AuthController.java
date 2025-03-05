package marco_aldo_project.expenseTracker.controllers;

import marco_aldo_project.expenseTracker.entities.Users;
import marco_aldo_project.expenseTracker.payloads.UserDTO;
import marco_aldo_project.expenseTracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Users save(@RequestBody UserDTO body, BindingResult validationResult) throws Exception {
        if (validationResult.hasErrors()) {
            String message = validationResult.getAllErrors().stream().map(objectError -> objectError.getDefaultMessage())
                    .collect(Collectors.joining(". "));
            throw new Exception("Ci sono stati errori nel payload! " + message);
        }

        return this.userService.save(body);
    }
}
