package lambdas;

import java.util.function.Predicate;

public class AppPredicate {

	public static void main(String[] args) {
		//comparar un valor T y devuelve true o false
		Predicate<Integer> p1= x -> x > 7;
		if (p1.test(9))
			System.out.println("predicaste x >7 is true");
			else 
				System.out.println("predicate x >7 is true and x ==9");
		

	}

}
