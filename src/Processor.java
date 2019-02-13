public class Processor extends Product implements Parameters {

    /**
     * taktowanie np. 3000MHz
     */

    private int timing;
    int currentMHZ;


    public Processor(String producer, String serialNumber, String modelName, int timing) {
        super(producer, serialNumber, modelName);
    }


    @Override
    public void setCurrentMHZ(int newCurrentMHZ) throws ToHighTempException {
        int calulateOverheat = (currentMHZ - DEFAULT_MHZ) / 100 * OVER_HEAT_BY100MHZ;
        if (OVER_HEAT_BY100MHZ > MAX_OVER_HEAT) {
            throw new ToHighTempException();
        } else {
            this.currentMHZ = newCurrentMHZ;
        }
    }
}
