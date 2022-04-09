package model;
public class Events {
    public static final int MAXWET=80;
    //atributes
    private String nameWetland;
    private int year;
    private int month;
    private int day;
    private String name;
    private double value;
    private String description;
    private EventType eventTypes;
    
    //relations
    //methods
    public Events(String nameWetland,int year, int month,int day, String name,double value,String description,int answMenu) {
        this.name = name;
        switch (answMenu){
            case 1:
                eventTypes = EventType.MANINTENANCE;
                break;
            case 2 :
                eventTypes = EventType.SCHOOL_VISIT;
                break;
            case 3:
                eventTypes = EventType.ACTIVITIE;
                break;
            case 4:
                eventTypes = EventType.CELEBRATION;
                break;
        }
        this.value=value;
        this.year=year;
        this.description=description;
    }
   
    public String getNameWetland(){
        return this.nameWetland;
    }
    public void setNameWetland(String nameWetland) {
        this.nameWetland = nameWetland;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String description(){
        return this.description;
    }
    public void description(String description) {
        this.description = description;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public EventType getEventTypes(){
        return this.eventTypes;
    }
    public void setEventTypes(EventType eventTypes) {
        this.eventTypes=eventTypes;
    }
    
}