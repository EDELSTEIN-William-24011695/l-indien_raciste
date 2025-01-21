public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = Integer.parseInt(args[0]);  // Set the value of "number" here!

      // Using nested-if
      if (number == 1) {
         System.out.println("Lundi");
      } else if (number == 2) {
         System.out.println("Mardi");
      } else if (number == 3) {
         System.out.println("Mercredi");
      } else if (number == 4) {
         System.out.println("Jeudi");
      } else if (number == 5) {
         System.out.println("Vendredi");
      } else if (number == 6) {
         System.out.println("Samedi");
      } else if (number == 7) {
         System.out.println("Dimanche");
      } else {
         System.out.println("Invalid number");
      }

      // Using switch-case-default
      switch(number) {
         case 1:
            System.out.println("Lundi"); break;
         case 2:
            System.out.println("Mardi"); break;
         case 3:
            System.out.println("Mercredi"); break;
         case 4:
            System.out.println("Jeudi"); break;
         case 5:
            System.out.println("Vendredi"); break;
         case 6:
            System.out.println("Samedi"); break;
         case 7:
            System.out.println("Dimanche"); break;
         default:
            System.out.println("Invalid number");
      }
   }
}

