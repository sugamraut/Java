class point{
    double x;
    double y;
    
    

}

class pointdistance {
    public static void main(String[] args) {
        point greater;
        point secondgreater;
        point p1=new point();
        p1.x=5;
        p1.y=6;
        point p2= new point();
        p2.x=3;
        p2.y=8;
        point p3=new point();
        p3.x=2;
        p3.y=1;
        
         if(p1.y>p2.y&&p1.y>p3.y){
            greater=p1;
        
        }
        else if(p2.y>p1.y&&p2.y>p3.y){
            greater=p2;

        }
        else{
            greater=p3;
        }

        if(p1.y>p2.y&&p1.y<p3.y||p1.y>p3.y&&p1.y<p2.y){
            secondgreater=p1;
        }
        else if(p2.y>p1.y&&p2.y<p3.y||p2.y>p3.y&&p2.y<p1.y){
            secondgreater=p2;
        }
        else{
            secondgreater=p3;
        }
        double distance= Math.sqrt(Math.pow(greater.x-secondgreater.x, 2)+Math.pow(greater.y-secondgreater.y, 2));
        System.out.println(distance);
    }
}
