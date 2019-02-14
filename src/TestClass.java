public class TestClass {
    public static void main(String[] args) throws ToHighTempException {

        Processor processor = new Processor("TYUI", "TYU987", "MNJKLK", 1000);
        Ram ram = new Ram("TYUI", "GJH98", "GHJK", 2500, 1000);
        HardDisk hardDisk = new HardDisk("KLP", "HJK789", "KLK", 120);
        Computer computer = new Computer("Apple", "TYUI9876hjk", "HKLJK", processor, ram, hardDisk);

        System.out.println(computer.toString() + "\n");
        processor.setCurrentMHZ(1000);
        System.out.println(processor.toString() + "\n");
        ram.setCurrentMHZ(1000);
        System.out.println(ram.toString() + "\n");
        hardDisk.setCapacity(2000);
        System.out.println(hardDisk.toString() + "\n");

/**
 * Exception in thread:
 */
        processor.setCurrentMHZ(5000);
        processor.toString();

        ram.setCurrentMHZ(5000);
        ram.toString();
    }
}