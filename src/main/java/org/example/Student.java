package org.example;

import org.junit.jupiter.api.Test;

public class Student {

    public String name;
    public int semester;
    public boolean isActive;

    public Student(String name, int semester, boolean isActive) {
        this.name = name;
        this.semester = semester;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }
    public int getSemester() {
        return semester;
    }
    public boolean isActive() {
        return isActive;
    }

    public boolean isDoingMBKM() {
        return semester >= 6 && isActive;
    }
}
