package org.example;

public class PrintProjectPrices {
    Long projectId;
    int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "projectId=" + projectId +
                ", price=" + price;
    }
}
