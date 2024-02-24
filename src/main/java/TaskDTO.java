import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TaskDTO {

    String title, description, category;
    private boolean completed;
    private Priority priority;
    private LocalDate dueDate;
}
