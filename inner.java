class outer{
    int out_x=3;
public void printtest(){
    inner inner=new inner();
    inner.test();
}
class inner{
    int in_x=6;
    public void test(){
        System.out.println(out_x);
        System.out.println(in_x);
    }
}
}

class i {
    public static void main(String[] args) {
        outer o=new outer();
        o.printtest();
        
    }
}
