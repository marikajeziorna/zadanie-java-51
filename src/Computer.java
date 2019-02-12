public class Computer extends Product{
    private Processor processor;
    private Ram ram;
    private HardDisk hardDisk;

//    public Computer(String producer, String serialNumber, String modelName, int takowanie, int ram, int capacity) {
//        super(producer, serialNumber, modelName);
//    }

    public Computer(String producer, String serialNumber, String modelName, Processor processor, Ram ram, HardDisk hardDisk) {
        super(producer, serialNumber, modelName);
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.processor = processor;
    }

}










