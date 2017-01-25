package com.jaxfire.mvp_1;

import android.graphics.Color;

public class PresenterImpl implements LightSwitchPresenter, OnLightsSwitchedListener{

    LightSwitchView lightSwitchView;
    LightUpdater model;

    public PresenterImpl(LightSwitchView theView){
        this.lightSwitchView = theView;
        model = new ModelImpl(this);
    }

    //From the VIEW
    public void buttonClick(){
        model.toggleLights();
    }

    //From the VIEW
    @Override
    public void onDestroy() {
        lightSwitchView = null;
    }

    //From the MODEL
    public void lightsUpdated(boolean b){
        int backGroundColour;
        int textColour;
        String text;
        if (b){
            backGroundColour = Color.WHITE;
            textColour = Color.BLACK;
            text = "Lights On";
        } else{
            backGroundColour = Color.BLACK;
            textColour = Color.WHITE;
            text =  "Lights Off";
        }
        lightSwitchView.setBackgroundColour(backGroundColour);
        lightSwitchView.setTextColour(textColour);
        lightSwitchView.setText(text);
    }
}
