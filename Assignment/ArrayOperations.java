public class ArrayOperations {
    // The array to perform operations on
    private int[] array;

    // Constructor to initialize the array
    public ArrayOperations(int size) {
        // Your code here
    }

    // Function to insert an element at the end of the array
    public void insertAtEnd(int element) {
        // Your code here
    }

    // Function to display all elements in the array
    public void display() {
        // Your code here
    }

    // Function to insert an element at a specified position in the array
    public void insertAtMiddle(int element, int position) {
        // Your code here
    }

    // Function to delete an element from a specified position in the array
    public void deleteFromMiddle(int position) {
        // Your code here
    }

    // Function to rotate the array to the left by a given number of positions
    public void rotateLeft(int positions) {
        // Your code here
    }

    // Function to rotate the array to the right by a given number of positions
    public void rotateRight(int positions) {
        // Your code here
    }

    // Additional functions can be added based on the learning objectives

    // Explaination for insertAtEnd method
    // This method adds an element to the end of the array, increasing its size by 1.

    // Explanation for display method
    // This method prints all the elements present in the array.

    // Explanation for insertAtMiddle method
    // This method inserts a new element at a specified position in the array, shifting other elements
    // accordingly.

    // Explanation for deleteFromMiddle method
    // This method removes an element from a specified position in the array, shifting other elements
    // accordingly.

    // Explanation for rotateLeft method
    // This method rotates the elements of the array to the left by a given number of positions.

    // Explanation for rotateRight method
    // This method rotates the elements of the array to the right by a given number of positions.

    // main method, this method will create a object of ArrayOperations class and pass the
    // size of the array as an argument to it on which all the operations will be performed.
    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations(5);

        arrayOps.insertAtEnd(1);
        arrayOps.insertAtEnd(2);
        arrayOps.insertAtEnd(3);
        arrayOps.display();  // Output: Array elements: 1 2 3

        arrayOps.insertAtMiddle(5, 1);
        arrayOps.display();  // Output: Array elements: 1 5 2 3

        arrayOps.deleteFromMiddle(2);
        arrayOps.display();  // Output: Array elements: 1 5 3

        arrayOps.rotateLeft(1);
        arrayOps.display();  // Output: Array elements: 5 3 1

        arrayOps.rotateRight(2);
        arrayOps.display();  // Output: Array elements: 3 1 5
    }
}
