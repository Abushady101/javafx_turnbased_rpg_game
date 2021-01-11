package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventType;
import javafx.scene.control.ComboBox;


public class Controller {
    public static Double e1health ;
    public static Double ahealth;
    public static Double adamage;
    public static int setcharacter;
    public static int turn = 0;
    public static int levelnum;
    
    @FXML
    private Label damage ;

    @FXML
    private Label health;

    @FXML
    private Label mana;

    @FXML
    private Label armor;

    @FXML
    private Label critchance;

    @FXML
    private Label mana1;

    @FXML
    private Label critdmg;
    @FXML
    private Button lightening;
    @FXML
    private Button startlevel1;
    @FXML
    private Button fireball;
    @FXML
    private Button manashield;
    @FXML
    private Button ultb;
    @FXML
    private Button endturn;
    @FXML
    public Button nextlevel;
    @FXML
    public Button mage;
    @FXML
    public Button swordsman;
    @FXML
    public Button equip;
    @FXML
    public Label enemyhealth;
    @FXML
    public Label allyhealth;

    @FXML
    private ImageView lighteningfx;
    @FXML
    private ImageView fireballfx;
    @FXML
    private ImageView manashieldfx;
    @FXML
    private ImageView cutscene;
    @FXML
    private ImageView ult;
    @FXML
    private ImageView ultfx;
    @FXML
    private ImageView end;
    @FXML
    private ImageView enemy1fx;
    @FXML
    private ImageView character1;
    @FXML
    private ImageView character2;
    @FXML
    private ImageView dash;
    @FXML
    private ImageView character21;
    @FXML
    private ImageView spinfx;
    @FXML
    private ImageView dashback;
    @FXML
    private ImageView ult2fx;
    @FXML
    private ImageView strike;
    @FXML
    public Button test2;
    public Button test1;
    public Button test3;
    public Button test4;
    @FXML
    private ImageView tornado;
     @FXML
    private ImageView character;

    @FXML
    private ComboBox<String> weaponcb;

    @FXML
    private Button inventory_next;
    @FXML
    private Button editloadout;
    @FXML
    private ComboBox<String> ringcb;

    @FXML
    private ComboBox<String> necklacecb;

    @FXML
    private ComboBox<String> potioncb;

    @FXML
    private ComboBox<String> helmetcb;

    @FXML
    private ComboBox<String> armscb;

    @FXML
    private ComboBox<String> chestcb;

    @FXML
    private ComboBox<String> bootscb;
    @FXML
    private ImageView enemy11 ;
    
    @FXML
    private ImageView  enemyfx2;
    @FXML
    private ImageView eslash;
    @FXML
    private ImageView boss4fx;
    @FXML
    private ImageView enemy1fx2;
     
    public Controller() throws Exception {
    }

    @FXML
    private Button start;

