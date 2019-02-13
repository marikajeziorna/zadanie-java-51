public class Ram extends Product {

    private int ram;
    static int defaultMHZ;
    static int currentMHZ;
    static int overheatBy100MHZ;
    static int maxOverheat;

    public Ram(String producer, String serialNumber, String modelName, int ram) {
        super(producer, serialNumber, modelName);
        this.ram = ram;
    }


    public void setCurrentMHZ(int newCurrentMHZ) throws ToHighTempException {
        int calulateOverheat = (currentMHZ - defaultMHZ) / 100 * overheatBy100MHZ;
        if (overheatBy100MHZ > maxOverheat) {
            throw new ToHighTempException();
        } else {
            this.currentMHZ = newCurrentMHZ;
        }
    }
}
