import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        final List<String> menu = new ArrayList<>(List.of(
            "-=PhoneBook=-\n",
            "-=MENU=-",
            "1. Show all contacts",
            "2. Create a new contact",
            "3. Add a number to an existing contact",
            "4. Delete contact",
            "5. Delete number from an existing contact",
            "6. Rename contact",
            "7. Change the number of an existing contact",
            "-------------------------------------------",
            "0. Exit"));

        HashMap<String, ArrayList<String>> = phonebook = new HashMap<>();
        
        int userChoice = -1;
        while (userChoice!= 0) {
            userChoice = showMainMenu(menu);
            switch (userChoice) {
                case 1:
                    printPhB(phonebook);
                    timeOut();
                    break;
                case 2:
                    addNewContact(phonebook);
                    break;
                case 3:
                    addPhoneNumber(phonebook);
                    break;
                case 4:
                    deleteContact(phonebook);
                    break;
                case 5:
                    removeNumber(phonebook);       ;
                    break;
                case 6:
                    renameContact(phonebook);
                    break;
                case 7:
                    changeNumber(phonebook);
                    break;
                case 0:
                    System.out.println("-=The application is finished=-");
                    break;
                default:
                    System.out.println("!!!ERROR: %s - UNSUPPORTED OPERATION!!!\n", userChoice);
                    timeOut();
                    break;
            }
        }    
    }
    
}