    @FXML
    private Button exit;
    @FXML
    private Label enemydmg;
    @FXML
    private Label selfdmg;
    void disablebuttons ()
    {
        if (ahealth <= 0 || e1health<=0) {
            ultb.setDisable(true);
            fireball.setDisable(true);
            lightening.setDisable(true);
            manashield.setDisable(true);
            endturn.setDisable(true);
            nextlevel.setVisible(true);
            nextlevel.setDisable(false);
            test1.setDisable(true);
            test2.setDisable(true);
            test3.setDisable(true);
            test4.setDisable(true);
            if (ahealth <= 0) {
                end.setImage(new Image("defeat.png"));
                ahealth=100.0;
                e1health=100.0;
               
            }
            else if (e1health <= 0) {
                end.setImage(new Image("enemydefeated.png"));
                ahealth=100.0;
                e1health=100.0;
                
            }
            

        }
    }
    void checkturn() throws Exception {
        if (turn == 3) {
        if (e1health>0){
            if (levelnum==2  || levelnum==1){
                Timeline timeline = new Timeline(
                        new KeyFrame(Duration.seconds(0.5), e -> {
                            enemy1fx.setImage(new Image("enemy1fx.gif"));
                        }),
                        new KeyFrame(Duration.seconds(1.5), e -> {
                            enemy1fx.setImage(null);
                            
                        }),
                        new KeyFrame(Duration.seconds(1.5), e -> {
                            selfdmg.setText("-"+20);
                        }),new KeyFrame(Duration.seconds(2), e -> {
                            selfdmg.setText(null);
                        }));
                timeline.play();
                Game g1 = new Game();
                g1.loadenemy1();
                ahealth = g1.DamageCounter(ahealth, 20.0);
                allyhealth.setText("Health:" + ahealth );
           
            }
        
        else if (levelnum==3){Timeline timeline = new Timeline(
                    new KeyFrame(Duration.seconds(0), e -> {
                    enemy11.setImage(null);
                    }),
                    new KeyFrame(Duration.seconds(0), e -> {
                        enemy1fx.setImage(new Image("boss1dash.gif"));
                    }),
                    new KeyFrame(Duration.seconds(0.3), e -> {
                        enemy1fx.setImage(null);

                    }),
                    
                    new KeyFrame(Duration.seconds(0.3), e -> {
                        enemyfx2.setImage(new Image("boss1.gif"));
                    }),
                     new KeyFrame(Duration.seconds(0.6), e -> {
                    eslash.setImage(new Image("boss1ef.gif"));
                    }),
                    new KeyFrame(Duration.seconds(1), e -> {
                    eslash.setImage(null);
                    }),
                    new KeyFrame(Duration.seconds(1), e -> {
                    enemyfx2.setImage(null);
                   }),
                   new KeyFrame(Duration.seconds(1), e -> {
                    enemy1fx.setImage(new Image("boss1dashback.gif"));
                    }),
                    new KeyFrame(Duration.seconds(1.3), e -> {
                    enemy1fx.setImage(null);
                    }),
                    new KeyFrame(Duration.seconds(1.3), e -> {
                    enemy11.setImage(new Image("boss1.gif"));
                    }),
                    new KeyFrame(Duration.seconds(1.3), e -> {
                    selfdmg.setText("-"+30);
                    }),
                    new KeyFrame(Duration.seconds(1.9), e -> {
                    selfdmg.setText(null);
                    }));
            timeline.play();
            Game g1 = new Game();
            ahealth = g1.DamageCounter(ahealth, 50.0);
            allyhealth.setText("Health:" + ahealth );}
        
        
             else if (levelnum==4){
                Timeline timeline = new Timeline(
                        new KeyFrame(Duration.seconds(0.5), e -> {
                            enemy1fx.setImage(new Image("enemyfx2.gif"));
                        }),
                        new KeyFrame(Duration.seconds(1.5), e -> {
                            enemy1fx.setImage(null);
                            
                        }),
                        new KeyFrame(Duration.seconds(1.5), e -> {
                            selfdmg.setText("-"+30);
                        }),new KeyFrame(Duration.seconds(2), e -> {
                            selfdmg.setText(null);
                        }));
                timeline.play();
                Game g1 = new Game();
                
                ahealth = g1.DamageCounter(ahealth, 50.0);
                allyhealth.setText("Health:" + ahealth );
           
            }
            else if (levelnum==5){
                Timeline timeline = new Timeline(
                        new KeyFrame(Duration.seconds(0.5), e -> {
                            enemy1fx.setImage(new Image("minion4fx.gif"));
                        }),
                        new KeyFrame(Duration.seconds(1.5), e -> {
                            enemy1fx.setImage(null);
                            
                        }),
                        new KeyFrame(Duration.seconds(1.5), e -> {
                            selfdmg.setText("-"+30);
                        }),new KeyFrame(Duration.seconds(2), e -> {
                            selfdmg.setText(null);
                        }));
                timeline.play();
                Game g1 = new Game();
                g1.loadenemy1();
                ahealth = g1.DamageCounter(ahealth, 60.0);
                allyhealth.setText("Health:" + ahealth );
           
            }
            else if (levelnum==6){
                Timeline timeline = new Timeline(
                     new KeyFrame(Duration.seconds(0), e -> {
                        cutscene.setImage(new Image("boss3fx.gif"));
                     }),
                     new KeyFrame(Duration.seconds(2), e -> {
                       cutscene.setImage(null);
            
                            
                        }),
                        new KeyFrame(Duration.seconds(2), e -> {
                            selfdmg.setText("-"+35);
                        }),new KeyFrame(Duration.seconds(2.5), e -> {
                            selfdmg.setText(null);
                        }));
                timeline.play();
                Game g1 = new Game();
               
                ahealth = g1.DamageCounter(ahealth, 70.0);
                allyhealth.setText("Health:" + ahealth);
           
            }
            else if (levelnum==7){Timeline timeline = new Timeline(
                   
                    new KeyFrame(Duration.seconds(0), e -> {
                        enemy11.setImage(new Image("fbossj.gif"));
                    }),
                    new KeyFrame(Duration.seconds(0.2), e -> {
                        enemy11.setImage(null);

                    }),
                    
                    new KeyFrame(Duration.seconds(0.4), e -> {
                        enemy1fx2.setImage(new Image("fbossl.gif"));
                    }),
                    new KeyFrame(Duration.seconds(0.7), e -> {
                    enemy1fx2.setImage(null);
                   }),
                     new KeyFrame(Duration.seconds(0.8), e -> {
                    boss4fx.setImage(new Image("boss4fx.gif"));
                    }),
                    

                    new KeyFrame(Duration.seconds(3.5), e -> {
                    boss4fx.setImage(null);
                    }),
                   
                   
                    new KeyFrame(Duration.seconds(3.5), e -> {
                    enemy11.setImage(new Image("boss4.gif"));
                    }),
                    new KeyFrame(Duration.seconds(3.5), e -> {
                    selfdmg.setText("-"+30);
                    }),
                    new KeyFrame(Duration.seconds(4), e -> {
                    selfdmg.setText(null);
                    }));
            timeline.play();
            Game g1 = new Game();
            ahealth = g1.DamageCounter(ahealth, 100.0);
            allyhealth.setText("Health:" + ahealth);}
             
        }turn = 0;
        disablebuttons();

    }}


