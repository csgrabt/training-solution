package recursion;

public class FactorialCalculator {

public long getFactorial(long number){
    long a = 1;
    for (int i =1; i<number+1; i++){
         a = a* i;
    }

    return a;
}
}
