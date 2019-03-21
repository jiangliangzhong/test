package algorithm;

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

    private boolean routeForward(List<CarPath> carPaths, int carFrom, int carTo, boolean isExceed){

        Road road = new Road();
        //未超过 正向走 from→to
        if (!isExceed){
            //todo 获取CarFrom对应的RoadFrom的所有road
            if (carTo == road.getTo()){
                return true;
            }else if (road.getTo() < carTo){
                //未超过
                //添加该road到备选List中
                carPaths.add(new CarPath(road));
                routeForward(carPaths, road.getTo(), carTo, false);
            }else {
                //超过了
                //添加该road到备选List中
                carPaths.add(new CarPath(road));
                routeForward(carPaths, road.getTo(), carTo, true);
            }
        //超过 反向走，to→from
        }else {
            //todo 获取CarFrom对应的RoadTo的所有roads,且双向
            if (carTo == road.getFrom()){
                return true;
            }else if (road.getFrom() > carTo){
                //反向时未超过
                //添加该road到备选List中
                carPaths.add(new CarPath(road));
                routeForward(carPaths, road.getFrom(), carTo, true);
            }else {
                //在已经超过且开始反向的情况下，不允许再次超过
                return false;
            }
        }

		//todo 未找到路径的处理
		return false;
	}

    private boolean routeBackward(List<CarPath> carPaths, int carFrom, int carTo, boolean isExceed){

        Road road = new Road();
        //未超过 反向走 to→from
        if (!isExceed){
            //todo 获取CarFrom对应的RoadTo的所有road,且双向
            if (carTo == road.getFrom()){
                return true;
            }else if (road.getFrom() > carTo){
                //未超过
                //添加该road到备选List中
                carPaths.add(new CarPath(road));
                routeBackward(carPaths, road.getFrom(), carTo, false);
            }else {
                //超过了
                //添加该road到备选List中
                carPaths.add(new CarPath(road));
                routeBackward(carPaths, road.getFrom(), carTo, true);
            }
            //超过 正向走，from→to
        }else {
            //todo 获取CarFrom对应的RoadFrom的所有roads
            if (carTo == road.getTo()){
                return true;
            }else if (road.getTo() < carTo){
                //反向时未超过
                //添加该road到备选List中
                carPaths.add(new CarPath(road));
                routeBackward(carPaths, road.getTo(), carTo, true);
            }else {
                //在已经超过且开始反向的情况下，不允许再次超过
                return false;
            }
        }

        //todo 未找到路径的处理
        return false;
    }



}
