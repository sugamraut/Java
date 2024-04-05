public class StringBufferDemo {
   public static void main(String[] args) {
       //mutable string
       StringBuffer sb=new StringBuffer();
       sb.append("praveen");
       System.out.println(sb.capacity());
       System.out.println(sb.length());
       sb.append("hello");
       System.out.println(sb);
       String s1=new String("Praveen");
       s1.concat("hello");
    
       System.out.println(s1);
       sb.append("Studying in sdc");
       sb.append("working in other colleges too");
       System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
       String s2=sb.toString();
   } 
}