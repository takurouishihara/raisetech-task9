package net.raisetech.raisetechtask9.form;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class UpdateForm {
    private int id;
    @NotBlank
    private String name;


    @NotNull
    @Range(min = 1950, max = 2022)
    private Integer publishedYear;

    public UpdateForm(int id, String name, Integer publishedYear) {
        this.id = id;
        this.name = name;
        this.publishedYear = publishedYear;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }
}
