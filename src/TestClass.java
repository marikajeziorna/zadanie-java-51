public class TestClass {
    public static void main(String[] args) {
        Processor processor = new Processor("TYUI", "TYU987", "MNJKLK", 3000);
        Ram ram = new Ram("TYUI", "GJH98", "GHJK", 2500);
        HardDisk hardDisk = new HardDisk("KLP", "HJK789", "KLK", 120);
        Computer computer = new Computer("Apple", "TYUI9876hjk", "HKLJK", processor, ram, hardDisk);
        
    }
}
