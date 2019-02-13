public class Processor extends Product implements Parameters {

    /**
     * taktowanie np. 3000MHz
     */

    private int timing;
    private int powerTiming;


    public Processor(String producer, String serialNumber, String modelName, int timing) {
        super(producer, serialNumber, modelName);
        this.timing = timing;
    }


    @Override
    public void setCurrentMHZ() {

    }

}
