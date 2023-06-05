class PhonebookTest {
   public static void main(String[] args) {
      PhonebookManager manager = new PhonebookManager();
      //ASCII!!
      System.out.println("   J    A   V     V   A  ");
      System.out.println("   J   A A   V   V   A A ");
      System.out.println("J  J  AAAAA   V V   AAAAA");
      System.out.println(" JJ  A     A   V   A     A");
      System.out.println("---------------------------");
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
      manager.printPhonebook();
      System.out.println("   \\O/");//ASCII!!
      System.out.println("    |");
      System.out.println("   / \\");
   }
}
