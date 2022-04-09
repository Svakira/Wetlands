package model;
public class Wetland {
    //atributos
    private String name;
    private int locationZone;
    private int typeLocation;
    private double km;
    private String url;
    private String nameCorregimiento;
    private String neigh;
    
    //relación
    //metodos
    public Wetland(String name, int locationZone, int typeLocation, double km, String url, String nameCorregimiento, String neigh, int protectedA) {
        this.name = name;
        this.locationZone=locationZone;
        this.typeLocation=typeLocation;
        this.url=url;
    }
   
    
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLocationZone(){
        return  this.locationZone;
    }
    public void setLocationZone(int locationZone) {
        this.locationZone = locationZone;
    }
    public int getTypeLocation(){
        return this.typeLocation;
    }
    public void setTypeLocation(int typeLocation) {
        this.typeLocation = typeLocation;
    }
    public int getKm(){
        return this.km;
    }
    public void setKm(double km) {
        this.km= km;
    }
    public int getUrl(){
        return this.url;
    }
    public void setUrl(String url) {
        this.url= url;
    }
    public int getNameCorregimiento(){
        return this.nameCorregimiento;
    }
    public void setNameCorregimiento(String nameCorregimiento) {
        this.nameCorregimiento= nameCorregimiento;
    }
    public int getNeigh(){
        return this.neigh;
    }
    public void setNeigh(String neigh) {
        this.neigh= neigh;
    }

    
   

}
