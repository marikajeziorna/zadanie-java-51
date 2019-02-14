abstract public class Mhz extends Product {

    protected int defaultMHZ;
    protected int currentMHZ;
    protected int overheatBy100MHZ;
    protected int maxOverheat;

    public Mhz(String producer, String serialNumber, String modelName, int defaultMHZ, int overheatBy100MHZ, int maxOverheat) {
        super(producer, serialNumber, modelName);
        this.defaultMHZ = defaultMHZ;
        this.overheatBy100MHZ = overheatBy100MHZ;
        this.maxOverheat = maxOverheat;
    }

    public void setCurrentMHZ(int newCurrentMHZ) throws ToHighTempException {
        int calulatedOverheat = (newCurrentMHZ - defaultMHZ) / 100 * overheatBy100MHZ;

        if (calulatedOverheat > maxOverheat) {
            throw new ToHighTempException();
        } else {
            this.currentMHZ = newCurrentMHZ;
        }
    }

}