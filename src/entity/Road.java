package entity;

public class Road {
    /**道路id*/
    private int id;
    /**道路长度*/
    private int lenght;
    /**道路限速*/
    private int speed;
    /**道路每侧的通道*/
    private int channel;
    /**道路的起点路口id*/
    private int from;
    /**道路终点的道路id*/
    private int to;
    /**是否是双向测到*/
    private int isDuplex;
    /**性能评估*/
    private float performance;
    /**车道上每处的信息,看是否有车和车的信息*/
    private Car[][] posCarInfos;
    public Road(int id, int lenght, int speed, int channel, int from, int to, int isDuplex) {
        this.id = id;
        this.lenght = lenght;
        this.speed = speed;
        this.channel = channel;
        this.from = from;
        this.to = to;
        this.isDuplex = isDuplex;
        int l = lenght + 1;
        int h = channel;
        if(isDuplex == 1){
            h = h * 2;
        }
        posCarInfos = new Car[h][l];
    }

    public float getPerformance() {
        return performance;
    }

    public void setPerformance(float performance) {
        this.performance = performance;
    }

    public Car[][] getPosCarInfos() {
        return posCarInfos;
    }

    public void setPosCarInfos(Car[][] posCarInfos) {
        this.posCarInfos = posCarInfos;
    }

    public Road() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getIsDuplex() {
        return isDuplex;
    }

    public void setIsDuplex(int isDuplex) {
        this.isDuplex = isDuplex;
    }
}
