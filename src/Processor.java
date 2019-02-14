public class Processor extends Mhz {

    /**
     * taktowanie np. 3000MHz
     */

    public int overheatBy100MHZ = 15;
    public int maxOverheat = 30;

    public Processor(String producer, String serialNumber, String modelName, int defaultMHZ) {
        super(producer, serialNumber, modelName, defaultMHZ, 15, 30);
    }

    @Override
    public String toString() {
        return "Processor parameters: defaultMHZ: " + defaultMHZ + ", currentMHZ: " + currentMHZ + ", overheatBy100MHZ: " + overheatBy100MHZ + ", maxOverheat: " + maxOverheat;
    }
}