public interface Parameters {

//    static final int TEMP_WHEN_TAMING_INCREASE_ON_EACH_100MHZ = 10;
//    static final int TEMP_WHEN_RAM_INCREASE_ON_EACH_100MHZ = 15;
//    static final int;
//    static final int MAX_TEMP = 40;

    int DEFAULT_MHZ = 2500;
    int OVER_HEAT_BY100MHZ = 10;
    int MAX_OVER_HEAT = 20;


    void setCurrentMHZ(int newCurrentMHZ) throws ToHighTempException;


}

