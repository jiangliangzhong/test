package entity;

public class Cross {

    /**路口id*/
    private int id;
    private int roodIdUp;
    private int roadIdRight;
    private int roadIdDown;
    private int roadIdLeft;

    public Cross() {
    }

    public Cross(int id, int roodIdUp, int roadIdRight, int roadIdDown, int roadIdLeft) {
        this.id = id;
        this.roodIdUp = roodIdUp;
        this.roadIdRight = roadIdRight;
        this.roadIdDown = roadIdDown;
        this.roadIdLeft = roadIdLeft;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoodIdUp() {
        return roodIdUp;
    }

    public void setRoodIdUp(int roodIdUp) {
        this.roodIdUp = roodIdUp;
    }

    public int getRoadIdRight() {
        return roadIdRight;
    }

    public void setRoadIdRight(int roadIdRight) {
        this.roadIdRight = roadIdRight;
    }

    public int getRoadIdDown() {
        return roadIdDown;
    }

    public void setRoadIdDown(int roadIdDown) {
        this.roadIdDown = roadIdDown;
    }

    public int getRoadIdLeft() {
        return roadIdLeft;
    }

    public void setRoadIdLeft(int roadIdLeft) {
        this.roadIdLeft = roadIdLeft;
    }
}
