package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addLine(new OrderLine(new Componenta("MEMORY","16",700.0)));
        order.addLine(new OrderLine(new Componenta("HDD","1024",250.0)));

        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("DiscountKS");

        ksession.insert(order);
        ksession.fireAllRules();

        System.out.println("Total before discount: " + order.getTotal());
        System.out.println("Discount aplicat: " + (order.getDiscount() * 100) + "%");
        double finalValue = order.getTotal() * (1 - order.getDiscount());
        System.out.println("Final value: " + finalValue + " RON");
    }
}
