package entity;

import java.util.List;

/**
 * @author 王俊杰
 * @date 2019/3/22 9:56
 */
public class AlternativeCarPaths {
    private Car car;
    private List<CarPath> carPaths;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<CarPath> getCarPaths() {
        return carPaths;
    }

    public void setCarPaths(List<CarPath> carPaths) {
        this.carPaths = carPaths;
    }
}
