package Day2;

public class swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b); 

        int temp;
        temp = a;
        a = b;    
        b = temp;   

        System.out.println("After swapping: a = " + a + ", b = " + b); 
    }
}

