class TASKSHEET3 {
    public static void main(String[] args) {
        // Change the variables in the first section
        String a = "Wow!";
        String b = a;
        String c = "Different";
        String d = "Wow!!";

        // Logic check conditions
        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        // Conditional block
        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    
}

}