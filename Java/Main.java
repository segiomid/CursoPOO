class Main{
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account(1,"Andres Herrera", "AND123","se@gmama.com","123suif"));
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account(2,"Andrea Herrera", "ANDA876","ddd@ffff.com","sadad23"));
        car2.passegenger = 3;
        car2.printDataCar();
    }
}