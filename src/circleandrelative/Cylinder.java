package circleandrelative;

public class Cylinder extends Circle {
    private double height = 9;
    public Cylinder(){};
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }
    @Override
    public void setColor(String color){
        super.setColor(color);
    }
    @Override
    public void setRadius(double radius){
        super.setRadius(radius);
    }
    @Override
    public String toString(){
        return "A cylinder with " + super.toString()+ " and height "+ getHeight()+" has volume " + getVolume();
    }
}
