public class Ram extends Mhz {

    protected int ram;
    protected int overheatBy100MHZ = 10;
    protected int maxOverheat = 30;

    public Ram(String producer, String serialNumber, String modelName, int ram, int defaultMHZ) {
        super(producer, serialNumber, modelName, defaultMHZ, 10, 30);
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Ram parameters: defaultMHZ: " + defaultMHZ + ", currentMHZ: " + currentMHZ + ", overheatBy100MHZ: " + overheatBy100MHZ + ", maxOverheat: " + maxOverheat;
    }
}