class Car {
    String brand;

    Car(String b) {
        brand = b;
    }

    void display() {
        System.out.println("Car brand: " + brand);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda");
        myCar.display();
    }
}