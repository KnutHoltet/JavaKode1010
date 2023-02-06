public class Book {
    public String title;
    public Book(String title) throws IllegalAccessException {
        setTitle(title);
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) throws IllegalAccessException {
        if(!title.matches("^[a-zA-Z0-9]+$")){
            throw new IllegalAccessException("Book can only contain letters and digits");
        }
        this.title = title;
    }

    class Dictonary extends Book{
        int wordCount;

        public Dictonary(String title) throws IllegalAccessException {
            super(title);
        }
    }

    class Cartoon extends Book{
        int stripCount;

        public Cartoon(String title) throws IllegalAccessException {
            super(title);
        }
    }
}