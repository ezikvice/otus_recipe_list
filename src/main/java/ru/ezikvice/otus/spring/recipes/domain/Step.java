package ru.ezikvice.otus.spring.recipes.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Step {
    @Id
    private String stepId;
    private Integer order;
    private String text;

}
