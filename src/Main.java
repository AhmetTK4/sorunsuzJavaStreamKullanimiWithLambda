import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> mylist = Arrays.asList("jose pablo","don ahmed corleone","josef de temel","selami abi","delle ali");
        System.out.println("Dizimiz Burda :"+mylist);
        System.out.println("Baş Harfini Tercih Ettiğinin Elemanları Verin Büyüteyim");
        Scanner input = new Scanner(System.in);
        String abba = input.nextLine();
        String finalAbba = abba;
        mylist.stream().filter(s -> s.startsWith(finalAbba)).map(String::toUpperCase).forEach(System.out::println);

    }
}