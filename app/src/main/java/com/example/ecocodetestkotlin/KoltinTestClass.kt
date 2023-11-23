package com.example.ecocodetestkotlin

import android.bluetooth.BluetoothAdapter; // Issue {Optimized API: Bluetooth Low-Energy}
import android.os.Bundle
import android.os.PersistableBundle
import android.service.voice.VoiceInteractionSession
import androidx.appcompat.app.AppCompatActivity

class KoltinTestClass: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        var voiceSession = VoiceInteractionSession(this)
        voiceSession.setKeepAwake(true) // Issue {Idleness : Keep Voice Awake}

    }
}