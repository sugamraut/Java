public class wappper {
    public static int add(Integer a, int b){
        return a+b;
    }
public static void main(String[] args) {
    int b=5;
    Integer a=7;
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(15));
    System.out.println(a.toString().length());
    System.out.println(String.valueOf(b));
    Integer c=null;
    c=b;
    b=a;
    int sum=add(b,a);
    System.out.println(sum);
    Integer d=new Integer(5);
    System.out.println(d);

}
    
}
