public class Ram extends Mhz {

    public int ram;
    public int overheatBy100MHZ = 10;
    public int maxOverheat = 30;

    public Ram(String producer, String serialNumber, String modelName, int ram, int defaultMHZ) {
        super(producer, serialNumber, modelName, defaultMHZ);
        this.ram = ram;
    }
}