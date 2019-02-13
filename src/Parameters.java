public interface Parameters {

//    static final int TEMP_WHEN_TAMING_INCREASE_ON_EACH_100MHZ = 10;
//    static final int TEMP_WHEN_RAM_INCREASE_ON_EACH_100MHZ = 15;
//    static final int;
//    static final int MAX_TEMP = 40;

//    static int defaultMHZ;
//    static int currentMHZ;
//    static int overheatBy100MHZ;
//    static int maxOverheat;


    void setCurrentMHZ() throws ToHighTempException;

    void isTempIncrease();

    void power();
}

