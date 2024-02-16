package com.example.ecocodetestkotlin

import android.location.Location
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationListener

class FusedLocationIssueCheck: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        var location: Location?
        val locationListener: LocationListener?
        var client : FusedLocationProviderClient?
    }
}