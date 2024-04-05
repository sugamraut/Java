class Book {
    private String title;
    private double price;

    public void setVar(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void showVar() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public String getTitle() {
        return this.title;
    }
}

 class Main3 {
    public static void main(String[] args) {
        Book[] books = new Book[4];

        // Initialize books
        books[0] = new Book();
        books[0].setVar("Java Programming", 30.0);

        books[1] = new Book();
        books[1].setVar("Python Basics", 25.0);

        books[2] = new Book();
        books[2].setVar("Java Advanced", 40.0);

        books[3] = new Book();
        books[3].setVar("C++ Fundamentals", 35.0);

        // Display records for books starting with "Java"
        for (Book book : books) {
            if (book.getTitle().toLowerCase().startsWith("java")) {
                book.showVar();
            }
        }
    }
}
