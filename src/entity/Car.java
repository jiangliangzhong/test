package entity;

import java.util.List;

/**
 * 车类
 * */
public class Car {
    private int id;
    /**起点*/
    private int from;
    /**目的地*/
    private int to;
    /**速度*/
    private int speed;
    /**计划出发时间*/
    private int planTime;
    /**等待状态(0)还是终止状态(1)，*/
    private int state;
    /**车的路径*/
    private List<CarPath> carPathList;
    /**当前在哪条路上, 对应路线的索引*/
    private int curLoad;
    /***该车的行经状态：0:，未出发，1.已经出发，2.已经到达*/
    private int carRouteState;
    /**真正开始出发的时间*/
    private int startTime;
    public Car(int id, int from, int to, int speed, int planTime) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.speed = speed;
        this.planTime = planTime;
        this.carRouteState = 0;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getCurLoad() {
        return curLoad;
    }

    public void setCurLoad(int curLoad) {
        this.curLoad = curLoad;
    }

    public int getCarRouteState() {
        return carRouteState;
    }

    public void setCarRouteState(int carRouteState) {
        this.carRouteState = carRouteState;
    }

    public Car() {
    }

    public List<CarPath> getCarPathList() {
        return carPathList;
    }

    public void setCarPathList(List<CarPath> carPathList) {
        this.carPathList = carPathList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPlanTime() {
        return planTime;
    }

    public void setPlanTime(int planTime) {
        this.planTime = planTime;
    }
}