        @FXML
        void endturnclick (ActionEvent event) throws Exception {
        turn = 3;
        checkturn();
        disablebuttons();
    }

        @FXML
        void exitfx (ActionEvent event){
        Stage window = (Stage) start.getScene().getWindow();
        window.hide();

    }

        @FXML
        void startfx (ActionEvent event) throws Exception {
        try {
            e1health=100.0;
            ahealth=100.0;
            adamage=0.0;
            levelnum=1;
            Parent root = FXMLLoader.load(getClass().getResource("choose.fxml"));
            Stage window = (Stage) start.getScene().getWindow();
            window.setScene(new Scene(root, 600, 400));

        } catch (IOException e) {
            e.printStackTrace();
            
        }

    }

        @FXML
        void lighteningclick (ActionEvent event) throws Exception {
            Game g1 = new Game();
            g1.soundmage();
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.seconds(0), e -> {
                        lighteningfx.setImage(new Image("lighteningfx.gif"));
                    }),
                    new KeyFrame(Duration.seconds(1), e -> {
                        lighteningfx.setImage(null);
                    }),
            new KeyFrame(Duration.seconds(1), e -> {
                enemydmg.setText(""+10);
            }),new KeyFrame(Duration.seconds(1.5), e -> {
                enemydmg.setText(null);}
            ));
            timeline.play();
            turn++;
            e1health = g1.DamageCounter(e1health, 10.0 +  adamage);
            enemyhealth.setText("Health:" + e1health );
           
            checkturn();
            disablebuttons();
        }
        @FXML
        void fireballclick (ActionEvent event) throws Exception {
        Game g1 = new Game();
        g1.soundmage();
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    fireballfx.setImage(new Image("fireballfx.gif"));
                }),
                new KeyFrame(Duration.seconds(1.5), e -> {
                    fireballfx.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.5), e -> {
                    enemydmg.setText(""+15);
                }),new KeyFrame(Duration.seconds(2), e -> {
            enemydmg.setText(null);}
        ));
        timeline.play();
        turn++;
        e1health = g1.DamageCounter(e1health, 15.0+adamage);
        enemyhealth.setText("Health:" + e1health);
        
        checkturn();
        disablebuttons();

    }

        @FXML
        void manashieldclick (ActionEvent event) throws Exception {
        ahealth=ahealth+25;
        allyhealth.setText("Health:" + ahealth);
        Game g1 = new Game();
        g1.soundmage();
        manashieldfx.setImage(new Image("manashieldfx.gif"));
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(0), e -> {
               selfdmg.setText("+"+25);
            }),new KeyFrame(Duration.seconds(0.5), e -> {
                selfdmg.setText(null);}
            ));
        timeline.play();
        turn++;
        checkturn();
        disablebuttons();
    }
        @FXML
        void ultclick (ActionEvent event) throws Exception {

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    ult.setImage(new Image("ult.gif"));
                }),
                new KeyFrame(Duration.seconds(2), e -> {
                    ult.setImage(null);
                }),
                new KeyFrame(Duration.seconds(2), e -> {
                    cutscene.setImage(new Image("cutscene.gif"));
                }),
                new KeyFrame(Duration.seconds(3.25), e -> {
                    cutscene.setImage(null);
                }),
                new KeyFrame(Duration.seconds(3.25), e -> {
                    ultfx.setImage(new Image("ultfx.gif"));
                }),
                new KeyFrame(Duration.seconds(4.25), e -> {
                    ultfx.setImage(null);
                }),
                new KeyFrame(Duration.seconds(4.5), e -> {
                    if (e1health <= 0) {
                        end.setImage(new Image("enemydefeated.png"));
                    }
                }),
                new KeyFrame(Duration.seconds(1.5), e -> {
                    selfdmg.setText(""+40);
                }),new KeyFrame(Duration.seconds(2), e -> {
            selfdmg.setText(null);}
        ));
        timeline.play();
        turn++;
        Game g1 = new Game();
        g1.soundmage();
        System.out.println(""+g1.player.damage);
        e1health = g1.DamageCounter(e1health, 40.0+adamage);
        enemyhealth.setText("Health:" + e1health);
        checkturn();
        disablebuttons();
    }

    @FXML
    void nextlevelclick (ActionEvent event) throws Exception {
        Parent root2= FXMLLoader.load(getClass().getResource("inventory.fxml"));
        Stage window2 = (Stage) nextlevel.getScene().getWindow();
        window2.setScene(new Scene(root2, 600, 400));

    }

    public void mageclick(ActionEvent event) throws Exception {
        setcharacter = 1;
        Parent root3 = FXMLLoader.load(getClass().getResource("Level1.fxml"));
        Stage window3 = (Stage) mage.getScene().getWindow();
        window3.setScene(new Scene(root3, 832, 433));


    }

    public void swordsmanclick(ActionEvent event) throws Exception {
        setcharacter = 2;
        Parent root4 = FXMLLoader.load(getClass().getResource("Level1.fxml"));
        Stage window4 = (Stage) swordsman.getScene().getWindow();
        window4.setScene(new Scene(root4, 832, 433));
    }


    public void startlevel1click(ActionEvent event) {
        startlevel1.setVisible(false);
        startlevel1.setDisable(true);
        enemyhealth.setText("Health:" + e1health );
        allyhealth.setText("Health:" + ahealth);
        if (setcharacter==1)
        {Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    character1.setImage(new Image("spawn.gif"));
                }),
                new KeyFrame(Duration.seconds(3), e -> {
            character1.setImage(new Image("mage.gif"));

            ultb.setVisible(true);
            ultb.setDisable(false);
            lightening.setVisible(true);
            lightening.setDisable(false);
            fireball.setVisible(true);
            fireball.setDisable(false);
            manashield.setVisible(true);
            manashield.setDisable(false);
            endturn.setVisible(true);
            endturn.setDisable(false);}));
        timeline.play();
        }
        else if (setcharacter==2)
        {       startlevel1.setVisible(false);
                startlevel1.setDisable(true);
                Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    character2.setImage(new Image("spawn.gif"));
                }),
            new KeyFrame(Duration.seconds(3), e -> {
            character2.setImage(new Image("swordsman.gif"));
            test1.setVisible(true);
            test1.setDisable(false);
            test2.setVisible(true);
            test2.setDisable(false);
            test3.setVisible(true);
            test3.setDisable(false);
            test4.setVisible(true);
            test4.setDisable(false);
            endturn.setVisible(true);
            endturn.setDisable(false);
        }));
                timeline.play();
    }}

    public void testclick(ActionEvent event) throws Exception {
        Game g1 = new Game();
        g1.soundswordsman();
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                 character2.setImage(null);
                  }),
                new KeyFrame(Duration.seconds(0), e -> {
                    dash.setImage(new Image("dash.gif"));
                }),
                new KeyFrame(Duration.seconds(0.3), e -> {
                    dash.setImage(null);

                }),

                new KeyFrame(Duration.seconds(0.3), e -> {
                    character21.setImage(new Image("swordsman.gif"));
                  }),
                new KeyFrame(Duration.seconds(0.7), e -> {
                    spinfx.setImage(new Image("spin.gif"));
                }),
                new KeyFrame(Duration.seconds(1.3), e -> {
                    spinfx.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.3), e -> {
                    character21.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.3), e -> {
                    dashback.setImage(new Image("dashback.gif"));
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                    dashback.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                    character2.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                enemydmg.setText(""+20);
                }),new KeyFrame(Duration.seconds(2.1), e -> {
                enemydmg.setText(null);}
        ));
        timeline.play();
        turn++;
        e1health = g1.DamageCounter(e1health, 20.0+adamage);
        enemyhealth.setText("Health:" + e1health);
        checkturn();
        disablebuttons();

                }

    public void test4click(ActionEvent event) throws Exception {
        Game g1 = new Game();
        g1.soundswordsman();
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    character2.setImage(null);
                }),
                new KeyFrame(Duration.seconds(0), e -> {
                    dash.setImage(new Image("dash.gif"));
                }),
                new KeyFrame(Duration.seconds(0.3), e -> {
                    dash.setImage(null);

                }),

                new KeyFrame(Duration.seconds(0.3), e -> {
                    character21.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(0.7), e -> {
                    ult2fx.setImage(new Image("ult2fx.gif"));
                }),
                new KeyFrame(Duration.seconds(1.5), e -> {
                    ult2fx.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.5), e -> {
                    character21.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.5), e -> {
                    cutscene.setImage(new Image("cutscene2.gif"));
                }),
                new KeyFrame(Duration.seconds(4), e -> {
                    cutscene.setImage(null);
                }),
                new KeyFrame(Duration.seconds(4), e -> {
                    cutscene.setImage(new Image("blood.gif"));
                }),
                new KeyFrame(Duration.seconds(5.5), e -> {
                    cutscene.setImage(null);
                }),
                new KeyFrame(Duration.seconds(5.5), e -> {
                    dashback.setImage(new Image("dashback.gif"));
                }),
                new KeyFrame(Duration.seconds(5.8), e -> {
                    dashback.setImage(null);
                }),
                new KeyFrame(Duration.seconds(5.8), e -> {
                    character2.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(5.8), e -> {
                    enemydmg.setText(""+30);
                }),new KeyFrame(Duration.seconds(6.3), e -> {
            enemydmg.setText(null);}
        ));
        timeline.play();
        turn++;
        e1health = g1.DamageCounter(e1health, 30.0+adamage);
        enemyhealth.setText("Health:" + e1health );
        checkturn();
        disablebuttons();

    }

    public void test1click(ActionEvent event) throws Exception {
        Game g1 = new Game();
        g1.soundswordsman();
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    character2.setImage(null);
                }),
                new KeyFrame(Duration.seconds(0), e -> {
                    dash.setImage(new Image("dash.gif"));
                }),
                new KeyFrame(Duration.seconds(0.3), e -> {
                    dash.setImage(null);

                }),

                new KeyFrame(Duration.seconds(0.3), e -> {
                    character21.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(0.7), e -> {
                    spinfx.setImage(new Image("spin.gif"));
                }),
                new KeyFrame(Duration.seconds(1.3), e -> {
                    spinfx.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.3), e -> {
                    character21.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.3), e -> {
                    dashback.setImage(new Image("dashback.gif"));
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                    dashback.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                    character2.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                    enemydmg.setText(""+10);
                }),new KeyFrame(Duration.seconds(2.1), e -> {
                    enemydmg.setText(null);}
        ));
        timeline.play();
        turn++;
        e1health = g1.DamageCounter(e1health, 10.0+adamage);
        enemyhealth.setText("Health:" + e1health );
        checkturn();
        disablebuttons();

    }


    public void test3click(ActionEvent event) throws Exception {
        Game g1 = new Game();
        g1.soundswordsman();
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    character2.setImage(null);
                }),
                new KeyFrame(Duration.seconds(0), e -> {
                    dash.setImage(new Image("dash.gif"));
                }),
                new KeyFrame(Duration.seconds(0.3), e -> {
                    dash.setImage(null);

                }),

                new KeyFrame(Duration.seconds(0.3), e -> {
                    character21.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(0.7), e -> {
                    tornado.setImage(new Image("tornado.gif"));
                }),
                new KeyFrame(Duration.seconds(3), e -> {
                    tornado.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.3), e -> {
                    character21.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.3), e -> {
                    dashback.setImage(new Image("dashback.gif"));
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                    dashback.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                    character2.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(1.6), e -> {
                    enemydmg.setText(""+20);
                }),new KeyFrame(Duration.seconds(2.1), e -> {
                    enemydmg.setText(null);}
        ));
        timeline.play();
        turn++;
        e1health = g1.DamageCounter(e1health, 20.0+adamage);
        enemyhealth.setText("Health:" + e1health);
        checkturn();
        disablebuttons();
    }

    public void test2click(ActionEvent event) throws Exception {
        Game g1 = new Game();
        g1.soundswordsman();
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    character2.setImage(null);
                }),
                new KeyFrame(Duration.seconds(0), e -> {
                    dash.setImage(new Image("dash.gif"));
                }),
                new KeyFrame(Duration.seconds(0.3), e -> {
                    dash.setImage(null);

                }),
                new KeyFrame(Duration.seconds(0.3), e -> {
                    character21.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(0.7), e -> {
                    strike.setImage(new Image("strike.gif"));
                }),
                new KeyFrame(Duration.seconds(0.9), e -> {
                    strike.setImage(null);
                }),
                new KeyFrame(Duration.seconds(0.9), e -> {
                    character21.setImage(null);
                }),
                new KeyFrame(Duration.seconds(0.9), e -> {
                    dashback.setImage(new Image("dashback.gif"));
                }),
                new KeyFrame(Duration.seconds(1.2), e -> {
                    dashback.setImage(null);
                }),
                new KeyFrame(Duration.seconds(1.2), e -> {
                    character2.setImage(new Image("swordsman.gif"));
                }),
                new KeyFrame(Duration.seconds(1.5), e -> {
                    enemydmg.setText(""+15);
                }),new KeyFrame(Duration.seconds(2), e -> {
                    enemydmg.setText(null);}
        ));
        timeline.play();
        turn++;
        e1health = g1.DamageCounter(e1health, 15.0+adamage);
        enemyhealth.setText("Health:" + e1health );
        checkturn();
        disablebuttons();
    }
       public void buttonsenable()
    {
        ringcb.setVisible(true);
        ringcb.setDisable(false);
        potioncb.setVisible(true);
        potioncb.setDisable(false);
        weaponcb.setVisible(true);
        weaponcb.setDisable(false);
        necklacecb.setVisible(true);
        necklacecb.setDisable(false);
        helmetcb.setVisible(true);
        helmetcb.setDisable(false);
        chestcb.setVisible(true);
        chestcb.setDisable(false);
        armscb.setVisible(true);
        armscb.setDisable(false);
        bootscb.setVisible(true);
        bootscb.setDisable(false);
        inventory_next.setVisible(true);
        inventory_next.setDisable(false);
    }
     public static ArrayList<String> weapons = new ArrayList<String>();
     public static ArrayList<String> helmets  = new ArrayList<String>();
     public static ArrayList<String> chests = new ArrayList<String>();
     public static ArrayList<String> arms = new ArrayList<String>();
     public static ArrayList<String> boots  = new ArrayList<String>();
     public static ArrayList<String> necklaces = new ArrayList<String>();
     public static ArrayList<String> rings = new ArrayList<String>();
    public void editloadoutclick (ActionEvent event) throws Exception
    {   Loader l1 = new Loader();
        weapons.add(l1.loot1());
        weaponcb.getItems().addAll(weapons);
        helmets.add(l1.loot2());
        helmetcb.getItems().addAll(helmets);
        chests.add(l1.loot3());
        chestcb.getItems().addAll(chests);
        arms.add(l1.loot4());
        armscb.getItems().addAll(arms);
        boots.add(l1.loot5());
        bootscb.getItems().addAll(boots);
        necklaces.add(l1.loot6());
        necklacecb.getItems().addAll(necklaces);
        rings.add(l1.loot7());
        ringcb.getItems().addAll(rings);
                
        if (setcharacter==1)
        {
            character.setImage(new Image("mage.gif"));
            editloadout.setVisible(false);
            editloadout.setDisable(true);
            buttonsenable();
        }
        else if (setcharacter==2)
        {
            character.setImage(new Image("swordsman.gif"));
            editloadout.setVisible(false);
            editloadout.setDisable(true);
            buttonsenable();
        }
    }     
    
    @FXML
    void equipclick(ActionEvent event) throws Exception {
        Game g1 = new Game ();
        if(weaponcb.getValue()!= null){g1.wearlootpiece(weaponcb.getValue());}
       if(ringcb.getValue()!= null) {g1.wearlootpiece(ringcb.getValue());}
        if(necklacecb.getValue()!= null){g1.wearlootpiece(necklacecb.getValue());}
        if(helmetcb.getValue()!= null){g1.wearlootpiece(helmetcb.getValue());}
        if(armscb.getValue()!= null){g1.wearlootpiece(armscb.getValue());}
        if(bootscb.getValue()!= null){g1.wearlootpiece(bootscb.getValue());}
        if(chestcb.getValue()!= null){g1.wearlootpiece(chestcb.getValue());}
        damage.setText(""+g1.player.damage);
        critchance.setText(""+g1.player.cchance);
        critdmg.setText(""+g1.player.cdamage);
        armor.setText(""+g1.player.armor);
        health.setText(""+g1.player.health);
        mana.setText(""+g1.player.mana);
        }
  
    
    
     @FXML
    void inventory_nextclick(ActionEvent event) throws Exception {
        levelnum=levelnum+1;
        ahealth=ahealth+Double.parseDouble(health.getText());
        adamage= adamage +Double.parseDouble(damage.getText());
        switch (levelnum) {
            case 2:
                {
                    e1health=e1health+2000;
                    Parent root5= FXMLLoader.load(getClass().getResource("Level2.fxml"));
                    Stage window3 = (Stage) inventory_next.getScene().getWindow();
                    window3.setScene(new Scene(root5, 832, 433));
                    turn=0;
                    break;
                }
            case 3:
                {
                    e1health=e1health+2000;
                    Parent root5= FXMLLoader.load(getClass().getResource("Level3.fxml"));
                    Stage window3 = (Stage) inventory_next.getScene().getWindow();
                    window3.setScene(new Scene(root5, 832, 433));
                    turn=0;
                    break;
                }
            case 4:
                {
                    e1health=e1health+2500;
                    Parent root5= FXMLLoader.load(getClass().getResource("Level4.fxml"));
                    Stage window3 = (Stage) inventory_next.getScene().getWindow();
                    window3.setScene(new Scene(root5, 832, 433));
                    turn=0;
                    break;
                }
            case 5:
                {
                    e1health=e1health+2500;
                    Parent root5= FXMLLoader.load(getClass().getResource("Level5.fxml"));
                    Stage window3 = (Stage) inventory_next.getScene().getWindow();
                    window3.setScene(new Scene(root5, 832, 433));
                    turn=0;
                    break;
                }
            case 6:
                {
                    e1health=e1health+3000;
                    Parent root5= FXMLLoader.load(getClass().getResource("Level6.fxml"));
                    Stage window3 = (Stage) inventory_next.getScene().getWindow();
                    window3.setScene(new Scene(root5, 832, 433));
                    turn=0;
                    break;
                }
            case 7:
                {
                    e1health=e1health+3500;
                    Parent root5= FXMLLoader.load(getClass().getResource("Level7.fxml"));
                    Stage window3 = (Stage) inventory_next.getScene().getWindow();
                    window3.setScene(new Scene(root5, 832, 433));
                    turn=0;
                    break;
                }
            default:
                break;
        }

    }
}







