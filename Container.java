//This is a generic class that can hold any type of object. It defines a container for an item of type T, 
//where T can be any object type (like String, Integer, or a custom object like Book). The class provides 
//methods to set (setItem) and get (getItem) the item, showcasing how generics can be used to create versatile 
//and reusable container classes.


public class Container<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

