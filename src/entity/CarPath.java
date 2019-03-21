package entity;

/**描述车需要走的路径*/
public class CarPath {
    private Road road;
    private Cross fromCross;
    private Cross toCross;

    public CarPath() {
    }

    public CarPath(Road road, Cross fromCross, Cross toCross) {
        this.road = road;
        this.fromCross = fromCross;
        this.toCross = toCross;
    }

    public Road getRoad() {
        return road;
    }

    public void setRoad(Road road) {
        this.road = road;
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
