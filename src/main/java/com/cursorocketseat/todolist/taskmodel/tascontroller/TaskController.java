package com.cursorocketseat.todolist.taskmodel.tascontroller;

import com.cursorocketseat.todolist.repository.ITaskRepository;
import com.cursorocketseat.todolist.taskmodel.TaskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository iTaskRepository;

    @PutMapping("/")
    public TaskModel create(@RequestBody TaskModel taskModel) {
        var task = this.iTaskRepository.save(taskModel);
        return task;

    }


}
