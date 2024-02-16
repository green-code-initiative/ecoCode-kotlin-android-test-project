package com.example.ecocodetestkotlin

import android.bluetooth.BluetoothAdapter // ISSUE {Optimized API: Bluetooth Low-Energy}
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class BLEIssueCheck: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        var bluetoothAdapter: BluetoothAdapter?
    }
}