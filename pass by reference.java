 class A{
    int a;
 }
 class passreference {
    public static void test(A obj){
        obj.a=obj.a+1;
    }
    public static void main(String[] args) {
        A obj=new A();
        obj.a=20;
        System.out.println(obj.a);
        test(obj);
        System.out.println(obj.a);
    }
    
}
