package ui;
import model.*;
import java.time.LocalDate;
import java.util.Scanner;
/** 
 *clase Main <b>
 *Main generates the menssages for the user to register and receive data of wetlands 6  <b>
 *@author sara cardona 
 *@date 8/04/2022
 */
public class Main{
    /**
	 *name main <b>
	 *executable method of java and allows to enter the inputs and display the outputs on the screen 
	 *inputs: answEntry
	 *output : createWetland(),registerSpecie(),registerEvent(),displayManteinance(),displayWetlandLessFlora(),displayWetlandHighestFauna
	 *@param args String[]
	 */
    public static  Scanner lect= new Scanner(System.in);
    public static Controler cont=new Controler();
    public static void main(String[] args){
        boolean entry=false;
        int answEntry;
        while (!entry ){
            System.out.println (" (1) To create a wetland enter");
            System.out.println (" (2) Register a new species in the wetland ");
            System.out.println (" (3)  Register an event on the wetland ");
            System.out.println (" (4)  See the quantity of maintencance in a year ");
            System.out.println (" (5)  Wetland with less flora ");
            System.out.println (" (6)  To see in what wetland is the specie ");
            System.out.println (" (7)  Display the info of all the wetlands including the total of species per type ");
            System.out.println (" (8)  Name of the wetland with the highest quantity of fauna ");
            System.out.println (" (9) To end process ");
            answEntry=lect.nextInt();
            lect.nextLine();
            
            switch(answEntry){
                
                case 1:
                 createWetland();
                break;
                case 2:
                 registerSpecie();
                break;
                case 3:
                 registerEvent();
                break;
                case 4:
                displayManteinance();
                break;
                case 5:
                displayWetlandLessFlora();
                break;
                case 6:
                displayWetlandSpecie();
                break;
                case 7:
                displayAllInfo();
                break;
                case 8:
                displayWetlandHighestFauna();
                break;
                case 9:
                entry=true;
                System.out.print("Thanks for using our services");
                break;
                
            }
    }
    }
    
