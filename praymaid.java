public class praymaid {
    public static void main(String[] args) {
        int s=9;
    
        for(int i=1;i<=s;i++)
        {
            for(  int k=1;k<=s;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
              s--;
            System.out.println();
            
        }
    }
}
