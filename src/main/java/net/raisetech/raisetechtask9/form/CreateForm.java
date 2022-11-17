package net.raisetech.raisetechtask9.form;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotBlank;
@Getter
public class CreateForm {
    @NotBlank
    private String name;

    @Range(min = 1950, max = 2022)
    private Integer published_year;
}
