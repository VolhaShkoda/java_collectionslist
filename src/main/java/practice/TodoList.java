package practice;

import java.util.ArrayList;

public class TodoList {
   ArrayList <String> todoList = new ArrayList<>();
   String list = "";
   String error = "Дело с таким номером не существует";

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело " + todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if(index < todoList.size()) {
            todoList.add(index, todo);
            System.out.println("Добавлено дело " + todo);
        }else {
            todoList.add(todo);
            System.out.println("Добавлено дело " + todo);
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения

        if(index < todoList.size()) {
            String todoClean = todoList.get(index);
            todoList.set(index, todo);
            System.out.println("Дело " + todoClean + " заменено на " + todo);
        }else {
            System.out.println(error);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела

        if (index < todoList.size()) {
            String todoClean = todoList.get(index);
            todoList.remove(index);
            System.out.println("Дело " + todoClean +  " удалено");
        }else {
            System.out.println(error);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        int i = 0;
        for (String list : todoList) {
            System.out.println(i++ + " - " + list);
        }
        return todoList;
    }
}