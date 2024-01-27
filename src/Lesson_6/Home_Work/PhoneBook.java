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

    private static void renameContact (HashMap<String, ArrayList<String>> phonebook) {
        System.out.print("PhoneBook");
        System.out.println("-=Rename contat=-");
        System.out.println("Enter the name of the contact you want to rename: ");
        Scanner scn = new Scanner(System.in);
        String contact = scn.nextLine();
        contact = findContact(phonebook, contact);
        if (contact!= null) {
            ArrayList<String> numbers = new ArrayList<>(phonebook.get(contact));
            phonebook.remove(contact);
            System.out.println("Change the name of a contact %s \n ", contact);
            System.out.print("Enter the new name of the contact: ");
            phonebook.put(scn.nextLine(), numbers);
        } else {
            System.out.println("!!!ERROR: %s - CONTACT NOT FOUND!!!\n", contact);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void changeNumber(HashMap<String, ArrayList<String>> phonebook) {
        System.out.print("PhoneBook");
        System.out.println("-=Change the number of a contact=-");
        System.out.print("Enter the name of the contact you want to change the number of: ");
        Scanner scn = new Scanner(System.in);
        String contact = scn.nextLine();
        contact = findContact(phonebook, contact);
        if (contact!= null) {
            ArrayList<String> numbers = new ArrayList<>(phonebook.get(contact));
            System.out.println("Change the number of a contact %s \n ", contact);
            System.out.print("Enter the new number of the contact: ");
            for (int i = 0, i < number.size(); i++) {
                System.out.println("%d. %s\n", i + 1, numbers.get(i));
            }
            System.out.print("Enter the number change code (0 - if the number you a looking for is not found): ");
            int changingNumber = Integer.parseInt(scn.nextLine());
            if (changingNumber != 0) {
                System.out.print("Enter new number: ");
                String newNumber = scn.nextLine();
                numbers.set(changingNumber - 1, newNumber);
                phonebook.replace(contact, numbers);
            }
        } else {
            System.out.println("!!!ERROR: %s - CONTACT NOT FOUND!!!\n", contact);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static void removeNumber(HashMap<String, ArrayList<String>> phonebook) {
        System.out.print("PhoneBook");
        System.out.println("-=Remove a number from a contact=-");
        System.out.print("Enter the name of the contact you want to remove a number from: ");
        Scanner scn = new Scanner(System.in);
        String contact = scn.nextLine();
        contact = findContact(phonebook, contact);
        if (contact != null) {
            ArrayList<String> numbers = new ArrayList<>(phonebook.get(contact));
            System.out.printf("-=Deleting a contact number %s=-\n", contact);
            for (int i = 0; i < mumbers.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, numbers.get(i));
            }
            System.out.print("Enter the number change code (0 - if the number you a looking for is not found): ");
            int deletingNumber = Integer.parseInt(scn.nextLine());
            if (deletingNumber != 0) {
                numbers.remove(deletingNumber - 1);
                phonebook.replace(contact, numbers);
            }
        } else {
            System.out.println(" No contacts were found for the specified request");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void deleteContact(HashMap<String, ArrayList<String>> phonebook) {
        System.out.print("PhoneBook");
        System.out.println("-=Delete a contact=-");
        System.out.print("Enter the name of the contact you want to delete: ");
        Scanner scn = new Scanner(System.in);
        String contact = scn.nextLine();
        contact = findContact(phonebook, contact);
        if (contact!= null) {
            System.out.printf("-=Deleting a contact %s=-\n", contact);
            phonebook.remove(contact);
        } else {
            System.out.println("!!!ERROR: %s - CONTACT NOT FOUND!!!\n", contact);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
}

