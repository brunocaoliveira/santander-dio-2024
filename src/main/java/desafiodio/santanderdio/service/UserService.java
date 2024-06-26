package desafiodio.santanderdio.service;

import desafiodio.santanderdio.model.User;

import java.util.Optional;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
