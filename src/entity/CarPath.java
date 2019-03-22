package entity;

import java.util.List;

/**描述车需要走的路径*/
public class CarPath {
    private List<Road> roads;
    private Cross fromCross;
    private Cross toCross;

    public CarPath() {
    }

    public CarPath(List<Road> roads) {
        this.roads = roads;
    }

    public CarPath(List<Road> roads, Cross fromCross, Cross toCross) {
        this.roads = roads;
        this.fromCross = fromCross;
        this.toCross = toCross;
    }

    public List<Road> getRoads() {
        return roads;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }

    public Cross getFromCross() {
        return fromCross;
    }

    public void setFromCross(Cross fromCross) {
        this.fromCross = fromCross;
    }

    public Cross getToCross() {
        return toCross;
    }

    public void setToCross(Cross toCross) {
        this.toCross = toCross;
    }
}
