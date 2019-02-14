public class TestClass {
    public static void main(String[] args) {

        Processor processor = new Processor("TYUI", "TYU987", "MNJKLK", 1000);
        Ram ram = new Ram("TYUI", "GJH98", "GHJK", 2500, 1000);
        HardDisk hardDisk = new HardDisk("KLP", "HJK789", "KLK", 120);
        Computer computer = new Computer("Apple", "TYUI9876hjk", "HKLJK", processor, ram, hardDisk);

        System.out.println(computer.toString() + "\n");
        try {
            processor.setCurrentMHZ(1000);
        } catch (ToHighTempException e) {
            e.printStackTrace();
        }
        System.out.println(processor.toString() + "\n");
        try {
            ram.setCurrentMHZ(1000);
        } catch (ToHighTempException e) {
            e.printStackTrace();
        }
        System.out.println(ram.toString() + "\n");
        hardDisk.setCapacity(2000);
        System.out.println(hardDisk.toString() + "\n");

/**
 * Exception in thread:
 */
        try {
            processor.setCurrentMHZ(5000);
        } catch (ToHighTempException e) {
            e.printStackTrace();
        }
        processor.toString();

        try {
            ram.setCurrentMHZ(5000);
        } catch (ToHighTempException e) {
            e.printStackTrace();
        }
        ram.toString();
    }
}