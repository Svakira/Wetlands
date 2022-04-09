package model;
public class FloraFauna {
    public static final int MAXWET=80;
    //atributos
    private String nameWetland;
    private String name;
    private String cientificName;
    private String migratory;
    private String type;
    private SpecieType specieTypes;
    
    //relación
    //metodos
    public FloraFauna(String nameWetland,String name,String cientificName,String migratory,String type,int answMenu) {
            switch (answMenu){
                case 1:
                    specieTypes = SpecieType.TERRESTRIAL_FLORA;
                    break;
                case 2 :
                    specieTypes = SpecieType.AQUATIC_FLORA;
                    break;
                case 3:
                    specieTypes = SpecieType.BIRD;
                    break;
                case 4 :
                    specieTypes = SpecieType.MAMMAL;
                    break;  
                case 5 :
                    specieTypes = SpecieType.AQUATIC;
                    break; 
                
            }
            this.nameWetland=nameWetland;
            this.name=name;
            this.cientificName=cientificName;
            this.migratory=migratory;
            this.type=type;
        

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
    public String getCientificName(){
        return this.cientificName;
    }
    public void setCientificName(String cientificName) {
        this.cientificName = cientificName;
    }
    public String getMigratory(){
        return this.migratory;
    }
    public void setMigratory(String migratory) {
        this.migratory = migratory;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type) {
        this.type= type;
    }
    public SpecieType getSpecieTypes(){
        return this.specieTypes;
    }
    public void setSpecieTypes(SpecieType specieTypes) {
        this.specieTypes = specieTypes;
    }
}
