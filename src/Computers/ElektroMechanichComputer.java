package Computers;

public class ElektroMechanichComputer extends Computer{
    public ElektroMechanichComputer(int weight, int size, double speed, String type) {
        super(weight, size, speed, type, ComputerChipType.ELEKTRO_MECHANIC);
    }
}
