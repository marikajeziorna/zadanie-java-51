public class Ram extends Product implements Parameters {

    private int ram;
    private int defaultMHZ;
    private int currentMHZ;
    private final int overheatBy100MHZ = 15;
    private final int maxOverheat = 60;

    public Ram(String producer, String serialNumber, String modelName, int ram, int defaultMHZ, int currentMHZ) {
        super(producer, serialNumber, modelName);
        this.ram = ram;
        this.defaultMHZ = defaultMHZ;
        this.currentMHZ = currentMHZ;
    }

    @Override
    public void setCurrentMHZ() throws ToHighTempException {
        int calulateOverheat = (currentMHZ - defaultMHZ) / 100 * overheatBy100MHZ;
        if (overheatBy100MHZ > maxOverheat) {
            throw new ToHighTempException();
        } else {
            this.currentMHZ = currentMHZ;
        }
    }


}
