package com.test.mylocationtracking.interfaces

import android.location.Location
import kotlinx.coroutines.flow.Flow

interface MyLocationClient {
    fun getLocationUpdates(interval: Long): Flow<Location>

    class AnyException(message: String): Exception()
}