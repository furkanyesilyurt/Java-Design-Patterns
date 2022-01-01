package com.furkanyesilyurt.Structural.Composite;

public class App {

    public static void main(String[] args) {

        Component hardDisk = new Leaf(500L,"HardDisk");
        Component ram = new Leaf(700L,"Ram");
        Component cpu = new Leaf(500L,"Cpu");
        Component mouse = new Leaf(400L,"Mouse");
        Component keyboard = new Leaf(350L,"Keyboard");

        Composite motherBoard = new Composite("MotherBoard");
        Composite cabin = new Composite("Cabin");
        Composite io = new Composite("Cevre Birimleri");
        Composite computer = new Composite("Computer");

        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        cabin.addComponent(motherBoard);
        cabin.addComponent(hardDisk);

        io.addComponent(mouse);
        io.addComponent(keyboard);

        computer.addComponent(cabin);
        computer.addComponent(io);

        computer.getPrice();

    }

}
