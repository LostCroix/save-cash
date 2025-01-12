package com.saveCash.domain.repositories;

import com.saveCash.adapters.dtos.UserDTO;

public interface UserRepository {
    void createUser(UserDTO user);
}
