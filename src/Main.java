public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Гоголь ");
        Author author2 = new Author("Александр", "Пушкин ");
        Book book1 = new Book("Мёртвые души ", author1, 1989);
        Book book2 = new Book("Капитанская дочка ", author2, 2011);
        book1.setYearOfPublication(1996);
        System.out.println("Название книги: " + book1.getBookTitle() + ", Автор: " + book1.getAuthor() + ", Год публикации: " + book1.getYearOfPublication());
        System.out.println("Название книги: " + book2.getBookTitle() + ", Автор: " + book2.getAuthor() + ", Год публикации: " + book2.getYearOfPublication());
    }
}