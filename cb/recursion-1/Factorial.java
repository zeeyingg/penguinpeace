public class Factorial {


public static int factorial (int n){
  if (n==0){
    return 1;
  } else {
    return (n * factorial(n-1));
  }
}


public static int bunnyEars(int bunnies){
  if (bunnies==0){
    return 0;
  } else {
    return (2 + bunnyEars(bunnies-1));
  }
}


public static int fibonacci(int n){
  if (n == 0){
    return 0;
  } else if (n == 1){
    return 1;
  } else {
    return fibonacci(n-1) + fibonacci(n-2);
  }
}


public static int bunnyEars2(int bunnies){
  if (bunnies == 0){
    return 0;
  } else if (bunnies % 2 == 0){
    return 3 + bunnyEars2(bunnies-1);
  } else {
    return 2 + bunnyEars2(bunnies-1);
  }
}

public static int triangle(int rows){
  if (rows == 0){
    return 0;
  } else {
    return rows + triangle(rows-1);
  }
}


public static void main(String[] args) {

  System.out.println(factorial(1) + "...should be 1");
  System.out.println(factorial(2) + "...should be 2");
  System.out.println(factorial(3) + "...should be 6");

  System.out.println(bunnyEars(0) + "...should be 0");
  System.out.println(bunnyEars(2) + "...should be 2");
  System.out.println(bunnyEars(4) + "...should be 4");

  System.out.println(fibonacci(0) + "...should be 0");
  System.out.println(fibonacci(1) + "...should be 1");
  System.out.println(fibonacci(2) + "...should be 1");

  System.out.println(bunnyEars2(0) + "...should be 0");
  System.out.println(bunnyEars2(1) + "...should be 2");
  System.out.println(bunnyEars2(2) + "...should be 5");

  System.out.println(triangle(0) + "...should be 0");
  System.out.println(triangle(1) + "...should be 1");
  System.out.println(triangle(3) + "...should be 3");
}

}
