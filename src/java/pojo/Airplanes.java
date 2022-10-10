package pojo;
// Generated Oct 10, 2022 3:35:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Airplanes generated by hbm2java
 */
public class Airplanes  implements java.io.Serializable {


     private Integer id;
     private Airlines airlines;
     private String type;
     private Integer totalSeats;
     private int economySeats;
     private int premiumEconomySeats;
     private int businessSeats;
     private int firstClassSeats;
     private Set businessSeatses = new HashSet(0);
     private Set firstClassSeatses = new HashSet(0);
     private Set flightses = new HashSet(0);
     private Set economySeatses = new HashSet(0);
     private Set premiumEconomySeatses = new HashSet(0);

    public Airplanes() {
    }

	
    public Airplanes(Airlines airlines, String type, int economySeats, int premiumEconomySeats, int businessSeats, int firstClassSeats) {
        this.airlines = airlines;
        this.type = type;
        this.economySeats = economySeats;
        this.premiumEconomySeats = premiumEconomySeats;
        this.businessSeats = businessSeats;
        this.firstClassSeats = firstClassSeats;
    }
    public Airplanes(Airlines airlines, String type, Integer totalSeats, int economySeats, int premiumEconomySeats, int businessSeats, int firstClassSeats, Set businessSeatses, Set firstClassSeatses, Set flightses, Set economySeatses, Set premiumEconomySeatses) {
       this.airlines = airlines;
       this.type = type;
       this.totalSeats = totalSeats;
       this.economySeats = economySeats;
       this.premiumEconomySeats = premiumEconomySeats;
       this.businessSeats = businessSeats;
       this.firstClassSeats = firstClassSeats;
       this.businessSeatses = businessSeatses;
       this.firstClassSeatses = firstClassSeatses;
       this.flightses = flightses;
       this.economySeatses = economySeatses;
       this.premiumEconomySeatses = premiumEconomySeatses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Airlines getAirlines() {
        return this.airlines;
    }
    
    public void setAirlines(Airlines airlines) {
        this.airlines = airlines;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Integer getTotalSeats() {
        return this.totalSeats;
    }
    
    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }
    public int getEconomySeats() {
        return this.economySeats;
    }
    
    public void setEconomySeats(int economySeats) {
        this.economySeats = economySeats;
    }
    public int getPremiumEconomySeats() {
        return this.premiumEconomySeats;
    }
    
    public void setPremiumEconomySeats(int premiumEconomySeats) {
        this.premiumEconomySeats = premiumEconomySeats;
    }
    public int getBusinessSeats() {
        return this.businessSeats;
    }
    
    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }
    public int getFirstClassSeats() {
        return this.firstClassSeats;
    }
    
    public void setFirstClassSeats(int firstClassSeats) {
        this.firstClassSeats = firstClassSeats;
    }
    public Set getBusinessSeatses() {
        return this.businessSeatses;
    }
    
    public void setBusinessSeatses(Set businessSeatses) {
        this.businessSeatses = businessSeatses;
    }
    public Set getFirstClassSeatses() {
        return this.firstClassSeatses;
    }
    
    public void setFirstClassSeatses(Set firstClassSeatses) {
        this.firstClassSeatses = firstClassSeatses;
    }
    public Set getFlightses() {
        return this.flightses;
    }
    
    public void setFlightses(Set flightses) {
        this.flightses = flightses;
    }
    public Set getEconomySeatses() {
        return this.economySeatses;
    }
    
    public void setEconomySeatses(Set economySeatses) {
        this.economySeatses = economySeatses;
    }
    public Set getPremiumEconomySeatses() {
        return this.premiumEconomySeatses;
    }
    
    public void setPremiumEconomySeatses(Set premiumEconomySeatses) {
        this.premiumEconomySeatses = premiumEconomySeatses;
    }




}

