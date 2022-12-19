package Computers;

public class ModernComputer extends Computer{
    public ModernComputer(int weight, int size, double speed, String type) {
        super(weight, size, speed, type, ComputerChipType.INTEGRATED_CIRCUIT);
    }
}
