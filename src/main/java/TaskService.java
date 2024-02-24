import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();
    Task getTaskById(long id);
    void addTask(TaskDTO taskDTO);
    void updateTask(long id, TaskDTO taskDTO);
    void deleteTask(long id);
    List<Task> getTasksByCategory(String category);
    List<Task> getTasksByPriority(Priority priority);
    List<Task> getTasksDueToday();
    List<Task> getTasksSortedByTitle();
    List<Task> getTasksSortedByPriority();
    List<Task> getTasksSortedByDueDate();
}
