public class OddEvenSum {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      final int LOWERBOUND = 999;
      final int UPPERBOUND = 2010;
	int cpt = 0;
	int number = LOWERBOUND;
	System.out.println("Voici la liste des années bissextilles : ");
	while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         if (number % 100 == 0) {
		 if (number % 400 == 0){
			System.out.print(number + " // ");
			++cpt;
		 }
         }else if (number % 4 == 0){
		System.out.print(number + " // ");
		++cpt;
	 }


	 ++number;
   }
   System.out.print("\n Il y a donc " + cpt + " années bissextiles");
}
}
