package bootcamp.projeto.service;

import bootcamp.projeto.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
