package com.mypackage.dto;

import com.mypackage.model.Task;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class TaskDTO {
    @NotBlank
    private String title;

    private String description;

    @NotNull
    private LocalDate dueDate;

    @NotBlank
    private String status;

    @NotBlank
    private String priority;

    public Task toEntity() {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setStatus(status);
        task.setPriority(priority);
        return task;
    }
}
