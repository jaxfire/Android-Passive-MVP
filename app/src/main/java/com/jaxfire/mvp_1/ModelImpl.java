package com.jaxfire.mvp_1;

public class ModelImpl implements LightUpdater{

    OnLightsSwitchedListener presenter;
    boolean lights;

    public ModelImpl(OnLightsSwitchedListener presenter){
        this.presenter = presenter;
    }

    public void toggleLights(){
        //toggle lights boolean
        lights = !lights;
        presenter.lightsUpdated(lights);
    }
}
