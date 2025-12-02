package edu.unc.comp301.encapsulation;

public class PointTriangle implements Triangle{
    //Making these final does not fix bug.
    private Point a;
    private Point b;
    private Point c;

    public PointTriangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return String.format("%s,%s,%s", this.a, this.b,this.c);
    }

    @Override
    public double getPerimeter() {
        return this.a.distanceTo(this.b) + this.b.distanceTo(this.c) + this.c.distanceTo(this.a);
    }

    public void transpose(double xDir, double yDir){
        this.a.setX(this.a.getX()+xDir);
        this.a.setY(this.a.getY()+yDir);
        this.b.setX(this.b.getX()+xDir);
        this.b.setY(this.b.getY()+yDir);
        this.c.setX(this.c.getX()+xDir);
        this.c.setY(this.c.getY()+yDir);
    }

}
