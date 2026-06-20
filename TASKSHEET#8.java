class TASKSHEET8 {

    public static void main(String[] args) {
        // Test the method with the example parameters: 4, 5, 10
        int grandTotal = computeCumulativeSums(4, 5, 10);
        
        System.out.println("\nGrand Total of all cumulative sums: " + grandTotal);
    }

    /**
     * Method that takes a variable number of integer arguments.
     * Computes 1 + 2 + ... + n for each argument and returns the grand total.
     */
    public static int computeCumulativeSums(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int cumulativeSum = 0;
            
            // Compute the sum from 1 up to the parameter value
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }
            
            System.out.println("Parameter: " + num + " -> Cumulative Sum (1 to " + num + "): " + cumulativeSum);
            
            // Add to the grand total
            totalSum += cumulativeSum;
        }

        return totalSum;
    }
}

