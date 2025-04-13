public class Book implements ILibraryResource {
    private String title;
    
    public Book(String title) {
        this.title = title;
    }
    
    @Override
    public void borrow() {
        System.out.println("Borrowing book: " + title);
    }
    
    @Override
    public String getTitle() {
        return title;
    }
}