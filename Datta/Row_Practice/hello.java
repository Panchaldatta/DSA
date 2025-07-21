public class hello {
    int a = 10;
    int b = 20;
    int c = a + b;
 
    public static void main(String[] args) {
        hello obj = new hello();
        System.out.println("--------This is Basics of java------");
        System.out.println("The sum of a and b is: " + obj.c);  
        System.out.println("The value of a is: " + obj.a);
        System.out.println("The value of b is: " + obj.b);
        System.out.println("The value of c is: " + obj.c);

    }
}