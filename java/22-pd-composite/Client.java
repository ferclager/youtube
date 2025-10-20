public class Client {
    public static void main(String[] args) {
        Component cpu = new Component("i9 Intel", 350);
        Component ram = new Component("16GB", 80);
        Component rom = new Component("4GB", 30);
        Component hdd = new Component("1TB", 100);
        Component sdd = new Component("1TB", 250);

        CompositeComponent memory = new CompositeComponent("Memory");
        memory.add(ram);
        memory.add(rom);

        CompositeComponent hd = new CompositeComponent("Hard Disk");
        hd.add(hdd);
        hd.add(sdd);

        CompositeComponent computer = new CompositeComponent("PC");
        computer.add(cpu);
        computer.add(memory);
        computer.add(hd);

        System.out.println(computer.getName() + " price " + computer.getPrice());
        System.out.println(memory.getName() + " price " + memory.getPrice());
        System.out.println(hd.getName() + " price " + hd.getPrice());
        System.out.println(cpu.getName() + " price " + cpu.getPrice());

    }
}
