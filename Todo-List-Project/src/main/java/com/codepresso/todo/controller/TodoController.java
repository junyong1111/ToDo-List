package com.codepresso.todo.controller;

import java.util.List;

import com.codepresso.todo.service.TodoService;
import com.codepresso.todo.vo.ResultDto;
import com.codepresso.todo.vo.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {
    private final TodoService todoService;

    //todo TodoService를 활용하기 위해 의존성 주입 코드를 작성하세요
    public TodoController(TodoService todoService){
        this.todoService = todoService;

    }
    //todo API문서를 확인하여 GET /todo REST API를 완성하세요
    @GetMapping("/todo")
    @ResponseBody
    public List<Todo> getTodoList(){
        return todoService.getTodoList();
    }

    //todo API문서를 확인하여 POST /todo REST API를 완성하세요
    @PostMapping("/todo")
    @ResponseBody
    public ResultDto addTodo(@RequestBody  Todo todoParam) {
        Todo todo = new Todo(todoParam.getContent());
        todoService.addTodo(todo);
        //todo return code는 변경하지 마세요
        return new ResultDto(200, "Success");
    }

    //todo API문서를 확인하여 DELETE /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    @DeleteMapping("/todo/{id}")
    public ResultDto deleteTodo(@PathVariable("id") Integer id) {
        todoService.deleteTodo(id);
        //todo return code는 변경하지 마세요
        return new ResultDto(200, "Success");
    }

}
