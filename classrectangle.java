class Recatagle{
    double length,breath;
    Recatagle(double l,double b){
        length=l;
        breath=b;
    }
    double computeArea(){
        return length*breath;
    }
    void dispalyArea(){
        System.out.println(computeArea());
    }

}
public class classrectangle {
    public static void main(String[] args) {
        Recatagle r1=new Recatagle(2,3);
        Recatagle r2= new Recatagle(4, 5);
        r1.dispalyArea();
        r2.dispalyArea();
        if(r1.computeArea()<r2.computeArea()){
            System.out.println("the largest area rectangle");
           r2.dispalyArea();
        }
        else{
             System.out.println("the largest area rectangle");
            r1.dispalyArea();

        }
    }
}
