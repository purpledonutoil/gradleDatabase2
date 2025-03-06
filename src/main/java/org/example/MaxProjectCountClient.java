package org.example;

public class MaxProjectCountClient {
    private String name;
    private int projectCount;

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", projectCount=" + projectCount;
    }
}
