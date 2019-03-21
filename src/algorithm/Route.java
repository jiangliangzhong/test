package algorithm;

import entity.Car;
import entity.Cross;
import entity.Road;
import readdata.ReadDataUtils;

import java.util.Arrays;
import java.util.Comparator;

/**计划路径*/
public class Route {
    private Car[] cars;
    private Road[] roads;
    private Cross[] crosses;

    public Route() {
        ReadDataUtils readDataUtils = new ReadDataUtils();
        this.cars = readDataUtils.readCar("Resource/car.txt");
        this.roads = readDataUtils.readRoad("Resource/road.txt");
        this.crosses = readDataUtils.readCross("Resource/cross.txt");

    }
    /**提前得到每辆车的路径*/
    public void getRoute(){
        Arrays.sort(cars, new MyComprator());
        //遍历每辆车
        for(Car car: cars){
            //TODO 得到每辆车的路径
        }
    }
    //比较器，x坐标从小到大排序；x相同时，按照y从小到大排序
    class MyComprator implements Comparator {
        public int compare(Object arg0, Object arg1) {
            Car t1=(Car)arg0;
            Car t2=(Car)arg1;
            if(t1.getPlanTime() != t2.getPlanTime())
                return t1.getPlanTime()>t2.getPlanTime()? 1:-1;
            else {
                if(t1.getId() > t2.getId()){return 1;}
                else if(t1.getId() < t2.getId()){return -1;}
                else{return 0;}
            }
        }
    }



}
