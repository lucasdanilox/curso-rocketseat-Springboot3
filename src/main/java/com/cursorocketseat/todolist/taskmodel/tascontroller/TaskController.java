package com.cursorocketseat.todolist.taskmodel.tascontroller;

import com.cursorocketseat.todolist.repository.ITaskRepository;
import com.cursorocketseat.todolist.taskmodel.TaskModel;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository iTaskRepository;

    @PostMapping("/")
    public TaskModel create(@RequestBody TaskModel taskModel, HttpServletRequest request) {
      var idUser = request.getAttribute("idUser");
        taskModel.setIdUser((UUID) idUser);
        var task = this.iTaskRepository.save(taskModel);
        return task;

    }


}
