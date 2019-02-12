public class Processor extends Product implements Parameters {
/*
* takowanie np. 3000MHz
*/
    private int takowanie;
    private final int TEMP_WHEN_TAKOWANIE_INCREASE_ON_EACH_100MHZ = 10;
    int powerTakowanie;


    public Processor(String producer, String serialNumber, String modelName, int takowanie) {
        super(producer, serialNumber, modelName);
        this.takowanie = takowanie;
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
