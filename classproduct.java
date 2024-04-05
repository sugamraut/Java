class product {
    String name;
    double price;
    double qty;

    product(double p, double q, String n) {

        price = p;
        qty = q;
        name = n;

    }

    void getname() {
        System.out.println(name);
    }

    void getqty() {
        System.out.println(qty);
    }

    void getprice() {
        System.out.println(price);
    }

    double gettotal() {
        return  price * qty;
        
    }
}

class demproduct {
    public static void main(String argS[]) {
        product p1 = new product(300, 15, "manang rice ");
        //product p2 = new product(210, 20, "basmati rice");
        p1.getname();
        p1.getqty();
        p1.getprice();
        p1.gettotal();
        System.out.println(p1.gettotal());

    }
}