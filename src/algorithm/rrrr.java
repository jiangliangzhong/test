package algorithm;

import entity.AlternativeCarPaths;
import entity.CarPath;
import entity.Road;

import java.util.List;

/**
 * @author 王俊杰
 * @date 2019/3/22 9:28
 */
public class rrrr {

    /**
     * 前向寻路
     * @param alternativeCarPaths 某car的所有备选路径
     * @param carPaths 某一条备选路径
     * @param carFrom 起始
     * @param carTo 终点
     * @param isExceed 是否超过终点
     * @return 寻路成功？
     */
    private boolean routeForward(AlternativeCarPaths alternativeCarPaths, CarPath carPaths, int carFrom, int carTo, boolean isExceed){

        Road road = new Road();

        //未超过 正向走 from→to
        if (!isExceed){
            //todo 获取CarFrom对应的RoadFrom的所有road
            if (carTo == road.getTo()){
                //到达目的地，添加该线径到总备选路线中
                alternativeCarPaths.getCarPaths().add(carPaths);
                return true;
            }else if (road.getTo() < carTo){
                //未超过
                //添加该road到备选List中
                carPaths.getRoads().add(road);
                routeForward(alternativeCarPaths, carPaths, road.getTo(), carTo, false);
            }else {
                //超过了
                //添加该road到备选List中
                carPaths.getRoads().add(road);
                routeForward(alternativeCarPaths, carPaths, road.getTo(), carTo, true);
            }
            //超过 反向走，to→from
        }else {
            //todo 获取CarFrom对应的RoadTo的所有roads,且双向
            if (carTo == road.getFrom()){
                //到达目的地，添加该线径到总备选路线中
                alternativeCarPaths.getCarPaths().add(carPaths);
                return true;
            }else if (road.getFrom() > carTo){
                //反向时未超过
                //添加该road到备选List中
                carPaths.getRoads().add(road);
                routeForward(alternativeCarPaths, carPaths, road.getFrom(), carTo, true);
            }else {
                //在已经超过且开始反向的情况下，不允许再次超过
                return false;
            }
        }

        //todo 未找到路径的处理
        return false;
    }

    private boolean routeBackward(AlternativeCarPaths alternativeCarPaths, CarPath carPaths, int carFrom, int carTo, boolean isExceed){

        Road road = new Road();
        //未超过 反向走 to→from
        if (!isExceed){
            //todo 获取CarFrom对应的RoadTo的所有road,且双向
            if (carTo == road.getFrom()){
                alternativeCarPaths.getCarPaths().add(carPaths);
                return true;
            }else if (road.getFrom() > carTo){
                //未超过
                //添加该road到备选List中
                carPaths.getRoads().add(road);
                routeBackward(alternativeCarPaths, carPaths, road.getFrom(), carTo, false);
            }else {
                //超过了
                //添加该road到备选List中
                carPaths.getRoads().add(road);
                routeBackward(alternativeCarPaths, carPaths, road.getFrom(), carTo, true);
            }
            //超过 正向走，from→to
        }else {
            //todo 获取CarFrom对应的RoadFrom的所有roads
            if (carTo == road.getTo()){
                //到达目的地，添加该线径到总备选路线中
                alternativeCarPaths.getCarPaths().add(carPaths);
                return true;
            }else if (road.getTo() < carTo){
                //反向时未超过
                //添加该road到备选List中
                carPaths.getRoads().add(road);
                routeBackward(alternativeCarPaths, carPaths, road.getTo(), carTo, true);
            }else {
                //在已经超过且开始反向的情况下，不允许再次超过
                return false;
            }
        }

        //todo 未找到路径的处理
        return false;
    }
}
