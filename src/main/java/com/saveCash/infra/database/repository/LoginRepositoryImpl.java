package com.saveCash.infra.database.repository;

import com.saveCash.adapters.dtos.UserDTO;
import com.saveCash.infra.database.schemas.LoginEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

@RequestScoped
public class LoginRepositoryImpl implements PanacheRepository<LoginEntity> {

    @Transactional
    public void registerLogin(UserDTO user){
        LoginEntity entity = new LoginEntity();
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        persist(entity);
    }

    public LoginEntity getIdLogin(UserDTO user){
        return find("email", user.getEmail()).firstResult();
    }
}
