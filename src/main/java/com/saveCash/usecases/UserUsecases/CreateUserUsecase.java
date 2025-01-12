package com.saveCash.usecases.UserUsecases;

import com.saveCash.adapters.dtos.UserDTO;
import com.saveCash.domain.repositories.UserRepository;
import com.saveCash.infra.database.repository.UserRepositoryImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CreateUserUsecase {

    @Inject
    UserRepository userRepository;

    public Response createUser(UserDTO request) {
        userRepository.createUser(request);
        return Response.ok(Response.Status.OK).build();
    }

}
