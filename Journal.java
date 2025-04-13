public class Journal implements ILibraryResource {
    private String title;
    
    public Journal(String title) {
        this.title = title;
    }
    
    @Override
    public void borrow() {
        System.out.println("Borrowing journal: " + title);
    }
    
    @Override
    public String getTitle() {
        return title;
    }
}