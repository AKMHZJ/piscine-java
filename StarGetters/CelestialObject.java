public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;

     public CelestialObject(){
        x=0.0;
        y=0.0;
        z=0.0;
        name="Soleil";
    }

    public CelestialObject(String name1, double x1, double y1, double z1){
        x=x1;
        y=y1;
        z=z1;
        name=name1;
    }

    public double getX(){
        return x;
    }

    public void setX(double x1){
        x = x1;
    }

    public double getY(){
        return y;
    }

    public void setY(double y1){
        y = y1;
    }

    public double getZ(){
        return z;
    }

    public void setZ(double z1){
        z = z1;
    }

    public String getName(){
        return name;
    }

    public void setName(String name1){
        name = name1;
    }
}
