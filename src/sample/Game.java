package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {

    Controller c1 = new Controller();
    Loader l1;
    character player;
    Weapon Wep;
    Armor Arm;
    Accessories Acc;
    private static Media media = new Media(new File("./src/music.mp3").toURI().toString());
     MediaPlayer mediaPlayer = new MediaPlayer(media);
    private static Media soundmage = new Media(new File("./src/soundmage.mp3").toURI().toString());
    MediaPlayer mediaPlayer2 = new MediaPlayer(soundmage);
    private static Media soundswordsman = new Media(new File("./src/soundswordsman.mp3").toURI().toString());
    MediaPlayer mediaPlayer4 = new MediaPlayer(soundswordsman);
    private static Media enemy1 = new Media(new File("./src/enemy1.mp3").toURI().toString());
    MediaPlayer mediaPlayer3 = new MediaPlayer(enemy1);

    public Game() throws Exception {
        this.l1 = new Loader();
        this.player = new character();
        this.Wep = new Weapon();
        this.Arm = new Armor();
        this.Acc = new Accessories();

    }

    public void loadsound() {

        mediaPlayer.play();
    }
    public void soundmage() {

        mediaPlayer2.play();
    }
    public void soundswordsman() {

        mediaPlayer4.play();
    }
    public void loadenemy1()
    {
        mediaPlayer3.play();
    }

    public int RNG() {
        int max = 10;
        int min = 1;
        int range = max - min + 1;


        int rng = (int) (Math.random() * range) + min;
        return rng;
    }
     public int RNGW() {
        int max = 50;
        int min = 1;
        int range = max - min + 1;


        int rng = (int) (Math.random() * range) + min;
        return rng;
    }

    public Double DamageCounter(Double newhealth, Double Damage) {
        Double rhealth = newhealth - Damage;
        return rhealth;
    }
    public void wearlootpiece(String lootpiece) throws Exception
    {
        if(lootpiece.contains("axe") ||lootpiece.contains("flail") ||lootpiece.contains("longsword") ||
           lootpiece.contains("dagger") ||lootpiece.contains("gloves") )
        {   String[] parts = lootpiece.split("\\s+");
            File file =new File("./src/weapons.txt");
            Scanner weapons =new Scanner(file);
            while(weapons.hasNextLine()){
                String test=weapons.nextLine();
            if(test.contains(parts[0])&&test.contains(parts[1]))
            {
                String[] part = test.split("\\s+");
                player =new character(player.mana+0,player.health+0,player.damage+Double.parseDouble(part[2])
                        ,player.cchance+Double.parseDouble(part[3]),player.cdamage+Double.parseDouble(part[4]),player.armor+0);
            }

         
     
        }
        }
            else if(lootpiece.contains("helmet") ||lootpiece.contains("arms") ||lootpiece.contains("boots") ||
           lootpiece.contains("necklace") ||lootpiece.contains("chest") || lootpiece.contains("ring"))
        {   
            String[] parts = lootpiece.split("\\s+");
            File file =new File("./src/armor.txt");
            Scanner armors =new Scanner(file);
            while(armors.hasNextLine()){
                String test=armors.nextLine();
            if(test.contains(parts[0])&&test.contains(parts[1]))
            {
                String[] part2 = test.split("\\s+");
                player = new character(player.mana+Double.parseDouble(part2[5]),player.health+Double.parseDouble(part2[4]),player.damage+Double.parseDouble(part2[6])
                ,player.cchance+Double.parseDouble(part2[6]),player.cdamage+0,player.armor+Double.parseDouble(part2[3]));
            }

         
     
        }
        }
        }
    }




