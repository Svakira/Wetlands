package model;
public class Wetland {
    public static final int MAXWET=1000;
    //atributes
    private String nameWetland;
    private String name;
    private String locationZone;
    private String typeLocation;
    private double km;
    private String url;
    private String nameCorregimiento;
    private String neigh;
    private String protectedA;

    private FloraFauna[] specie;
    private Events[] event;
    private Wetland[] wetland;
    
    
    //relations
    //methods
    public Wetland(String name, String locationZone, String typeLocation, double km, String url, String nameCorregimiento, String neigh, String protectedA) {
        this.name = name;
        this.locationZone=locationZone;
        this.typeLocation=typeLocation;
        this.km=km;
        this.url=url;
        this.nameCorregimiento=nameCorregimiento;
        this.neigh=neigh;
        this.protectedA=protectedA;
        specie = new FloraFauna[MAXWET];
        event= new Events [MAXWET];
    }
   
    
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocationZone(){
        return  this.locationZone;
    }
    public void setLocationZone(String locationZone) {
        this.locationZone = locationZone;
    }
    public String getTypeLocation(){
        return this.typeLocation;
    }
    public void setTypeLocation(String typeLocation) {
        this.typeLocation = typeLocation;
    }
    public double getKm(){
        return this.km;
    }
    public void setKm(double km) {
        this.km= km;
    }
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url) {
        this.url= url;
    }
    public String getNameCorregimiento(){
        return this.nameCorregimiento;
    }
    public void setNameCorregimiento(String nameCorregimiento) {
        this.nameCorregimiento= nameCorregimiento;
    }
    public String getNeigh(){
        return this.neigh;
    }
    public void setNeigh(String neigh) {
        this.neigh= neigh;
    }

    public String getProtectedA(){
        return this.protectedA;
    }
    public void setProtectedA(String protectedA) {
        this.protectedA= protectedA;
    }
    public FloraFauna[] getSpecie() {
		return specie;
	}

	public void setSpecie(FloraFauna[] specie) {
		this.specie = specie;
	}
    public String getNameWetland() {
		return nameWetland;
	}

	public void setNameWetland(String nameWetland) {
		this.nameWetland = nameWetland;
	}
    
   
    /**
	 *addEspecie
	 *add specie in the wetland
	 *<b>pre: the array is created
	 *<b>post: the info is added to the array of wetland
	 *@return String
	 */
    public String addEspecie(String name,String  cientificName,String migratory,String type,int answMenu){
        boolean entry=true;
        String menss=" ";
        for(int i=0; i<MAXWET && entry==true; i++){
            if(specie[i]==null){
                specie[i]=new FloraFauna (nameWetland,name, cientificName,migratory,type,answMenu);
                entry=false;
                 menss="The specie was registrated sucesfully";
            }
        }
        return menss;
    }
    /**
	 *addEvento
	 *adds a event to the array wetland
	 *<b>pre: the array is created
	 *<b>post: the info is registered in a position of the array
	 *@return String
	 */
    public String addEvento(String nameWetland,int year, int month,int day,String name,double value,String description,int answMenu){
        boolean entry=true;
        String menss="The event was registrated sucesfully";
        for(int i=0; i<MAXWET && entry==true; i++){
            if(event[i]==null){
                event[i]=new Events (nameWetland,year, month,day,name,value,description,answMenu);
                entry=false;
            }
        }
        return menss;
    }
    /**
	 *countMaint
	 *adds a wetland to the array
	 *<b>pre: the array is created and has data in it
	 *<b>post: the info is registered in a position of the array and is saving the quantity of events in a year given for the user
	 *@return int
	 */
    public int countMaint (int yearU){
        boolean entry=true;
        int count=0;
        for(int i=0; i<MAXWET; i++){
            if(event[i]!=null){
                if(event[i].getYear()==yearU && event[i].getEventTypes()==EventType.MANINTENANCE)
                count++;
                entry=false;
            }
        }
        return count;
    }
    /**
	 *countFlora
	 *counts the quantity of flora 
	 *<b>pre: the array is created and haves the data 
	 *<b>post: haves the quantity of flora and returns
	 *@return int
	 */
    public int countFlora (){
        boolean entry=true;
        int count=0;
        for(int i=0; i<MAXWET; i++){
            if(specie[i]!=null){
                if(specie[i].getSpecieTypes()==SpecieType.TERRESTRIAL_FLORA || specie[i].getSpecieTypes() == SpecieType.AQUATIC_FLORA);
                count++;
                entry=false;
            }
        }
        return count;
    }
    /**
	 *countFauna
	 *adds a wetland to the array
	 *<b>pre: the array is created
	 *<b>post: the info is registered in a position of the array
	 *@return String
	 */
    public int countFauna (){
        boolean entry=true;
        int count=0;
        for(int i=0; i<MAXWET; i++){
            if(specie[i]!=null){
                if(specie[i].getSpecieTypes()==SpecieType.BIRD || specie[i].getSpecieTypes() == SpecieType.MAMMAL || specie[i].getSpecieTypes() == SpecieType.AQUATIC);
                count++;
                entry=false;
            }
        }
        return count;
    }
    /**
	 *searchSpecie
	 *search a specie 
	 *<b>pre: the array is created
	 *<b>post: returns the name
	 *@return String
	 */
    public String searchSpecie (String nameSpecie){
        String nameWetland=" ";
        System.out.print(nameWetland);
        for(int i=0; i<MAXWET; i++){
            if(specie[i]!=null){
                if(specie[i].getName().equals(nameSpecie)){
                 nameWetland="The species is in";
                 
                }
            }
        }
        return nameWetland;
    }
    /**
	 *countSpecieFauna
	 *count how many species of fauna are on the array
	 *<b>pre: the array is created
	 *<b>post: return the quantity
	 *@return int
	 */
    public int countSpecieFauna(){
        int count =0;
        for(int i=0; i<specie.length && specie[i]!=null; i++){
            if(specie[i].getSpecieTypes()==SpecieType.AQUATIC || specie[i].getSpecieTypes()==SpecieType.BIRD || specie[i].getSpecieTypes()==SpecieType.MAMMAL){
               count++;
            }
        }
        return count;
    }
    /**
	 *countSpecieFlora
	 *count how many species of dlora are on the array
	 *<b>pre: the array is created and have valid data
	 *<b>post: return the quantity
	 *@return int
	 */
    public int countSpecieFlora(){
        int count =0;
        for(int i=0; i<specie.length && specie[i]!=null; i++){
            if(specie[i].getSpecieTypes()==SpecieType.AQUATIC_FLORA|| specie[i].getSpecieTypes()==SpecieType.TERRESTRIAL_FLORA){
               count++;
            }
        }
        return count;
    }
  
}
