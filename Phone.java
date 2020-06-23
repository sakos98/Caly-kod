package com.company;
import  com.company.Application;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Phone extends Device {
    public Phone(String producer, String model,int i) {
        super(model, producer);
        this.owner = owner;
    }


    public Phone(String xiaomi, String mi9se, int i, Human me) {
        super("xiaomi", "mi9se");
    }

    public void installAnApp(String name, String appName) {
        installAnApp(appName, "latest");
    }

    public void freeApps() {
        System.out.println("Free app here.");
    }
    public void alphabetSort(){
        System.out.println();
    }

    public void prizeSort(){
        System.out.println();
    }
}


