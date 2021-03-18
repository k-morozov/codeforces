package com.example.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", spent=" + spent +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .collect(Collectors.toList());
        bugs.forEach(System.out::println);

        List<String> nameBugs = tasks.stream()
                .map(task -> task.name)
                .collect(Collectors.toList());
        nameBugs.forEach(System.out::println);

        long total = tasks.stream()
                .map(task -> task.spent)
                .reduce(0l, Long::sum);
        System.out.println(total);

        List<Integer> numbers = List.of(1,2,3,0,4,0,0,0,5);
        numbers.stream()
                .filter(number -> number != 0)
                .forEach(System.out::print);
    }
}
