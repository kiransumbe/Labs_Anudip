package firstproject;
import java.util.Scanner;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        public class bookDemo {
            private int bookid;
            private String title;
            private String author;
            private double price;

            public bookDemo(int bookid, String title, String author, double price) {
                this.bookid = bookid;
                this.title = title;
                this.author = author;
                this.price = price;
            }

            public void displayDetails() {
                if (bookid != 0) {
                    System.out.println("Book ID: " + bookid);
                    System.out.println("Title: " + title);
                    System.out.println("Author: " + author);
                    System.out.println("Price: $" + price);
                }
                else {
                    System.out.println("Book not available");
                }
            }

            public static void main(String[] args) {
                // Creating an object of the Book class and assigning values
                bookDemo book1 = new bookDemo(1, "The wings of fire", "A.P.J.Abdul kalam", 15.99);
        bookDemo book2=new bookDemo(2,"Me ak swapn pail","Rajendra bharud",30.56);
            bookDemo book3=new bookDemo(3,"Time machine","H G wells",45.36);   
                book1.displayDetails();
                book2.displayDetails();
                book3.displayDetails();
            }
        }