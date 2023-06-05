//PhonebookManager class handles operations on the phonebook node
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
   
      while (currNode != null && !currNode.phoneNumber.equals(phoneNumber)) { //Checks to see if phone number of the current node doesn't equal the correct phone number, and makes sure there is a current node.
         prevNode = currNode; 
         currNode = currNode.next;
      }
      if (currNode != null) { 
         prevNode.next = currNode.next;
         System.out.println("Entry deleted successfully.");
         } else {
            System.out.println("Entry not found.");
      }
   }

   // Modify an existing entry in the phonebook
   public void modifyEntry(String phoneNumber, String newFirstName, String newLastName, String newAddress, String newCity) {
      PhonebookNode currNode = head;
   
      while (currNode != null) {
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
         if (currNode.firstName.equalsIgnoreCase(searchString) || //this is a logical OR operator and can be used to evaluate multiple conditions to see if ONE of them is true
            currNode.lastName.equalsIgnoreCase(searchString) || //Starts at the left and goes to the right (top to bottom). This checks to see if the information matches, basically.
            currNode.address.equalsIgnoreCase(searchString) || //If one of these are THE SAME, then the program will grab the data from the corresponding node, and then use it later by showing the info with println.
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
   
      if (!found) {
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
