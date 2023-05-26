// PhonebookNode class represents a single node in the phonebook linked list and stores the data for the provided Strings.------------------------------------------------------------------------------------
class PhonebookNode {
   String firstName;
   String lastName;
   String address;
   String city;
   String phoneNumber;
   PhonebookNode next;

   // Constructor to initialize the node
   public PhonebookNode(String firstName, String lastName, String address, String city, String phoneNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
      this.city = city;
      this.phoneNumber = phoneNumber;
      this.next = null;
   }
}

// PhonebookManager class handles operations on the phonebook linked list------------------------------------------------------------------------------------
class PhonebookManager {
   private PhonebookNode head;

   // Constructor to initialize the manager
   public PhonebookManager() {
      this.head = null;
   }

   // Add a new entry at the beginning of the phonebook
   public void addEntry(String firstName, String lastName, String address, String city, String phoneNumber) {
      PhonebookNode newNode = new PhonebookNode(firstName, lastName, address, city, phoneNumber);
      if (head == null) {
         head = newNode;
      } else {
         newNode.next = head;
         head = newNode;
      }
      System.out.println("Entry added successfully.");
   }

   // Delete an entry from the phonebook
   public void deleteEntry(String phoneNumber) {
      if (head == null) {
         System.out.println("Phonebook is empty.");
         return;
      }
   
      if (head.phoneNumber.equals(phoneNumber)) {
         head = head.next;
         System.out.println("Entry deleted successfully.");
         return;
      }
   
      PhonebookNode prevNode = head;
      PhonebookNode currNode = head.next;
   
      while (currNode != null && !currNode.phoneNumber.equals(phoneNumber)) { //Checks to see if phone number of the current node doesnt equal the correct phone number, and ends makes sure there is a current node. EXTRA CREDIT //continued use of != which means is not equal to EXTRA CREDIT
         prevNode = currNode; // && means if both items are true then continue. EXTRA CREDIT
         currNode = currNode.next;
      }
   
      if (currNode != null) { //continued use of != which means is not equal to EXTRA CREDIT
         prevNode.next = currNode.next;
         System.out.println("Entry deleted successfully.");
      } else {
         System.out.println("Entry not found.");
      }
   }

   // Modify an existing entry in the phonebook
   public void modifyEntry(String phoneNumber, String newFirstName, String newLastName, String newAddress, String newCity) {
      PhonebookNode currNode = head;
   
      while (currNode != null) {//continued use of != which means is not equal to EXTRA CREDIT
         if (currNode.phoneNumber.equals(phoneNumber)) {
            currNode.firstName = newFirstName;
            currNode.lastName = newLastName;
            currNode.address = newAddress;
            currNode.city = newCity;
            System.out.println("Entry modified successfully.");
            return;
         }
         currNode = currNode.next;
      }
   
      System.out.println("Entry not found.");
   }

   // Search for an entry in the phonebook
   public void searchEntry(String searchString) {
      PhonebookNode currNode = head;
      boolean found = false;
   
      while (currNode != null) {
         if (currNode.firstName.equalsIgnoreCase(searchString) || // this is a logical OR operator and can be used to evaluate multiple conditions to see if ONE of them is true EXTRA CREDIT
            currNode.lastName.equalsIgnoreCase(searchString) || // Starts at the left and goes to the right (top to bottom). This checks to see if the information matches basically. EXTRA CREDIT
            currNode.address.equalsIgnoreCase(searchString) ||
            currNode.city.equalsIgnoreCase(searchString) ||
            currNode.phoneNumber.equals(searchString)) {
            System.out.println("Entry found:");
            System.out.println("First Name: " + currNode.firstName);
            System.out.println("Last Name: " + currNode.lastName);
            System.out.println("Address: " + currNode.address);
            System.out.println("City: " + currNode.city);
            System.out.println("Phone Number: " + currNode.phoneNumber);
            System.out.println("-------------------------");
            found = true;
         }
         currNode = currNode.next;
      }
   
      if (!found) { // ! Is if not found compared to normally is found EXTRA CREDIT
         System.out.println("Entry not found.");
      }
   }

   // Print the entire phonebook
   public void printPhonebook() {
      if (head == null) {
         System.out.println("Phonebook is empty.");
         return;
      }
   
      PhonebookNode currNode = head;
   
      while (currNode != null) {
         System.out.println("First Name: " + currNode.firstName);
         System.out.println("Last Name: " + currNode.lastName);
         System.out.println("Address: " + currNode.address);
         System.out.println("City: " + currNode.city);
         System.out.println("Phone Number: " + currNode.phoneNumber);
         System.out.println("-------------------------");
         currNode = currNode.next;
      }
   }
}

// Test class to demonstrate the usage of PhonebookManager------------------------------------------------------------------------------------
class PhonebookTest {
   public static void main(String[] args) {
      PhonebookManager manager = new PhonebookManager();
      //EXTRA CREDIT ASCII!! + ALL USES SHOWN IN THE TEST! EXTRA CREDIT
      System.out.println("   J    A   V     V   A  ");//EXTRA CREDIT ASCII!!
      System.out.println("   J   A A   V   V   A A ");//EXTRA CREDIT ASCII!!
      System.out.println("J  J  AAAAA   V V   AAAAA");//EXTRA CREDIT ASCII!!
      System.out.println(" JJ  A     A   V   A     A");//EXTRA CREDIT ASCII!!
      System.out.println("---------------------------");//EXTRA CREDIT ASCII!!
      // Adding entries
      manager.addEntry("Jack", "Albrecht", "3741 Aldergrove rd", "Ferndale, WA", "3605276237");
      manager.addEntry("Jordan", "Albrecht", "3741 Aldergrove rd", "Ferndale, WA", "3605276238");
   
      // Printing the phonebook
      manager.printPhonebook();
   
      // Modifying an entry
      manager.modifyEntry("3605276237", "Jack", "Nathan", "123 Main St", "New York");
   
      // Searching for an entry
      manager.searchEntry("3605276237");
   
      // Deleting an entry
      manager.deleteEntry("3605276238");
   
      // Printing the phonebook after modifications
      manager.printPhonebook();//EXTRA CREDIT ASCII!!
      System.out.println("   \\O/");//EXTRA CREDIT ASCII!!
      System.out.println("    |");//EXTRA CREDIT ASCII!!
      System.out.println("   / \\");//EXTRA CREDIT ASCII!!
   }
}
