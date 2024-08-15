class Para_constructor {
    String color;
    String model;
    int year;    
    public Para_constructor(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }
    
    public void displayDetails() {
        System.out.println("Showing from method of same class >>>>>");
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main() {
        System.out.println('\f');
        System.out.println("Passing parameter values to constructor while object creation : Red, Toyota Corolla, 2020");
        Para_constructor ob = new Para_constructor("Red", "Toyota Corolla", 2020);
        ob.displayDetails();
    }
}
