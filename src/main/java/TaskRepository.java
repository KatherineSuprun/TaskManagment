import java.util.List;

public interface TaskRepository {

    List<Task> getAllTasks();
    Task getTaskById(long id);
    List<Task> getTasksByCategory(String category);
    List<Task> getTasksByPriority(Priority priority);
    List<Task> getTasksDueToday();

    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(long id);
}
