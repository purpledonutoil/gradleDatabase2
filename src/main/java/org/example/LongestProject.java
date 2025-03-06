package org.example;

public class LongestProject {
    long id;
    int monthCount;

    public void setId(long id) {
        this.id = id;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", monthCount=" + monthCount;
    }
}
