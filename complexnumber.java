class complex{
    double _r,_i;
    complex(double r,double i){
   _r=r;
   _i=i;
    }
    void display(){
        System.out.println("complex naumber"+_r+","+_i);
    }
}
 class complex1 extends complex{
    double _i;double _r;
    complex1(double r,double i){
    super(2,3);
    _r=r;
    _i=i;
    }
    complex add(){
        complex c1=new complex(super._r+_r,super._i+_i);
        return c1;
    }
 }
public class complexnumber {
    public static void main(String[] args) {
        complex1 c=new complex1(1,2);
        complex rws=c.add();
        rws.display();
    }
}
