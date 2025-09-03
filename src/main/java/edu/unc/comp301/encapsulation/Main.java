package edu.unc.comp301.encapsulation;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(1,2);
        Point c = new Point(2,0);

        Point d = new Point(3,2);
        Point e = new Point(4.0,0);


        //Both triangles are identical
        Triangle first = new PointTriangle(a,b,c);
        Triangle second = new PointTriangle(c,d,e);
        System.out.println(first);
        System.out.println(first.getPerimeter());
        System.out.println(second);
        System.out.println(second.getPerimeter());


//        //Move the first
//        first.transpose(2,0);
//
//        //triangles are no longer identical
//        System.out.println(first);
//        System.out.println(first.getPerimeter());
//        System.out.println(second);
//        System.out.println(second.getPerimeter());


    }
}
