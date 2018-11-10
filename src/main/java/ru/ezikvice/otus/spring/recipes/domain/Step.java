package ru.ezikvice.otus.spring.recipes.domain;

import org.springframework.data.annotation.Id;

public class Step {
    @Id
    private String id;
    private Integer order;
    private String text;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
