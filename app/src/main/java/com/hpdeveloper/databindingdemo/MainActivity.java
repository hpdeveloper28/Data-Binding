package com.hpdeveloper.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hpdeveloper.databindingdemo.databinding.ActivityMainBinding;
import com.hpdeveloper.databindingdemo.models.User;

public class MainActivity extends BaseActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding =  DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("Hiren", "Patel");
        activityMainBinding.setUser(user);

    }

    public void onButtonClick(View view) {
        Toast.makeText(this, "Update button clicked", Toast.LENGTH_LONG).show();
        user.setFirstName("HPDEVELOPER");
        user.setLastName("ANDROID");
    }
}
