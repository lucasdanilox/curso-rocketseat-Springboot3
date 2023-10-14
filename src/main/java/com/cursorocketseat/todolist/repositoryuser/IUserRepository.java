package com.cursorocketseat.todolist.repositoryuser;

import com.cursorocketseat.todolist.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {

}
