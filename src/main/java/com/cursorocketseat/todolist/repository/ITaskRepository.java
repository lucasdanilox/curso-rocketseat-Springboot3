package com.cursorocketseat.todolist.repository;

import com.cursorocketseat.todolist.taskmodel.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
}
