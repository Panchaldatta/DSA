package Data_structures;

public class Arrays {
    
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements in the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);

        // Modify an element in the array
        numbers[2] = 100;
        System.out.println("Modified third element: " + numbers[2]);

        // Loop through the array
        System.out.print("All elements in the array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
