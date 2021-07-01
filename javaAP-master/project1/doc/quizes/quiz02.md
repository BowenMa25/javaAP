# AP COMPUTER quiz3
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---
1. A programmer has written two different methods for a client program to swap the elements of one array with those of another array.

	```java
		public static void swap1(int[] a1, int[] a2) {
			for (int i=0; i< a1.length; i++) {
				int arrhold = a1[i];
				a1[i] = a2[i];
				a2[i] = arrhold;
			}
		}
		
		public static void swap2(int[] a1, int[] a2) {
			int[] arrhold = a1;
			a1 = a2;
			a2 = arrhold;
		}
	```
	Which of the following statements best reflects the outcome of the two methods?

	(A) Both methods will swap the contents of the two arrays correctly in all cases.

	(B) swap1 will swap the contens of the two arrays correctly only if both arrays have the same munber of elements whereas swap2 will work correctly for all cases.

	(C) swap1 will only swap the contents of the two arrays correctly if both arrays have the same number of elements, whereas swap2 will never work correctly.

	(D) swap1 will only swap the contents of the two arrays correctly if both arrays have the same number of elements or a2 has more elements, whereas swap2 will work correctly for all cases.
	
	(E) Neither method will swap the contents of the two arrays correctly under any condition.

2. Determine output of the following code.

	```java
		public static void swap(String s1, String s2) {
			String hold = s1;
			s1 = s2;
			s2 = hold;
		}
		
		public static void main(String[] args) {
			String animal1 = "elephant";
			String animal2 = "lion";
			swap(animal1, animal2);
			animal1.toUpperCase();
			animal2.toUpperCase();
			System.out.println(animal1 + " " + animal2);
		}
	```

	```
	(A) elephant lion
	(B) ELEPHANT LION
	(C) lion elephant
	(D) LION elephant
	(E) LION ELEPHANT
	```
3. The following pow method was written to return b raised to the xth power where x > 0, but it does not work properly. Choose the changes to the method below to work properly.

	```java
	1	public double pow (double b, int x) 
	2	{
	3		if (x==0) 
	4			return 0; 
	5		else
	6			return b * pow (b, x-1); 
	7	}
	```
	``` No answer is correct
	(A) Change lines 3 and 4 to: 
	3 	if (x==l) 
	4		return 1; 
	(B) Change lines 3 and 4 to: 
	3 	if (x==0) 
	4		return 1; 
	(C) Change line 6 to: 
	6 		return b + pow(b, x-1);
	(D) Both (A) and (C) 
	(E) Both (B) and (C) 
	```
4. What is output given the following code excerpt? 

	```java
		public static int f (int n) {
			if (n==0)
				return 0;
			else 
				return f(n/10) + n % 10; 
				
		}
		System.out.println(f(8765));
	```
	```
	(A) 5678 
	(B) 8765 
	(C) 58 
	(D) 26 
	(E) A run-time error 
	```
5. Which of the following class declarations would cause a compile-time error? Assume the rest of the code compiles as intended. 

	```java
	(A) public class Calculus
	(B) public class apCalculus  
	(C) public class APCalculus 
	(D) public class 4Apcalculus 
	(E) public class APCalculus extends Calculus 
	```
