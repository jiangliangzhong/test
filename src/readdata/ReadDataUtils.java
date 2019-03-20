package readdata;

import entity.Car;
import entity.Cross;
import entity.Road;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 读取所有数据
 * */
public class ReadDataUtils {
    public List<String> getLines(String filePath){
        List<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
    /**读取车辆数据，索引基地址10000*/
    public Car[] readCar(String filePath){
        List<String> carStrList = this.getLines(filePath);
        // 对ArrayList中存储的字符串进行处理
        int length = carStrList.size();
        Car[] cars = new Car[length];
        for(int i=1;i<length;i++){
            String carStr = carStrList.get(i);
            carStr = carStr.replace("(","");
            carStr = carStr.replace(")", "");
            carStr = carStr.replace(" ", "");
            String[] strings = carStr.split(",");
            Car car = new Car(Integer.valueOf(strings[0]),Integer.valueOf(strings[1]),Integer.valueOf(strings[2]),
                    Integer.valueOf(strings[3]),Integer.valueOf(strings[4]));
            cars[i-1] = car;
        }
        return cars;
    }
    /**读取道路数据，索引基地址5000*/
    public Road[] readRoad(String filePath){
        List<String> roadStrList = this.getLines(filePath);
        // 对ArrayList中存储的字符串进行处理
        int length = roadStrList.size();
        Road[] roads = new Road[length];
        for(int i=1;i<length;i++){
            String carStr = roadStrList.get(i);
            carStr = carStr.replace("(","");
            carStr = carStr.replace(")", "");
            carStr = carStr.replace(" ", "");
            String[] strings = carStr.split(",");
            Road road = new Road(Integer.valueOf(strings[0]),Integer.valueOf(strings[1]),Integer.valueOf(strings[2]),
                    Integer.valueOf(strings[3]),Integer.valueOf(strings[4]),Integer.valueOf(strings[5]),Integer.valueOf(strings[6]));
            roads[i-1] = road;
        }
        return roads;
    }
    /**读取路口数据，索引基地址0*/
    public Cross[] readCross(String filePath){
        List<String> CrossStrList = this.getLines(filePath);
        // 对ArrayList中存储的字符串进行处理
        int length = CrossStrList.size();
        Cross[] crosses = new Cross[length];
        for(int i=1;i<length;i++){
            String carStr = CrossStrList.get(i);
            carStr = carStr.replace("(","");
            carStr = carStr.replace(")", "");
            carStr = carStr.replace(" ", "");
            String[] strings = carStr.split(",");
            Cross cross = new Cross(Integer.valueOf(strings[0]),Integer.valueOf(strings[1]),Integer.valueOf(strings[2]),
                    Integer.valueOf(strings[3]), Integer.valueOf(strings[4]));
            crosses[i] = cross;
        }
        return crosses;
    }
    /**
     * 计算车道性能
     * */
    public void calRoadPerform(){

    }
}
