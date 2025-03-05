package marco_aldo_project.expenseTracker.services;

import marco_aldo_project.expenseTracker.entities.Users;
import marco_aldo_project.expenseTracker.exceptions.Exception;
import marco_aldo_project.expenseTracker.payloads.UserDTO;
import marco_aldo_project.expenseTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Users save(UserDTO body) {
        this.userRepository.findByEmail(body.email()).ifPresent(
                user -> {
                    throw new Exception("Email " + body.email() + " già in uso!");
                }
        );
        Users newUser = new Users(body.nome(), body.cognome(), body.email(), body.password(),
                "https://ui-avatars.com/api/?name=" + body.nome() + "+" + body.cognome());
        Users savedUser = this.userRepository.save(newUser);

        return savedUser;
    }

    public Page<Users> findAll(int page, int size, String sortBy) {
        if (size > 100)
            size = 100;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.userRepository.findAll(pageable);
    }
}
