public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("upin&ipin", "santun", 10, 30000);
        Library lib = new Library(b1, "perpustakaan kampus");
        lib.showLibraryInfo();
    }
}
