package org.example;

public class Phone {
    private String mob;

    public Phone() {

    }
    public Phone(String mob) {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }

    public void init() {
        System.out.println("Phone Init Method()");
    }

    public void destroy() {
        System.out.println("Phone Destroy Method()");
    }
}
