public class HardDisk extends Computer {
    private int capacity;

    public HardDisk(int regularTemp, int maxTemp, String producer, String serialNumber, int takowanie, int ram, int capacity) {
        super(regularTemp, maxTemp, producer, serialNumber, takowanie, ram);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
