package model;
public class Controler{
    public static final int MAXWET=80;
    
    //relations
    private static Wetland[] wetland;
    private static FloraFauna[] specie;

    //methods
 public Controler() {
     wetland=new Wetland[MAXWET];
     specie=new FloraFauna[MAXWET];
   
}
	/**
	 *addWetland
	 *adds a wetland to the array
	 *<b>pre: the array is created
	 *<b>post: the info is registered in a position of the array
	 *@return String
	 */
public String addWetland(String name, String locationZone, String typeLocation,double  km, String url, String nameCorregimiento, String neigh, String protectedA){
    boolean entry=true;
    String mens="The wetland was created sucesfully";
    for(int i=0; i<MAXWET && entry; i++){
        if(wetland[i]==null){
            wetland[i]=new Wetland (name, locationZone, typeLocation,km,url,nameCorregimiento,neigh,protectedA);
            entry=false;
        }
    }
    return mens;

}
	/**
	 *searchWetland
	 *search the wetland with the given name
	 *<b>pre: the array must contain data
	 *<b>post: when the given name and the wetland name are the same the position is going to return
	 *@param wetland[] !=0.  
	 *@param nameWetland !=null;
	 *@return int
	 */
public int searchWetland (String nameWetland){
    int pos=0;
    boolean continuar=true;
    for(int i=0; wetland[i]!=null && continuar ;i++){
        if(wetland[i].getName().equals(nameWetland)){
            pos=i;
            continuar=false;
        }
    }
    return pos;
}
	/**
	 *addSpecie
	 *adds a specie into the wetland array
	 *<b>pre: the user has fulfilled the array 
	 *<b>post: the specie info is going to be registrated in the wetland Array
	 *@param wetland !=0.  
	 *@param addEspecie !=null:
	 *@return String
	 */
public String addSpecie(String nameWetland,String name,String  cientificName,String migratory,String type,int answMenu){
    boolean entry=true;
    int posicion=searchWetland(nameWetland);
    String menss= wetland[posicion].addEspecie(name, cientificName, migratory,type, answMenu);
    return menss;
}
	/**
	 *addEvent
	 *adds a event into the wetland array
	 *<b>pre: the user has fulfilled the array
	 *<b>post: the event info is going to be registrated in the wetland array
	 *@param wetland[] !=0.  
	 *@param  addEvento !=null:
	 *@return void
	 */
public String addEvent(String nameWetland,int year, int month,int day,String name,double value,String description,int answMenu){
    boolean entry=true;
    int posicion=searchWetland(nameWetland);
    String menss= wetland[posicion].addEvento(nameWetland,year, month,day,name,value,description,answMenu);
    return menss;
}
	/**
	 *manteinanceQuantity
	 *gets the info of the quantity of manteinance in a year
	 *<b>pre: the user has fulfilled the array
	 *<b>post: the variable result is going to have the required info and be passed to the class main
	 *@param wetland[] !=0.  
	 *@param name !=null:
     *@param year !=0:
	 *@return void
	 */
public String manteinanceQuantity(int yearU){
    int pos=-1;
    String result="The quantity of manteinance in the year "+yearU+"\n";
    boolean continuar=true;
    for(int i=0; i<MAXWET ;i++){
        if(wetland[i]!=null){
            result=result+wetland[i].getName()+": "+wetland[i].countMaint(yearU);
        }
    }
    return result;
}
/**
	 *wetlandLessFlora
	 *gets the info of the wetland with the less flora
	 *<b>pre: the user has fulfilled the array
	 *<b>post: the variable result is going to have the required info and be passed to the class main as well as the nameWetland, that haves less flora
	 *@param wetland[] !=0.  
	 *@param name !=null:
     *@param year !=0:
	 *@return String
	 */
public String wetlandLessFlora(){
    int pos=-1;
    String nameWetland="";
    String result="The wetland with the less quantity of flora is ";
    int contt=999999;
    for(int i=0; i<MAXWET ;i++){
        if(wetland[i]!=null){
            int floraQuantity=wetland[i].countFlora();
            if (floraQuantity<contt){
                contt=floraQuantity;
                nameWetland=wetland[i].getName();
            }
        }
    }
    return result+nameWetland;
}
/**
	 *wetlandHighestFauna
	 *gets the info of what is the wetland with the highest fauna
	 *<b>pre: the user has fulfilled the array
	 *<b>post: the method receives the data and send it to the main
	 *@param wetland[] !=null.  
	 *@return String
	 */
public String wetlandHighestFauna(){
    String nameWetland="";
    String result="The wetland with the highest quantity of fauna is ";
    int contt=-1;
    for(int i=0; i<MAXWET ;i++){
        if(wetland[i]!=null){
            int faunaQuantity=wetland[i].countFauna();
            if (faunaQuantity>contt){
                contt=faunaQuantity;
                nameWetland=wetland[i].getName();
            }
        }
    }
    return result+nameWetland;
}
/**
	 *searchWetlandSpecie
	 *searchs in the array of wetland where de specie name is the same as the given for the user
	 *<b>pre: the user has fulfilled the array
	 *<b>post: the variable result is going to have the required info and be passed to the class main as well as the nameWetland, that haves less flora
	 *@param wetland[] !=null.  
	 *@return String
	 */
public String searchWetlandSpecie(String nameSpecie){
    int pos=-1;
    boolean entry=true;
    String nameWetland="";
    String result="";
    int contt=-1;
    for(int i=0; i<MAXWET && entry==true;i++){
        if(wetland[i]!=null){
           nameWetland+="\n"+wetland[i].searchSpecie(nameSpecie);
            result+=nameWetland+" is in the wetland"+wetland[i].getName();
           entry=false;
        }
    }
    return result;
}
/**
	 *showAll
	 *gets the info of the wetland
	 *<b>pre: the user has fulfilled the array
	 *<b>post: the mens is created
	 *@param wetland[] !=null.  
	 *@return String
	 */
public String showAll(int pos){
   String mens= "The wetlands named "+wetland[pos].getName()+" have "+wetland[pos].countFauna()+" of fauna "+wetland[pos].countFlora()+" of flora "+wetland[pos].getKm()+" of km "+wetland[pos].getLocationZone()+" is the location zone ";
   return mens;
}
public int quantityWetland(){
    int cont=0;
    for(int i = 0; wetland[i]!=null;i++){
        cont++;
    }
    return cont;
 }


}