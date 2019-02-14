public class HardDisk extends Product {

    private int capacity;

    public HardDisk(String producer, String serialNumber, String modelName, int capacity) {
        super(producer, serialNumber, modelName);
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Capacity for hardDisk: " + capacity;
    }
}
