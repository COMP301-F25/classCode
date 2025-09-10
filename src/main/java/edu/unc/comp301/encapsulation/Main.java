package edu.unc.comp301.encapsulation;

public class Main {
    public static void main(String[] args) {
        DoubleTriangle tri = new DoubleTriangle(0,0,1,2,2,0);
        DoubleTriangle tri2 = new DoubleTriangle(2,0,3,2,4,0);
        System.out.println(tri);
        System.out.println(tri2);

        Point a = new Point(0,0);
        Point b = new Point(1,2);
        Point c = new Point(2,0);

        Point e = new Point(3,2);
        Point f = new Point(4.0,0);

        //Both triangles are identical
        Triangle first = new PointTriangle(a,b,c);
        Triangle second = new PointTriangle(c,e,f);
        System.out.println(first);
        System.out.println(first.getPerimeter());
        System.out.println(second);
        System.out.println(second.getPerimeter());


        //Move the first
        first.transpose(2,0);

        System.out.println(first);
        System.out.println(first.getPerimeter());
        System.out.println(second);
        System.out.println(second.getPerimeter());

    }
}
