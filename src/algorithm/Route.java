package algorithm;

import entity.Car;
import entity.Cross;
import entity.Road;
import readdata.ReadDataUtils;

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

}
