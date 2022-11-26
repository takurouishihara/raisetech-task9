package net.raisetech.raisetechtask9.Form;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotBlank;

@Getter
public class CreateForm {
        @NotBlank
        private String name;
        @Range(min = 1950, max = 2022)
        private Integer publishedYear;

        public CreateForm(String name, Integer publishedYear) {
                this.name = name;
                this.publishedYear = publishedYear;
        }
}
