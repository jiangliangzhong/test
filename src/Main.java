import entity.Car;
import entity.Cross;
import entity.Road;
import readdata.ReadDataUtils;

public class Main {

    public static void main(String[] args) {
        ReadDataUtils readDataUtils = new ReadDataUtils();
        Car[] cars = readDataUtils.readCar("Resource/car.txt");
        Road[] roads = readDataUtils.readRoad("Resource/road.txt");
        Cross[] crosses = readDataUtils.readCross("Resource/cross.txt");
        System.out.println("df");
    }
}
