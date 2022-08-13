public class Main {
    public static void main(String[] args) {
        Author antonChehov = new Author("Antom", "Chehov");
        Author levTolstoi = new Author("Lev", "Tolstoi");

        Book warAndPeace = new Book("warAndPeace", 1820, levTolstoi);
        Book chameleon = new Book("antonChehov", 1884, antonChehov);

        System.out.println("Имя автора: "+ antonChehov.getName()+",Фамилия автора: "+ antonChehov.getSurname());
        System.out.println("Имя автора: "+ levTolstoi.getName()+",Фамилия автора: "+ levTolstoi.getSurname());

        System.out.println("Название книги: "+ warAndPeace.getName()+",Год издания : "+ warAndPeace.getYeaOfPublication()+", Имя автора: "+ antonChehov.getName()+",Фамилия автора: "+ antonChehov.getSurname());
        System.out.println("Название книги: "+ chameleon.getName()+",Год издания : "+ chameleon.getYeaOfPublication()+", Имя автора: "+ levTolstoi.getName()+",Фамилия автора: "+ levTolstoi.getSurname());




    }
}