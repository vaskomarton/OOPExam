package Computers;

public abstract class Computer {
    private int weight;
    private int size;
    private double speed;
    private String type;
    private final ComputerChipType chipType;

    public Computer(int weight, int size, double speed, String type, ComputerChipType chipType) {
        this.weight = weight;
        this.size = size;
        this.speed = speed;
        this.type = type;
        this.chipType = chipType;
    }

    @Override
    public String toString() {
        String nl = "\n";
        return "\nComputer{" + getClass().getName().substring(10) +
                "\nweight=" + weight +
                ",\n size=" + size +
                ",\n speed=" + speed +
                ",\n type='" + type + '\'' +
                ",\n chiptipe=" + chipType +
                '}';
    }
}
