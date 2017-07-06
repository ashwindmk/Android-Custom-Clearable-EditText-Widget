package com.example.ashwin.customedittextwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ashwin.customedittextwidget.widgets.ClearableEditText;

public class MainActivity extends AppCompatActivity {

    private ClearableEditText mUsernameClearableEditText, mPasswordClearableEditText;
    private Button mSaveButton;
    private TextView mSaveTextView;
    private String mSaveText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mUsernameClearableEditText = (ClearableEditText) findViewById(R.id.username_clearableedittext);

        mPasswordClearableEditText = (ClearableEditText) findViewById(R.id.password_clearableedittext);
        
        mSaveTextView = (TextView) findViewById(R.id.save_textview);

        mSaveButton = (Button) findViewById(R.id.save_button);
        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSaveText = mUsernameClearableEditText.getText();
                mSaveText += " : ";
                mSaveText += mPasswordClearableEditText.getText();
                mSaveTextView.setText(mSaveText);
            }
        });
    }
}
