package algorithm;

import entity.Car;
import entity.Cross;
import entity.Road;

/**
 * 调度主体结构
 * */
public class Algorithm {
    private Car[] cars;
    private Road[] roads;
    private Cross[] crosses;

    /**构造函数*/
    public Algorithm() {
    }

    /**开始调度*/
    public void start(){
        //所有车都到达了目的地
        boolean isSchedulFinish = false;
        int timeSlice = 0;
        while(!isSchedulFinish){
            timeSlice++;
        }
    }
    /**调度每条路*/
    public void scheduleRoad(){

    }
    /**调度每个路口*/
    public void scheduleCross(){

    }
}
