package com.jaxfire.mvp_1;

import android.graphics.Color;

public class Presenter {

    MainActivity main;
    Model model;

    public Presenter(MainActivity main){
        this.main = main;
        model = new Model(this);
    }

    public void buttonClick(){
        model.getLights();
    }

    public void lightsUpdated(boolean b){
        if (b){
            main.setBackgroundColour(Color.WHITE);
            main.setTextColour(Color.BLACK);
            main.setText("Lights On");
        } else{
            main.setBackgroundColour(Color.BLACK);
            main.setTextColour(Color.WHITE);
            main.setText("Lights Off");
        }
    }
}
