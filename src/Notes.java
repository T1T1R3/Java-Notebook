import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Notes{
    Scanner input = new Scanner(System.in);

    List <String> note = new ArrayList <String> ();
    List <Integer> noteEnum = new ArrayList <Integer> ();

    String noteInsert;

    int opcNote = 0;
    int opc = 0;
    int i;
    int noteCount = 0;
    String day = "__";
    String mth = "__";
    String yr = "__";

  /*void insertData(){
    System.out.println(day + "/" + mth + "/" + yr);
    System.out.print("\nInsert the day: ");
    day = input.nextLine();

    this.clearScreen();

    System.out.println(day + "/" + mth + "/" + yr);
    System.out.print("\nInsert the month: ");

    mth = input.nextLine();
    this.clearScreen();

    System.out.println(day + "/" + mth + "/" + yr);
    System.out.print("\nInsert the year: ");

    yr = input.nextLine();
    this.clearScreen();

    System.out.println(day + "/" + mth + "/" + yr);
  }*/

    //Adiciona uma string a list "note";
    void newNote(){
        do{
            this.clearScreen();
            System.out.println("Insert the new note:");
            noteInsert = input.nextLine();
            note.add(noteInsert);
            noteCount++;
            noteEnum.add(noteCount);

            System.out.print("\n0 to go back to main menu, 1 to new note: ");
            opcNote = Integer.parseInt(input.nextLine());
        }while(opcNote != 0);
    }

    //Edite uma string existente da list "note";
    void editSpecific(int num){
        do{
            this.clearScreen();
            System.out.println(note.get(num - 1));
            System.out.println("\nInsert the edit");
            note.set(num-1, input.nextLine());

            this.clearScreen();
            System.out.println("Edited");
            System.out.println(note.get(num-1));

            System.out.print("\nInsert the num that you want to edit, or 0 to get back: ");
            opcNote = Integer.parseInt(input.nextLine());
        }while(opcNote != 0);
    }

    //Organiza qual string será editada;
    void editNote(){
        do{
            this.clearScreen();
            int i = 0;
            for(String notes:note){
                System.out.print(noteEnum.get(i) + ". ");
                System.out.println(notes);
                i++;
            }

            System.out.print("\nInsert the num that you want to edit, or 0 to get back: ");
            opcNote = Integer.parseInt(input.nextLine());

            editSpecific(opcNote);
        }while(opcNote != 0);

    }

    //Deleta uma string existente;
    void deleteNote(){
        this.clearScreen();
        int i = 0;
        for(String notes:note){
            System.out.print(noteEnum.get(i) + ". ");
            System.out.println(notes);
            i++;
        }

        System.out.print("\nInsert the num that you want to delete, or 0 to get back: ");

        opcNote = Integer.parseInt(input.nextLine());
        if(opcNote != 0){
            note.remove(opcNote-1);
        }
    }

    //Mostra todas as notas criadas;
    void showNote(){
        this.clearScreen();
        int i = 0;
        for(String notes:note){
            System.out.print(noteEnum.get(i) + ". ");
            System.out.println(notes);
            i++;
        }

        System.out.print("\n0 to go back to main menu: ");
        opcNote = Integer.parseInt(input.nextLine());
    }

    void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}