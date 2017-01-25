package com.jaxfire.mvp_1;

public class Model {

    Presenter presenter;
    boolean lights;

    public Model(Presenter presenter){
        this.presenter = presenter;
    }

    public void getLights(){
        //toggle lights boolean
        lights = !lights;
        presenter.lightsUpdated(lights);
    }
}
