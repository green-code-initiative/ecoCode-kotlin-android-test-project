package com.example.ecocodetestkotlin

import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.BluetoothLeAdvertiser // GOOD_PRACTICE {Optimized API: Bluetooth Low-Energy}
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class BLEGoodPracticeCheck: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        var bluetoothAdapter: BluetoothAdapter?
        val advertizer: BluetoothLeAdvertiser?
    }
}