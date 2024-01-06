package nee;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Book book = new Book("aaa","bbb","ccc","ddd",false);
        List<Book> books = new ArrayList<>();        
        List<Number> nums = new ArrayList<>();
        nums.add(5);        
        nums.add(4);
        nums.add(9);
        nums.add(2);
        nums.sort((o1, o2) -> Double.compare(o2.doubleValue(), o1.doubleValue()));
        System.out.println(nums);
        books.add(book);
        for(var i=0; i < books.size() ;i++){
            System.out.println(books.get(i).getTitle());
        }
        
    }
}
