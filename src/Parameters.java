abstract public class Parameters {
    private int regularTemp = 20;
    private int maxTemp = 30;

    public Parameters(int regularTemp, int maxTemp) {
        this.regularTemp = regularTemp;
        this.maxTemp = maxTemp;
    }

    public int getRegularTemp() {
        return regularTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void isTempIncrease(){
    }
}
