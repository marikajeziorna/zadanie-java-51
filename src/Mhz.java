abstract public class Mhz extends Product {

    public int defaultMHZ;
    public int currentMHZ;
    public int overheatBy100MHZ = 0;
    public int maxOverheat = 0;

    public Mhz(String producer, String serialNumber, String modelName, int defaultMHZ) {
        super(producer, serialNumber, modelName);
        this.defaultMHZ = defaultMHZ;
    }

    public void setCurrentMHZ(int newCurrentMHZ) throws ToHighTempException {
        int calulatedOverheat = (currentMHZ - defaultMHZ) / 100 * overheatBy100MHZ;
        if (calulatedOverheat > maxOverheat) {
            throw new ToHighTempException();
        } else {
            this.currentMHZ = newCurrentMHZ;
        }
    }

}