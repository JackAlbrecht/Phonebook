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
