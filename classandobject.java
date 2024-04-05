class sp{
    double x,y;

public sp (double x1,double y1) {
x=x1;
y=y1;
}
public double getx(){return x;};
public double gety(){return y;};
public double  distance( sp p){
    return Math.sqrt(Math.pow(p.getx()-x,2)+Math.pow(p.gety()-y,2));

}
}

public class classandobject {
    public static void main(String[] args) {
        sp p1=new sp(5,6);
        sp p2=new sp(3,8);
        System.out.println(p1.distance(p2));
    }
}
