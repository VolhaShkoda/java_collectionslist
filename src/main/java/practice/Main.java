package practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();
    public static void main(String[] args) {

        while (true) {
            String todo = new Scanner(System.in).nextLine();
            String[] words = todo.split("\\s+");
            String regex = "[a -z]{1,}[^\\n]";
            String str = "";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(todo);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                str += todo.substring(start, end);
            }

            switch (words[0]) {
                case "LIST" -> todoList.getTodos();
                case "ADD" -> {
                    String regex1 = "^\\d+$";
                    if(words[1].matches(regex1)) {
                        todoList.add(Integer.parseInt(words[1]), String.join(" ", Arrays.asList(words).subList(1, words.length)));
                    }else {
                        todoList.add(String.join(" ", Arrays.asList(words).subList(1, words.length)));
                    }
                }
                case "EDIT" -> todoList.edit(Integer.parseInt(words[1]), (String.join(" ", Arrays.asList(words).subList(2, words.length))));
                case "DELETE" -> todoList.delete(Integer.parseInt(words[1]));
            }
        }
    }
}