package edu.utep.toolmanagement;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class check extends NavigationClass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
    }
    public void onCheckInBtn(View v)
    {
        Button checkButt = (Button) findViewById(R.id.inout);
        if(checkButt.getText().equals("Check out")){
            checkButt.setText("Check in");
        }
        else{
            checkButt.setText("Check out");
        }
    }

}
