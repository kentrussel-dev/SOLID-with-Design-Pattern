public class Thesis implements ILibraryResource {
    private String title;
    
    public Thesis(String title) {
        this.title = title;
    }
    
    @Override
    public void borrow() {
        System.out.println("Borrowing thesis: " + title);
    }
    
    @Override
    public String getTitle() {
        return title;
    }
}