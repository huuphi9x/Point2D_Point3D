public class Point3D extends Point2D {
    private float z;
    private float[] arrCoordinate3 = new float[3];

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
        arrCoordinate3 = new float[]{super.getCoordinate()[0], super.getCoordinate()[1], z};
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
        arrCoordinate3[2] = z;

    }

    public void setCoordinate(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
        arrCoordinate3 = new float[]{super.getCoordinate()[0], super.getCoordinate()[1], z};
    }

    @Override
    public float[] getCoordinate() {
        return arrCoordinate3;
    }

    @Override
    public String toString() {
        return "(" + arrCoordinate3[0] + ", " + arrCoordinate3[1] + ", " + arrCoordinate3[2] + ")";
    }
}