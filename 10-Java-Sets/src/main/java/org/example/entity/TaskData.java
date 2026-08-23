package org.example.entity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        return switch (name) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            case "all" -> getUnion(annsTasks, bobsTasks, carolsTasks);
            default -> unassignedTasks;
        };
    }


    @SafeVarargs
    public final Set<Task> getUnion(Set<Task>... sets) {
        HashSet<Task> allTasks = new LinkedHashSet<>();

        for (Set<Task> tasks : sets) {
            allTasks.addAll(tasks);
        }

        return allTasks;
    }

    public Set<Task> getIntersection(Set<Task> tasks1, Set<Task> tasks2) {
        Set<Task> intersectedTasks = new HashSet<>(tasks1);
        intersectedTasks.retainAll(tasks2);
        return intersectedTasks;
    }

    public Set<Task> getDifferences(Set<Task> tasks1, Set<Task> tasks2) {
        Set<Task> differenceTasks = new HashSet<>(tasks1);
        differenceTasks.removeAll(tasks2);
        return differenceTasks;
    }


}
