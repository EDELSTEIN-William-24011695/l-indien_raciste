public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 9;  // Set the value of "number" here!

      // Using nested-if
      if (number == 1) {
         System.out.println("Un");
      } else if (number == 2) {
         System.out.println("Deux");
      } else if (number == 3) {
         System.out.println("Trois");
      } else if (number == 4) {
         System.out.println("Quatre");
      } else if (number == 5) {
         System.out.println("Cinq");
      } else if (number == 6) {
         System.out.println("Six");
      } else if (number == 7) {
         System.out.println("Sept");
      } else if (number == 8) {
         System.out.println("Huit");
      } else if (number == 9) {
         System.out.println("Neuf");
      }

      // Using switch-case-default
      switch(number) {
         case 1:
            System.out.println("Un"); break;
         case 2:
            System.out.println("Deux"); break;
         case 3:
            System.out.println("Trois"); break;
         case 4:
            System.out.println("Quatre"); break;
         case 5:
            System.out.println("Cinq"); break;
         case 6:
            System.out.println("Six"); break;
         case 7:
            System.out.println("Sept"); break;
         case 8:
            System.out.println("Huit"); break;
         case 9:
            System.out.println("Neuf"); break;
	}
   }
}
