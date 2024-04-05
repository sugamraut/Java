 class productofnumber {
      public static int prod(int x,int y){
        if(y==1)
        return x;
        else{
            return x+prod(x,y-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(prod(2,3));
    }
}