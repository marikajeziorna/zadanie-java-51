public class Ram extends Computer {
    private int ram;
    private int powerRam;
    private final int TEMP_WHEN_RAM_INCREASE_ON_EACH_100MHZ = 15;


    public Ram(int regularTemp, int maxTemp, String producer, String serialNumber, int takowanie, int ram, int ram1, int powerRam) {
        super(regularTemp, maxTemp, producer, serialNumber, takowanie, ram);
        this.ram = ram1;
        this.powerRam = powerRam;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void power() {
        ram += powerRam;
        super.power();
    }

    @Override
    public void isTempIncrease() {
        ram += powerRam * TEMP_WHEN_RAM_INCREASE_ON_EACH_100MHZ;
    }
}
