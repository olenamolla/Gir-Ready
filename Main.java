//This program demonstrates the usage of the Container and KeyValueStore classes. It shows how these generic 
//classes can be instantiated with different types, including custom objects like Book, as well as basic data 
//types like String and Integer.

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Using Container with a Book object
        Container<Book> bookContainer = new Container<>();
        bookContainer.setItem(new Book("The Hobbit", "J.R.R. Tolkien"));
        System.out.println("Book Container holds: " + bookContainer.getItem());

        // Using Container with a String
        Container<String> noteContainer = new Container<>();
        noteContainer.setItem("Remember to buy bread");
        System.out.println("Note Container says: " + noteContainer.getItem());
        System.out.println("Extra piece of code here!");
        
        // Using KeyValueStore with String and Integer for a user's age
        KeyValueStore<String, Integer> userAgeStore = new KeyValueStore<>("Alice", 30);
        System.out.println("User: " + userAgeStore.getKey() + ", Age: " + userAgeStore.getValue());
    }
}

