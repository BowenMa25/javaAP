# AP COMPUTER quiz3
Time&#x2501;1 hour and 30 minutes for total 40 questions.

Average: 2.25 for each question.

If you finish 5 questions within 11 minutes, that's good enough. 

---
1. Consider the following code segment: 
   
   ```java
    1   int a = 10;
    2   double b = 10.7; 
    3   int d = a + b;  
   ```
    Line 3 will not compile in the code segment above. With which of the following statements could we replace this line so that it compiles? 

    ```java
    I.      int d = (int) a + b
    II.     int d = (int) (a + b);
    III.    int d = a + (int)b; 
    ```
    ```
    (A) I 
    (B) II
    (C) III 
    (D) I and III
    (E) II and III   
    ```
2. Consider the following code segment. 

    ```java
    1    int a = 11; 
    2    int b = 4;
    3    double x = 11;
    4    double y = 4;
    5    System.out.print(a/b) ;   
    6    System.out.print(", ") ;   
    7    System.out.print(x/y) ;   
    8    System.out.print(", ") ;   
    9    System.out.print(a/y) ;   
    ```
    What is printed as a result of executing the code segment? 
    ```
    (A) 3, 2.75, 3 
    (B) 3,2.75,2.75 
    (C) 2,3.2 
    (D) 2, 2.75,2.75 
    (E) Nothing will be printed because of a compile-time error. 
    ```
3. Consider the following code segment. 

    ```java
    int val1 = 2, val2 = 22, val3 = 78; 
    while (val2 % val1 == 0 || val2 % 3 == 0 ){
        val3++; 
        val2--; 
    }
    ```
    What will val3 contain after the code segment is executed?
    ```
    (A) 77
    (B) 78 
    (C) 79 
    (D) 80
    (E) None of the above  
    ```
4. Assuming all other statements in the program are correct, each of the following statements will allow the program to compile **EXCEPT**

    ```java
    (A) System.out.print(1);
    (B) System.out.print("1");  
    (C) System.out.print(side1); 
    (D) System.out.print("side1");
    (E) All of the above statements will compile. 
    ```
5. Assuming all other statements in the program are correct, each of the following statements will allow the program to compile **EXCEPT**

    ```java
    (A) //This is a comment
    (B) /* This is a comment*/ 
    (C) // myName is a good identifier name 
    (D) // myname is a good identifier name 
    (E) All of the above statements will compile. 
    ```
