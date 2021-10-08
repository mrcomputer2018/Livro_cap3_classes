package book;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        // cria um objeto GradeBook e o atribui a myGradeBook
        GradeBook myGradeBook = new GradeBook();
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor entre com o nome doo curso:");
        String nameOfCurse = input.nextLine();

        myGradeBook.displayMessage(nameOfCurse);

        input.close();
    }
}
