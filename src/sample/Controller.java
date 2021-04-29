package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller {

    public Label hpbar;
    public Label manabar;
    public Label staminabar;
    public Label enhpbar;
    @FXML
    Button knight;
    @FXML
    Button barbarian;
    @FXML
    Button priest;
    @FXML
    Button shaman;
    @FXML
    Button mage;
    @FXML
    Button hunter;
    @FXML
    Button Start;

    public String klasunia;
    public static int maxhp;
    public static int hp;
    public static int maxsta;
    public static int sta;
    public static int attack;
    public static int maxmana;
    public static int mana;
    public static int ap;
    public static int def;
    public static int magicres;
    public static int speed;
    public static int knowledge;
    public static int critrate;
    public static double critdmg;
    public static int lvl=1;
    public static int maxexp=100;
    public static int exp=0;
    
    public void knight(ActionEvent event){
        maxhp = 100;
        hp = maxhp;
        maxsta = 100;
        sta = maxsta;
        attack = 10;
        maxmana = 100;
        mana = maxmana;
        ap = 5;
        def = 0;
        magicres = 0;
        speed = 10;
        knowledge = 10;
        critrate = 10;
        critdmg = 1.5;
        klasunia="knight";
        System.out.println("Twoja klasa to knight");
    }

    @FXML
    public void barbarian(ActionEvent event){
        maxhp = 125;
        hp = maxhp;
        maxsta = 100;
        sta = maxsta;
        attack = 13;
        maxmana = 70;
        mana = maxmana;
        ap = 5;
        def = 2;
        magicres = 0;
        speed = 8;
        knowledge = 5;
        critrate = 10;
        critdmg = 1.65;
        System.out.println("Twoja klasa to barbarian");
    }

    @FXML
    public void hunter(ActionEvent event){
        maxhp = 70;
        hp = maxhp;
        maxsta = 110;
        sta = maxsta;
        attack = 14;
        maxmana = 80;
        mana = maxmana;
        ap = 5;
        def = 0;
        magicres = 0;
        speed = 12;
        knowledge = 5;
        critrate = 12;
        critdmg = 1.75;
        System.out.println("Twoja klasa to hunter");
    }

    @FXML
    public void mage(ActionEvent event){
        maxhp = 90;
        hp = maxhp;
        maxsta = 90;
        sta = maxsta;
        attack = 5;
        maxmana = 120;
        mana = maxmana;
        ap = 10;
        def = 0;
        magicres = 0;
        speed = 8;
        knowledge = 12;
        critrate = 10;
        critdmg = 1.5;
        System.out.println("Twoja klasa to mage");
    }

    @FXML
    public void shaman(ActionEvent event){
        maxhp = 80;
        hp = maxhp;
        maxsta = 100;
        sta = maxsta;
        attack = 1;
        maxmana = 100;
        mana = maxmana;
        ap = 14;
        def = 0;
        magicres = 0;
        speed = 10;
        knowledge = 15;
        critrate = 10;
        critdmg = 1.5;
        System.out.println("Twoja klasa to shaman");
    }

    @FXML
    public void priest(ActionEvent event){
        maxhp = 60;
        hp = maxhp;
        maxsta = 80;
        sta = maxsta;
        attack = 5;
        maxmana = 145;
        mana = maxmana;
        ap = 5;
        def = 0;
        magicres = 2;
        speed = 8;
        knowledge = 18;
        critrate = 10;
        critdmg = 1.5;
        System.out.println("Twoja klasa to priest");
    }

    @FXML
    public void Start(ActionEvent event) throws IOException {
        Stage DrugieOkno = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("World.FXML"));
        DrugieOkno.setTitle("World");
        DrugieOkno.setScene(new Scene(root, 1900, 1000));
        DrugieOkno.initModality(Modality.APPLICATION_MODAL);
        DrugieOkno.show();
    }

    @FXML
    public Label fxmaxmana;
    @FXML
    public Label fxatak;
    @FXML
    public Label fxmagic;
    @FXML
    public Label fxobrona;
    @FXML
    public Label fxmresist;
    @FXML
    public Label fxspeed;
    @FXML
    public Label fxknowledge;
    @FXML
    public Label fxrate;
    @FXML
    public Label fxdmg;
    @FXML
    public Label fxmaxhp;

    @FXML
    Button stats;

    @FXML
    Button lok1;

    @FXML
    Button menu;

    @FXML
    public void stats(ActionEvent event){
        fxmaxhp.setText(String.valueOf(maxhp));
        fxmaxmana.setText(String.valueOf(maxmana));
        fxatak.setText(String.valueOf(attack));
        fxmagic.setText(String.valueOf(ap));
        fxobrona.setText(String.valueOf(def));
        fxmresist.setText(String.valueOf(magicres));
        fxspeed.setText(String.valueOf(speed));
        fxknowledge.setText(String.valueOf(knowledge));
        fxrate.setText(String.valueOf(critrate));
        fxdmg.setText(String.valueOf(critdmg));
    }

    @FXML
    public void menu(ActionEvent event) throws IOException {
        Stage MenuOkno = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("postac.FXML"));
        MenuOkno.setTitle("World");
        MenuOkno.setScene(new Scene(root, 1000,1000));
        MenuOkno.initModality(Modality.APPLICATION_MODAL);
        MenuOkno.showAndWait();
    }

    public static int enmaxhp;
    public static int enhp;
    public static int enattack;
    public static int enap;
    public static int endef;
    public static int enmagicres;
    public static int enspeed;
    public static int enexp;
    public static int dmg;
    public static int mdmg;
    public static int fulldmg;
    public static int stadec;
    public static int manadec;
    public static int obr;
    public static int crithit;

    @FXML
    public void lok1(ActionEvent event) throws IOException {
        Stage Lokacja = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Lokacja.FXML"));
        Lokacja.setTitle("World");
        Lokacja.setScene(new Scene(root, 1000,600));
        Lokacja.initModality(Modality.APPLICATION_MODAL);
        enmaxhp=150;
        enhp=enmaxhp;
        enattack=8;
        enap=0;
        endef=0;
        enmagicres=0;
        enspeed=9;
        enexp=20;
        Lokacja.show();
        hpbar.setText(String.valueOf(hp)+"/"+String.valueOf(maxhp));
        manabar.setText(String.valueOf(mana)+"/"+String.valueOf(maxmana));
        staminabar.setText(String.valueOf(sta)+"/"+String.valueOf(maxsta));
        enhpbar.setText(String.valueOf(enhp)+"/"+String.valueOf(enmaxhp));
    }

    public void hit(ActionEvent event) {
        dmg=attack;
        stadec=0;
        manadec=0;
    }

    public void slash(ActionEvent event) {
        dmg=attack+5;
        stadec=10;
        manadec=0;
    }

    public void datt(ActionEvent event) {
        dmg=attack+attack;
        stadec=30;
        manadec=0;
    }

    public void gimp(ActionEvent event) {
        dmg=attack+10;
        stadec=40;
        manadec=0;
    }

    public void tsla(ActionEvent event) {
        dmg=(attack+5)*3;
        stadec=80;
        manadec=0;
    }

    public void eball(ActionEvent event) {
        mdmg=ap;
        stadec=0;
        manadec=0;
    }

    public void fball(ActionEvent event) {
        mdmg=ap+10;
        stadec=0;
        manadec=15;
    }

    public void tbolt(ActionEvent event) {
        mdmg=ap*3;
        stadec=0;
        manadec=40;
    }

    public void aspe(ActionEvent event) {
        mdmg=ap+knowledge;
        stadec=0;
        manadec=40;
    }

    public void icec(ActionEvent event) {
        mdmg=(ap+5)*2;
        stadec=0;
        manadec=70;
    }

    public void levelowanie(){
        if(exp==maxexp){
            lvl=lvl+1;
            exp=0;
            maxexp=maxexp+50;
        }
    }

    public void walka(){
            if (speed >= enspeed) {
                if(stadec<=sta && manadec<=mana) {
                    fulldmg = dmg - endef + mdmg - enmagicres;
                    obr = enattack - def + enap - magicres;
                    Random rand = new Random();
                    crithit = rand.nextInt(99);
                    if (crithit-1<=critrate){
                        fulldmg= (int) (fulldmg*critdmg);
                    }
                    enhp = enhp - fulldmg;
                    enhpbar.setText(enhp+"/"+enmaxhp);
                    if(enhp>0) {
                        hp = hp - obr;
                        hpbar.setText(String.valueOf(hp)+"//"+String.valueOf(maxhp));
                    }
                    else{
                        System.out.println("Wróg nie żyje");
                    }
                    sta=sta-stadec;
                    mana=mana-manadec;
                    staminabar.setText(String.valueOf(sta)+"/"+String.valueOf(maxsta));
                    manabar.setText(String.valueOf(mana)+"/"+String.valueOf(maxmana));
                    dmg=0;
                    mdmg=0;
                    fulldmg=0;
                    obr=0;
                }
                else{
                    System.out.println("Nie masz siły");
                }
            }
            else{
                if(stadec<=sta && manadec<=mana) {
                    fulldmg = dmg - endef + mdmg - enmagicres;
                    obr = enattack - def + enap - magicres;
                    Random rand = new Random();
                    crithit = rand.nextInt(99);
                    if (crithit-1<=critrate){
                        fulldmg= (int) (fulldmg*critdmg);
                    }
                    hp = hp - obr;
                    hpbar.setText(String.valueOf(hp)+"/"+String.valueOf(maxhp));
                    if(hp>0) {
                        enhp = enhp - fulldmg;
                        enhpbar.setText(String.valueOf(enhp)+"/"+String.valueOf(enmaxhp));
                    }
                    else{
                        System.out.println("Nie żyjesz");
                    }
                    sta=sta-stadec;
                    mana=mana-manadec;
                    staminabar.setText(String.valueOf(sta)+"/"+String.valueOf(maxsta));
                    manabar.setText(String.valueOf(mana)+"/"+String.valueOf(maxmana));
                    dmg=0;
                    mdmg=0;
                    fulldmg=0;
                    obr=0;
                }
                else{
                    System.out.println("Nie masz siły");
                }
            }
    }

    public void TurnEnd(ActionEvent event) {
        if (hp>0 && enhp>0) {
            walka();
        }
        else{
            System.out.println("Nie można nawiązać walki");
            if(hp>0 && enhp<=0) {
                exp = exp + enexp;
                levelowanie();
            }
            else{
                Platform.exit();
            }
        }
    }
}