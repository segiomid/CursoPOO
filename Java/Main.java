class Main{
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        UberX uberx = new UberX("AMQ123", new Account(1,"Andres Herrera", "AND123","se@gmama.com","123suif"), "Mazda", "2");
        uberx.setPasseger(4);
        uberx.printDataCar();

    /*     UberVan ubervan = new  UberVan("AMQ123", new Account(1,"Andres Herrera", "AND123","se@gmama.com","123suif"));
        ubervan.setPasseger(6);
        ubervan.printDataCar(); */

/*         Car car2 = new Car("QWE567", new Account(2,"Andrea Herrera", "ANDA876","ddd@ffff.com","sadad23"));
        car2.passegenger = 3;
        car2.printDataCar();  */
    }
}