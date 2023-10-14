package com.cursorocketseat.todolist.repository;

import com.cursorocketseat.todolist.usermodel.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepositoryUser extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);

}
