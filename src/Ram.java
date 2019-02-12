public class Ram extends Product implements Parameters {
    private int ram;
    private int powerRam;
    private final int TEMP_WHEN_RAM_INCREASE_ON_EACH_100MHZ = 15;

    public Ram(String producer, String serialNumber, String modelName, int ram, int powerRam) {
        super(producer, serialNumber, modelName);
        this.ram = ram;
        this.powerRam = powerRam;
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
