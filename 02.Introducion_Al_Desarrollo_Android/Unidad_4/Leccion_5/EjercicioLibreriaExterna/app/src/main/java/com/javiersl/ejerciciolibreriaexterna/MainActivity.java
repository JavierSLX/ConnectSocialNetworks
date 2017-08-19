package com.javiersl.ejerciciolibreriaexterna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.bluetooth.*;
import android.net.wifi.*;
import android.hardware.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sensor sensor;
        BluetoothManager bluetoothManager;
        WifiManager wifiManager;
    }
}
