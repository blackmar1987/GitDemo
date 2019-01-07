package MyFirstProject;

public class MyFirstProject {
    public static void main (String []args) {
        String word = "бутылок";
        int Beernum = 99;
        while (Beernum > 0) {

            System.out.println(Beernum + " " + word + " пива на стене");
            System.out.println(Beernum + " " + word + " пива");
            System.out.println("Возьми одну, передай мне");
            Beernum = Beernum - 1;
            if (Beernum > 0) {
                if (Beernum == 1) {
                    word = "бутылка";
                }
                else
                System.out.println(Beernum + " " + word + " пива на стене");
            } else {
                System.out.println("И вот уже нету бутылок");

            }
        }
    }

}