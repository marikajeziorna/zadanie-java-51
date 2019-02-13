public class Processor extends Product {

    /**
     * taktowanie np. 3000MHz
     */

    private int timing;
    static int defaultMHZ;
    static int currentMHZ;
    static int overheatBy100MHZ;
    static int maxOverheat;


    public Processor(String producer, String serialNumber, String modelName, int timing) {
        super(producer, serialNumber, modelName);
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
