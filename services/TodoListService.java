package services;

import entities.TodoList;

public interface TodoListService {
    TodoList[] getTodoList();
    void addTodoList(String todo);
    Boolean removeTodolList(Integer number);

    Boolean ediTodoList(Integer number, String Todo);

    boolean editTodoList(Integer integer, String newTodo);

    boolean removeTodoList(Integer integer);
}
