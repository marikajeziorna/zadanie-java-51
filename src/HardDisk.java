public class HardDisk extends Product {
    private int capacity;

    public HardDisk(String producer, String serialNumber, String modelName, int capacity) {
        super(producer, serialNumber, modelName);
        this.capacity = capacity;
    }
}
