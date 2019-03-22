package algorithm;

import entity.Car;
import entity.Road;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmSub {
    public List<Road> findRoadByCarFrom(int carFrom, Road[] roads){
        List<Road> results = new ArrayList<>();
        for(Road road:roads){
            if(road.getFrom() == carFrom){
                results.add(road);
            }
        }
        results  = results.stream().sorted(Comparator.comparing(Road::getDiff)).collect(Collectors.toList());
        return results;
    }
    public void generateResultTxt(Car[] cars){

    }
}
