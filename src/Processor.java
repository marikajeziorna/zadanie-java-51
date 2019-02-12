public class Processor extends Product implements Parameters {
/*
* takowanie np. 3000MHz
*/
    private int takowanie;
    private int powerTakowanie;
    private final int TEMP_WHEN_TAKOWANIE_INCREASE_ON_EACH_100MHZ = 10;


    public Processor(String producer, String serialNumber, String modelName, int takowanie, int powerTakowanie) {
        super(producer, serialNumber, modelName);
        this.takowanie = takowanie;
        this.powerTakowanie = powerTakowanie;
    }

    @Override
    public void power() {
      takowanie += powerTakowanie;
    }

    @Override
    public void isTempIncrease() {
        takowanie += powerTakowanie * TEMP_WHEN_TAKOWANIE_INCREASE_ON_EACH_100MHZ;

    }
}
