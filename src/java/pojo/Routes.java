package pojo;
// Generated Oct 10, 2022 3:35:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Routes generated by hbm2java
 */
public class Routes  implements java.io.Serializable {


     private Integer id;
     private Airports airportsByDestinationId;
     private Airports airportsByDepartureId;
     private int timeOfFlight;
     private Set flightses = new HashSet(0);

    public Routes() {
    }

	
    public Routes(Airports airportsByDestinationId, Airports airportsByDepartureId, int timeOfFlight) {
        this.airportsByDestinationId = airportsByDestinationId;
        this.airportsByDepartureId = airportsByDepartureId;
        this.timeOfFlight = timeOfFlight;
    }
    public Routes(Airports airportsByDestinationId, Airports airportsByDepartureId, int timeOfFlight, Set flightses) {
       this.airportsByDestinationId = airportsByDestinationId;
       this.airportsByDepartureId = airportsByDepartureId;
       this.timeOfFlight = timeOfFlight;
       this.flightses = flightses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Airports getAirportsByDestinationId() {
        return this.airportsByDestinationId;
    }
    
    public void setAirportsByDestinationId(Airports airportsByDestinationId) {
        this.airportsByDestinationId = airportsByDestinationId;
    }
    public Airports getAirportsByDepartureId() {
        return this.airportsByDepartureId;
    }
    
    public void setAirportsByDepartureId(Airports airportsByDepartureId) {
        this.airportsByDepartureId = airportsByDepartureId;
    }
    public int getTimeOfFlight() {
        return this.timeOfFlight;
    }
    
    public void setTimeOfFlight(int timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }
    public Set getFlightses() {
        return this.flightses;
    }
    
    public void setFlightses(Set flightses) {
        this.flightses = flightses;
    }




}

