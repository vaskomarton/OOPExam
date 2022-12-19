package Computers;

public class ElektronTubeComputer extends Computer{
    public ElektronTubeComputer(int weight, int size, double speed, String type) {
        super(weight, size, speed, type, ComputerChipType.ELEKTRON_TUBE);
    }
}
