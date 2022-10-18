import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Notes test = new Notes();

        int i;
        int opc;

        do{
            i = 0;
            test.clearScreen();
            System.out.println("1:Create a new note");
            System.out.println("2:Edit a note");
            System.out.println("3:Delete a note");
            System.out.println("4:Show all notes\n");
            System.out.println("5:Exit\n");

            System.out.print("Choose an option: ");
            opc = Integer.parseInt(input.nextLine());

            if(opc == 1){
                test.newNote();
            }
            else if(opc == 2){
                test.editNote();
            }
            else if(opc == 3){
                test.deleteNote();
            }
            else if(opc == 4){
                test.showNote();
            }
        }while(opc != 5);

        //test.insertData();
    }
}