package org.github;

public class PrimeNumber {
	
    public static void main(String[] args) {

        int num = 3;
        boolean prime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        
        if (prime) {
            System.out.println("Given Number is Prime:"+num);
            
        } else {
            System.out.println("Given Number is Not Prime:"+num);
        }
    }
}