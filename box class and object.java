class box{
    double length;
    double breadth;
    double height;
void setdim( double l,double b,double h){
    length=l;
    breadth=b;
    height=h;
     }
    double getvolume(){
      return(length*breadth*height);
    }
}
class demobox {
 public static void main(String[] args) {
    box b1;
    b1=new box();
    b1.setdim(1,2,3);
    double volume1=b1.getvolume();
     box b2=new box();
     b2.setdim(5, 3, 2);
     double volume2=b2.getvolume();
     System.out.println("the volume of box 1 is:"+volume1);
     System.out.println("the volume of box 2 is: "+volume2);
 }   
}
