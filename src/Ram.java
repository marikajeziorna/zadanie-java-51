public class Ram extends Product implements Parameters {
    private int ram;
    private final int TEMP_WHEN_RAM_INCREASE_ON_EACH_100MHZ = 15;
    int powerRam;

    public Ram(String producer, String serialNumber, String modelName, int ram) {
        super(producer, serialNumber, modelName);
        this.ram = ram;
    }

    @Override
    public void power() {
        ram += powerRam;
    }

    @Override
    public void isTempIncrease() {
        ram += powerRam * TEMP_WHEN_RAM_INCREASE_ON_EACH_100MHZ;
    }
}
