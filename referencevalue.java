

public class referencevalue {
    public static void test1(int v) {
        v=v+1;
        }
        public static void main(String[] args) {
            int a=2;
            System.out.println(a);
            test1(a);
            System.out.println(a);
        }
}

