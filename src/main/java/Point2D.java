public class Point2D {
    private float x;
    private float y;

    private float[] arrCoordinate = new float[2];

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
        arrCoordinate = new float[]{x, y};
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
        arrCoordinate[0] = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
        arrCoordinate[1] = y;
    }

    public void setCoordinate(float x,float y){
        setX(x);
        setY(y);
    }

    public float[] getCoordinate() {
        return arrCoordinate;
    }

    @Override
    public String toString() {
        return "(" + arrCoordinate[0] + ", " + arrCoordinate[1] + ")";
    }
}