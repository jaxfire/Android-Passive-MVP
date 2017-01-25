package com.jaxfire.mvp_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LightSwitchActivity extends AppCompatActivity implements View.OnClickListener, LightSwitchView{

    LightSwitchPresenter presenter;

    LinearLayout layout;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DI could be used here
        presenter = new PresenterImpl(this);

        layout = (LinearLayout) findViewById(R.id.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    public void setBackgroundColour(int colour){
        layout.setBackgroundColor(colour);
    }

    public void setText(String text) {
        textView.setText(text);
    }

    public void setTextColour(int colour){
        textView.setTextColor(colour);
    }

    @Override
    public void onClick(View v) {
        presenter.buttonClick();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}