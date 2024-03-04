package com.example.ecocodetestkotlin

import android.location.Location  // Issue {Optimized API: Fused Location}
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class FusedLocationIssueCheck: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        var location: Location?
    }
}