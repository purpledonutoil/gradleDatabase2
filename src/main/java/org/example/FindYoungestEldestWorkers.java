package org.example;

import java.time.LocalDate;

public class FindYoungestEldestWorkers {
    String type;
    String name;
    LocalDate birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday;
    }
}
