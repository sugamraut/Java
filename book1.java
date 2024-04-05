 class Book{
 String title;
 private double price;

 public void setvar(String title,double price){
    this.title=title;
    this.price=price;
 }
 public void showvar(){
    System.out.println("Title"+title);
    System.out.println("price"+price);
 }

}

public class book1 {
    public static void main(String[] args) {
        Book[]obj=new Book[4];
        obj[0]=new Book();
        obj[0].setvar("java programmer",230);
        obj[1]=new Book();
        obj[1].setvar("python basic", 250);
        obj[2]=new Book();
        obj[2].setvar("java Advance", 500);
        obj[3]=new Book();
        obj[3].setvar("C++", 444);
        // for(Book book:obj){
        //     if(obj.title.toLowerCase().startsWith("java")){
        //         book.showvar();
        //     }
        // }
        for(int i=0;i<obj.length;i++){
       if(obj[i].title.toLowerCase().startsWith("java")){
                 Book.showVar();
            }
        }
    }
    
}
