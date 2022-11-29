package net.raisetech.raisetechtask9.form;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class CreateForm {
        @NotBlank
        private String name;

        //@NotNull
        @Range(min = 1950, max = 2022)
        private Integer publishedYear;

        public CreateForm(String name, Integer publishedYear) {
                this.name = name;
                this.publishedYear = publishedYear;
        }
}
