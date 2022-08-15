import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author antonChehov = new Author("Antom", "Chehov");
        Author antonChehov2 = new Author("Antom", "Chehov");
        Author levTolstoi = new Author("Lev", "Tolstoi");
        Author andreiKlimov = new Author("Andrei", "Klimov");


        Book warAndPeace = new Book("warAndPeace", 1820, levTolstoi);
        Book chameleon = new Book("antonChehov", 1884, antonChehov);
        Book catAndDog = new Book("catAndDog", 1523,andreiKlimov);

        System.out.println("Aвтор: " + antonChehov.getFullName());
        System.out.println("Aвтор: " + levTolstoi.getFullName());
        System.out.println("Aвтор: " + andreiKlimov.getFullName());


        System.out.println("Название книги: " + warAndPeace.getName() + ",Год издания : " + warAndPeace.getYeaOfPublication() + " ,Aвтор: " + antonChehov.getFullName());
        System.out.println("Название книги: " + chameleon.getName() + ",Год издания : " + chameleon.getYeaOfPublication() + " ,Aвтор: " + levTolstoi.getFullName());

        System.out.println(warAndPeace);
        System.out.println(antonChehov.hashCode()==antonChehov2.hashCode());
        System.out.println(antonChehov.equals(antonChehov2));

    }

}