package algorithm;

import java.util.LinkedList;
import java.util.List;

import entity.Car;
import entity.CarPath;
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

    private List<CarPath> getRoute(List<CarPath> carPaths, int carFrom, int carTo, boolean isExceed){
    	//todo 获取CarFrom对应的RoadFrom的所有roads
		Road road = new Road();
		if (carTo == road.getTo()){
			return carPaths;
		}else if (road.getTo() < carTo){
			//未超过
			//添加该road到备选List中
			carPaths.add(new CarPath(road));
			getRoute(carPaths, road.getTo(), carTo, false);
		}else {
			//超过了
			//添加该road到备选List中
			carPaths.add(new CarPath(road));
			getRoute(carPaths, road.getTo(), carTo, true);
		}

		//todo 未找到路径的处理
		return new LinkedList<>();
	}



}
