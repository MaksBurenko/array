package com.company;

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
class House {
    Window w1 = new Window(1); // Before constructor
    Window w2 = new Window(2); // After constructor
    Window w3 = new Window(3); // At end
    House() {
        System.out.println("House()");
        w3 = new Window(33); // Reinitialize w3
    }
    void f() { System.out.println("f()"); }
}
class Window {
    Window(int marker) { System.out.println("Window(" + marker + ")"); }
}

