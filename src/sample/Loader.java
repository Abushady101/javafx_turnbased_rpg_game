package sample;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Loader {
   

    public  String loot1 ()throws Exception{
    //read from text files and return a string//
    File file =new File("./src/weapons.txt");
    Scanner weapons =new Scanner(file);
    ArrayList<String> weapon = new ArrayList<String>();
     while(weapons.hasNextLine())
     { 

         weapon.add(weapons.nextLine());
     }
    Game g1 =new  Game ();
    String weaponran=weapon.get(g1.RNGW());
    weapons.close();
    String[] parts = weaponran.split("\\s+");
    String type=parts[0];
    String name = parts[1];
    return (name+" "+type);

}
    public  String loot2 ()throws Exception{
    //read from text files and return a string//
    File file =new File("./src/armor.txt");
    Scanner items =new Scanner(file);
    ArrayList<String> weapon = new ArrayList<String>();
     while(items.hasNextLine())
     { 
        weapon.add(items.nextLine());
     }
    Game g1 =new  Game ();
    String itemran =weapon.get(g1.RNGW());
    items.close();
    String[] parts = itemran.split("\\s+");
    String name = parts[1];
    return (name+" helmet");

}
    public  String loot3 ()throws Exception{
    //read from text files and return a string//
    File file =new File("./src/armor.txt");
    Scanner items =new Scanner(file);
        ArrayList<String> weapon = new ArrayList<String>();
     while(items.hasNextLine())
     { 

         weapon.add(items.nextLine());
     }
    Game g1 =new  Game ();
    String itemran =weapon.get(g1.RNGW());
    items.close();
    String[] parts = itemran.split("\\s+");
    String name = parts[1];
    return (name+" chest");

}
    public  String loot4 ()throws Exception{
    //read from text files and return a string//
    File file =new File("./src/armor.txt");
    Scanner items =new Scanner(file);
        ArrayList<String> weapon = new ArrayList<String>();
     while(items.hasNextLine())
     { 

         weapon.add(items.nextLine());
     }
    Game g1 =new  Game ();
    String itemran =weapon.get(g1.RNGW());
    items.close();
    String[] parts = itemran.split("\\s+");
    String name = parts[1];
    return (name+" arms");

}
    public  String loot5 ()throws Exception{
    //read from text files and return a string//
    File file =new File("./src/armor.txt");
    Scanner items =new Scanner(file);
        ArrayList<String> weapon = new ArrayList<String>();
     while(items.hasNextLine())
     { 

         weapon.add(items.nextLine());
     }
    Game g1 =new  Game ();
    String itemran =weapon.get(g1.RNGW());
    items.close();
    String[] parts = itemran.split("\\s+");
    String name = parts[1];
    return (name+" boots");

}     
    public  String loot6 ()throws Exception{
    //read from text files and return a string//
    File file =new File("./src/armor.txt");
    Scanner items =new Scanner(file);
    ArrayList<String> weapon = new ArrayList<String>();
     while(items.hasNextLine())
     { 

         weapon.add(items.nextLine());
     }
    Game g1 =new  Game ();
    String itemran =weapon.get(g1.RNGW());
    items.close();
    String[] parts = itemran.split("\\s+");
    String name = parts[1];
    return (name+" necklace");

}
    public  String loot7 ()throws Exception{
    //read from text files and return a string//
    File file =new File("./src/armor.txt");
    Scanner items =new Scanner(file);
    ArrayList<String> weapon = new ArrayList<String>();
     while(items.hasNextLine())
     { 

         weapon.add(items.nextLine());
     }
    Game g1 =new  Game ();
    String itemran =weapon.get(g1.RNGW());
    items.close();
    String[] parts = itemran.split("\\s+");
    String name = parts[1];
    return (name+" ring");

}   
}
