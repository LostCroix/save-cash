package com.saveCash.infra.database.repository;

import com.saveCash.adapters.dtos.UserDTO;
import com.saveCash.domain.repositories.UserRepository;
import com.saveCash.infra.database.schemas.LoginEntity;
import com.saveCash.infra.database.schemas.UserEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@RequestScoped
public class UserRepositoryImpl implements PanacheRepository<UserEntity>, UserRepository {

    @Inject
    LoginRepositoryImpl loginRepositoryImpl = new LoginRepositoryImpl();

    @Transactional
    public void createUser(UserDTO user){
        UserEntity entity = new UserEntity();
        loginRepositoryImpl.registerLogin(user);
        LoginEntity loginEntity = loginRepositoryImpl.getIdLogin(user);

        entity.setName(user.getName());
        entity.setSurname(user.getSurname());
        entity.setLogin(loginEntity);
        persist(entity);
    }
}