import lombok.Data;

import java.time.LocalDate;

@Data
public class Task {

    private long id;
    private String title, description,category;
    private boolean completed;
    private Priority priority;
    private LocalDate dueDate;
}
