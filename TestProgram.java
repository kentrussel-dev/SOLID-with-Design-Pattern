public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();
        
        // Borrowing different types of resources
        ILibraryResource book = new Book("Clean Code");
        ILibraryResource journal = new Journal("Nature");
        ILibraryResource thesis = new Thesis("Design Patterns Research");
        
        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
    
    }
}