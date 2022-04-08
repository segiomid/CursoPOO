import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
        
    public UberVan(String license, Account driver) {
        super(license, driver);         
    }

    @Override
    public void setPasseger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        }
        else{
            System.out.println("Necesita asignar 6 pasajeros");
        }
    }
}
