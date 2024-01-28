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

    private static void printPhB(HashMap<String, ArrayList<String>> phonebook) {
        System.out.print("PhoneBook");
        System.out.println("-=Show all contacts=-");
        String[][] numbersCounter = new String[2][phonebook.size()];
        int curContact = 0;
        for (var item: phonebook.entrySet()) {
            numbersCounter[0][curContact] = item.getKey();
            numbersCounter[1][curContact] = ""  + item.getValue().size();
            for (int i  =  curContact; i > 0; i--) {
                if (Integer.parseInt(numbersCounter[1][i]) > Integer.parseInt(numbersCounter[1][i - 1])) {
                    String temp = numbersCounter[0][i];
                    numbersCounter[0][i] = numbersCounter[0][i - 1];
                    numbersCounter[0][i - 1] = temp;
                    temp = numbersCounter[1][i];
                    numbersCounter[1][i] = numbersCounter[1][i - 1];
                    numbersCounter[1][i - 1] = temp;
                } else {
                    i = 0;
                }
            }
            curContact++;
        }
        for (int i = 0; i < numbersCounter[0].length; i++) {
            System.out.println(numbersCounter[0][i] + ":");
            for (int j = 0; j < phonebook.get(numbersCounter[0][i].size; j++) {
                System.out.println("\t" + phonebook.get(numbersCounter[0][i]).get(j));
            }
        }
    }

    private static void addPhoneNumber (HashMap<String, ArrayList<String>> phonebook) {
        System.out.print("PhoneBook");
        System.out.println("-=Add a number to a contact=-");
        System.out.print("Enter the name of the contact you want to add a number to: ");
        Scanner scn = new Scanner(System.in);
        String contact = scn.nextLine();
        contact = findContact(phonebook, contact);
        if (contact!= null) {
            System.out.printf("-= Adding a number to an existing contact =- ");
            System.out.print("Enter the number you want to add: ");
            String number = scn.nextLine();
            ArrayList<String> numbers = new ArrayList<>(phonebook.get(contact));
            numbers.add(number);
            phonebook.replace(contact, numbers);
        } else {
            System.out.println("!!!ERROR: %s - CONTACT NOT FOUND!!!\n", contact);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static String findContact(HashMap<String, ArrayList<String>> phonebook, String contact);
    }
}

