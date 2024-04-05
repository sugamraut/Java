import java.util.Scanner;
class point{
    double _x,_y;
    point(double x,double y){
        _x=x;
        _y=y;
    }
}
public class classgreatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        point []p;
        
        p=new point[s];
        for(int i=0;i<s;i++){
           int x=sc.nextInt();
           int y=sc.nextInt();
            p[i]=new point(x,y);
        }
        point max=p[0];
        point small=p[0];
        for(int i=0;i<s;i++){
            if(p[i].y >max){
                max=p[i];
            }
        }
        for(int i=0;i<p.length;i++){
            if(p[i]._y<max._y&&p[i]._y>max._y)
            {
                small=p[i];
            }
        }


    }
    
}
