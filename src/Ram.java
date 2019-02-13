public class Ram extends Product implements Parameters {

    private int ram;
    int currentMHZ;

    public Ram(String producer, String serialNumber, String modelName, int ram) {
        super(producer, serialNumber, modelName);
        this.ram = ram;
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
