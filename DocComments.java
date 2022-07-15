public class DocComments {
    public static void main(String[] args) {
        printText("Robin", "25");
        double calculatedArea = calculateArea(2, 5);
        System.out.println(calculatedArea);
    }

    

    /**
     * Function name: greet
     * 
     * Inside the function:
     *  1. prints: 'Hi'
     * 
     * 
     */
    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function name: printText
     * 
     * @param name
     * @param age
     * 
     * Inside function:
     *  1. prints: 'the name and age as part of a text'
     * 
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I'am " + name + " and I am " + age + " years old.");
    }

    /**
     * Function name: calculateArea
     * 
     * @param width     (double)
     * @param height    (double)
     * @return          (double)
     * 
     * Inside function:
     *  1. calculated the are and returns it.
     */
    public static double calculateArea(double width, double height){
        double area = width * height;
        return area;
    }
}
