package ui;
import model.*;
import java.util.Scanner;
public class Main{
    public static final Scanner lect= new Scanner(System.in);
    public static void main(String[] args){
        boolean entry=false;
        int answEntry;
        Wetland objEmp=null;
        while (!entry ){
            System.out.println ("\n To create a wetland enter 1");
            System.out.println ("Register a new species in the wetland 2");
            System.out.println ("Register an event on the wetland 3");
            System.out.println ("Para terminar proceso digite 4");
            answEntry=lect.nextInt();
            lect.nextLine();
            
            switch(answEntry){
                
                case 1:
                 objEmp=createWetland(lect);
                
                break;
                
                case 2:
                break;
                
                case 3:

                break;
            
                case 4:
                entry=true;
                System.out.print("Gracias por su tiempo");
                break;
                
            }
    }
    }
    public static Wetland createWetland(Scanner lect){
        System.out.println("enter de name of the wetland");
        String name=lect.nextLine();
        System.out.println("enter the location zone 1:urban, 2:rural");
        int locationZone=lect.nextInt();
        if (locationZone==2){
            System.out.println("Enter the name of the corregimiento");
            String nameCorregimiento=lect.nexLine();
        }
        else{
            System.out.println("Enter the name of the neighborhood");
            String neigh=lect.nextLine();
        }
        System.out.println("Type of the location zone 1:public, 2:private");
        int typeLocation=lect.nextInt();
        System.out.println("Quantity of km2");
        double km=lect.nextDouble();
        System.out.println("url of the picture");
        String url=lect.nextLine();
        System.out.println("Has this wetland been declared as protected area? 1: yes, 2: no");
        int protectedA=lect.nextInt();
        Wetland emp= new Wetland(name, locationZone, typeLocation, km, url, nameCorregimiento,neigh, protectedA);
        return emp;
    }
    public static String desplegarCedula(Empleado e){
        String mens="la cedula del empleado es "+e.getCedula();
        return mens;
    }
    public static String desplegarEdad(Empleado e){
        System.out.print("fecha actual");
        int diaAct=lect.nextInt();
        int mesAct=lect.nextInt();
        int anioAct=lect.nextInt();
        Fecha obj = new Fecha (diaAct, mesAct, anioAct);
        String mens="la edad del empleado "+e.getCedula()+" es : "+e.edad(obj);
        return mens;
    }
    
    
    }
    

    

        