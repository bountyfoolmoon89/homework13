public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Виктор", "Пелевин");
        Book generationP = new Book(author1, "Generation «П»", 1999);
        System.out.println("Автор: " + author1.getName() + " " + author1.getSurname());
        System.out.println("Название: " + generationP.getBookName());
        System.out.println("Год первого издания: " + generationP.year);
        generationP.setYear(2022);
        System.out.println("Год последнего издания: " + generationP.year);
        System.out.println("--------------------------------------------------");
        Author author2 = new Author("Дмитрий", "Глуховский");
        Book text = new Book(author2, "Текст", 2017);
        System.out.println("Автор: " + author2.getName() + " " + author2.getSurname());
        System.out.println("Название: " + text.getBookName());
        System.out.println("Год первого издания: " + text.year);
    }
}