import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    @Override
    public Task getTaskById(long id) {
        return taskRepository.getTaskById(id);
    }

    @Override
    public void addTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setCompleted(taskDTO.isCompleted());
        task.setCategory(taskDTO.getCategory());
        task.setPriority(taskDTO.getPriority());
        task.setDueDate(taskDTO.getDueDate());
        taskRepository.addTask(task);
    }

    @Override
    public void updateTask(long id, TaskDTO taskDTO) {
        Task task = taskRepository.getTaskById(id);
        if (task != null) {
            task.setTitle(taskDTO.getTitle());
            task.setDescription(taskDTO.getDescription());
            task.setCompleted(taskDTO.isCompleted());
            task.setCategory(taskDTO.getCategory());
            task.setPriority(taskDTO.getPriority());
            task.setDueDate(taskDTO.getDueDate());
            taskRepository.updateTask(task);
        }
    }

    @Override
    public void deleteTask(long id) {
        taskRepository.deleteTask(id);
    }

    @Override
    public List<Task> getTasksByCategory(String category) {
        return taskRepository.getTasksByCategory(category);
    }

    @Override
    public List<Task> getTasksByPriority(Priority priority) {
        return taskRepository.getTasksByPriority(priority);
    }

    @Override
    public List<Task> getTasksDueToday() {
        return taskRepository.getTasksDueToday();
    }

    @Override
    public List<Task> getTasksSortedByTitle() {
        return taskRepository.getAllTasks().stream()
                .sorted(Comparator.comparing(Task::getTitle))
                .collect(Collectors.toList());
    }

    @Override
    public List<Task> getTasksSortedByPriority() {
        return taskRepository.getAllTasks().stream()
                .sorted(Comparator.comparing(Task::getPriority))
                .collect(Collectors.toList());
    }

    @Override
    public List<Task> getTasksSortedByDueDate() {
        return taskRepository.getAllTasks().stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());
    }
}
