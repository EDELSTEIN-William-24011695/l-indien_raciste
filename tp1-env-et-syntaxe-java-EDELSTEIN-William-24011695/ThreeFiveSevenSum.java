public class OddEvenSum {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {

	final int LOWERBOUND = 1;
      	final int UPPERBOUND = 1000;
	int number = LOWERBOUND;
	int sum = 0;

	while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         if ((number % 3 == 0 || number % 5 == 0 || number % 7 == 0)&& (number % 15 != 0|| number % 21 != 0 || number % 35 != 0 || number % 105 != 0)) {  // Even
            sum += number;
	}
	++number;
	}
	System.out.println("La somme est : " + sum);

}
}
