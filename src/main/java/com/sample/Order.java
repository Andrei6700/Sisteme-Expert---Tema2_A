package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines = new ArrayList<>();
    private double discount = 0.0;

    public void addLine(OrderLine line) {
        lines.add(line);
    }
    public List<OrderLine> getLines() { return lines; }

    public double getTotal() {
        return lines.stream()
                    .mapToDouble(l -> l.getComponenta().getPret())
                    .sum();
    }

    public double getDiscount() { return discount; }
    public void setDiscount(double d) { this.discount = d; }
}