    	/**
	 *createWetland
	 *register the wetland
	 *@return void
	 */
    public static void createWetland(){
        System.out.println("enter de name of the wetland");
        String name=lect.nextLine();
        System.out.println("enter the location zone (urban, rural)");
        String locationZone=lect.nextLine();
        String nameCorregimiento=null;
        String neigh=null;
        if (locationZone.equalsIgnoreCase("urban")){
            System.out.println("Enter the name of the neighborhood");
             nameCorregimiento=lect.nextLine();
        }
        else{

            System.out.println("Enter the name of the corregimiento");
             neigh=lect.nextLine();
        }
        System.out.println("Type of the location zone (public, private)");
        String typeLocation=lect.nextLine();
        System.out.println("Quantity of km2");
        double km=lect.nextDouble();
        lect.nextLine();
        System.out.println("url of the picture");
        String url=lect.nextLine();
        System.out.println("Has this wetland been declared as protected area?  (yes, no)");
        String protectedA=lect.nextLine();
        System.out.println("The wetland was registered sucesfully");
        String menssage = cont.addWetland(name, locationZone, typeLocation, km, url, nameCorregimiento, neigh, protectedA);
        System.out.println(menssage);
    }
    	/**
	 *registerSpecie
	 *register the specie 
	 *@return void
	 */
    public static void registerSpecie(){
        String nameWetland=null;
        String name=null;
        String cientificName=null;
        String migratory=null;
        String type=null;
        System.out.println (" What kind of species do you want to register?");
        System.out.println (" To register an terrestial flora specie press 1");
        System.out.println (" To register an aquatic flora specie press 2");
        System.out.println (" To register a bird specie press 3");
        System.out.println (" To register an aquatic specie press 4");
        int answMenu=lect.nextInt();
        lect.nextLine();
        switch(answMenu){
                
            case 1:
                System.out.println ("Enter the name of the wetland");
                nameWetland=lect.nextLine();
                System.out.println ("Enter the name of the specie");
                name=lect.nextLine();
                System.out.println ("Enter the cientific name of the specie");
                cientificName=lect.nextLine();
                System.out.println ("Is the specie migratory?");
                migratory=lect.nextLine();
                type="terrestial flora";
                break;
            
                case 2:
                System.out.println ("Enter the name of the specie");
                name=lect.nextLine();
                System.out.println ("Enter the cientific name of the specie");
                cientificName=lect.nextLine();
                System.out.println ("Is the specie migratory?");
                migratory=lect.nextLine();
                type="aquatic flora";
                break;
                case 3:
                System.out.println ("Enter the name of the specie");
                name=lect.nextLine();
                System.out.println ("Enter the cientific name of the specie");
                cientificName=lect.nextLine();
                System.out.println ("Is the specie migratory?");
                migratory=lect.nextLine();
                type="bird";
                break;
                case 4:
                System.out.println ("Enter the name of the specie");
                name=lect.nextLine();
                System.out.println ("Enter the cientific name of the specie");
                cientificName=lect.nextLine();
                System.out.println ("Is the specie migratory?");
                migratory=lect.nextLine();
                type="mammal";
                break;
                case 5:
                System.out.println ("Enter the name of the specie");
                name=lect.nextLine();
                System.out.println ("Enter the cientific name of the specie");
                cientificName=lect.nextLine();
                System.out.println ("Is the specie migratory?");
                migratory=lect.nextLine();
                type="aquatic";
                break;
        }
        System.out.println("The specie was registered sucesfully");
        String menssage = cont.addSpecie(nameWetland,name, cientificName,migratory,type,answMenu);
        System.out.println(menssage);
    
    }
    	/**
	 *registerEvent
	 *register the event in a determinated wetland
	 *@return void
	 */
    public static void registerEvent(){
        String name=null;
        String nameWetland=null;
        double value=0;
        String description=null;
        int day=0;
        int month=0;
        int year=0;
        System.out.println (" What kind of event do you want to register?");
        System.out.println (" To register a manintenance press 1");
        System.out.println (" To register a school visit press 2");
        System.out.println (" To register a breeding activity press 3");
        System.out.println (" To register a celebration press 4");
        int answMenu=lect.nextInt();
        lect.nextLine();
        LocalDate fecha;
        switch(answMenu){
                
            case 1:
                
                System.out.println ("Enter the name of the wetland in where is doing the event");
                nameWetland=lect.nextLine();
                System.out.println ("\n Enter the date (year, month,day)");
                year=lect.nextInt();
                month=lect.nextInt();
                day=lect.nextInt();
                lect.nextLine();
                System.out.println ("\n Who is doing the event");
                name=lect.nextLine();
                System.out.println ("\n Value of the event");
                value=lect.nextDouble();
                lect.nextLine();
                System.out.println ("\n Enter a description of the event");
                description=lect.nextLine();
                fecha = LocalDate.of(year,month,day);
                break;
            
            case 2:
                System.out.println ("Enter the name of the wetland in where is doing the event");
                nameWetland=lect.nextLine();
                System.out.println ("\n Enter the date (year, month,day)");
                year=lect.nextInt();
                month=lect.nextInt();
                day=lect.nextInt();
                System.out.println ("\n Who is doing the event");
                name=lect.nextLine();
                System.out.println ("\n Value of the event");
                value=lect.nextDouble();
                System.out.println ("\n Enter a description of the event");
                description=lect.nextLine();
                fecha = LocalDate.of(year,month,day);
            break;
            
            case 3:
                System.out.println ("Enter the name of the wetland in where is doing the event");
                nameWetland=lect.nextLine();
                System.out.println ("\n Enter the date (year, month,day)");
                year=lect.nextInt();
                month=lect.nextInt();
                day=lect.nextInt();
                System.out.println ("\n Who is doing the event");
                name=lect.nextLine();
                System.out.println ("\n Value of the event");
                value=lect.nextDouble();
                System.out.println ("\n Enter a description of the event");
                description=lect.nextLine();
                fecha = LocalDate.of(year,month,day);
                
            break;
            case 4:
                System.out.println ("Enter the name of the wetland in where is doing the event");
                nameWetland=lect.nextLine();
                System.out.println ("\n Enter the date (year, month,day)");
                year=lect.nextInt();
                month=lect.nextInt();
                day=lect.nextInt();
                System.out.println ("\n Who is doing the event");
                name=lect.nextLine();
                System.out.println ("\n Value of the event");
                value=lect.nextDouble();
                System.out.println ("\n Enter a description of the event");
                description=lect.nextLine();
                fecha = LocalDate.of(year,month,day);
                
            break;
        
            
    }
    
        String menssage = cont.addEvent(nameWetland,year, month,day,name,value,description,answMenu);
        System.out.println(menssage);
    
}
	/**
	 *displayManteinance
	 *produces the message that shows the quantity of manteinance has made in a year in the wetlands
	 *<b>pre: the user has entered a valid wetland and event
	 *<b>post: sends the info to show in the main with the quantity of manteinance in a year
	 *@return void
	 */
    public static void displayManteinance(){
     System.out.println("To see the quantity of manteinance in a year enter the year ");
        int yearU=lect.nextInt();

        String menssage = cont.manteinanceQuantity(yearU);
        System.out.println(menssage);
}
/**
	 *displayWetlandLessFlora
	 *produces the message that shows the quantity of less flora
	 *<b>pre: the user has entered a valid wetland and specie
	 *<b>post: sends the info to show in the main with the name of the wetland with less flora
	 *@return void
	 */
public static void displayWetlandLessFlora(){

       String menssage = cont.wetlandLessFlora();
       System.out.println(menssage);
}
/**
	 *displayHighestFauna
	 *produces the message that shows the highes quantity of fauna
	 *<b>pre: the user has entered a valid wetland and specie
	 *<b>post: sends the info to show in the main with the name of the wetland with highest fauna   
	 *@return void
	 */
public static void displayWetlandHighestFauna(){

    String menssage = cont.wetlandHighestFauna();
    System.out.println(menssage);
}
/**
	 *displayWetlandSpecie
	 *searchs in what wetland is the specie
	 *<b>pre: the user has entered a valid wetland and specie
	 *<b>post: sends the info to show in the main with the name of the wetland in where the specie is  
	 *@return void
	 */
public static void displayWetlandSpecie(){
    System.out.println("To search a specie in a wetland enter the specie");
    String nameSpecie=lect.nextLine();
    String menssage = cont.searchWetlandSpecie(nameSpecie);
    System.out.println(menssage);
}
/**
	 *displayAllInfo
	 *gets the information of the wetland
	 *<b>pre: the user has entered a valid wetland and specie
	 *<b>post: sends the info  
	 *@return void
	 */
public static void displayAllInfo(){
    int quantity=cont.quantityWetland();
    for(int i=0; i<quantity && quantity !=0; i++){
        System.out.println(cont.showAll(i));
    }

    
}
}