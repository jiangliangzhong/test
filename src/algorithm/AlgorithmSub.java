package algorithm;

import entity.Car;
import entity.CarPath;
import entity.Road;

import java.io.*;
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
    public List<Road> findRoadByCarTo(int carTo, Road[] roads){
        List<Road> results = new ArrayList<>();
        for(Road road:roads){
            if(road.getTo() == carTo){
                results.add(road);
            }
        }
        results  = results.stream().sorted(Comparator.comparing(Road::getDiff)).collect(Collectors.toList());
        return results;
    }
    public void generateResultTxt(Car[] cars){
        String fileName = "answers.txt";
        try {
            FileWriter fw = new FileWriter(new File(fileName));
            BufferedWriter bw = new BufferedWriter(fw);
            for(Car car:cars){
                List<CarPath> carPathList = car.getCarPathList();
                StringBuilder answer = new StringBuilder();

                answer.append(car.getId()+",");
                answer.append(car.getStartTime());
                for(CarPath carPath:carPathList){
//                    answer.append(","+carPath.getRoad());
                }
                bw.write(answer.toString()+"\t\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
