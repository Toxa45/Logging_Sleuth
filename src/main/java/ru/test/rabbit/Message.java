package ru.test.rabbit;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Message {
    @NotNull
    private String model;

    public Message(@NotNull String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(model, message.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
