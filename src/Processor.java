public class Processor extends Computer {
/*
* takowanie np. 3000MHz
*/
    private int takowanie;
    private int powerTakowanie;
    private final int TEMP_WHEN_TAKOWANIE_INCREASE_ON_EACH_100MHZ = 10;


    public Processor(int regularTemp, int maxTemp, String producer, String serialNumber, int takowanie, int ram, int takowanie1, int powerTakowanie) {
        super(regularTemp, maxTemp, producer, serialNumber, takowanie, ram);
        this.takowanie = takowanie1;
        this.powerTakowanie = powerTakowanie;
    }

    public int getTakowanie() {
        return takowanie;
    }

    public void setTakowanie(int takowanie) {
        this.takowanie = takowanie;
    }

    @Override
    public void power() {
      takowanie += powerTakowanie;
        super.power();
    }

    public void isTempIncrease() {
        takowanie += powerTakowanie * TEMP_WHEN_TAKOWANIE_INCREASE_ON_EACH_100MHZ;

    }
}
