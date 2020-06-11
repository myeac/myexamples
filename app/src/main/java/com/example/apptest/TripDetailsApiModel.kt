package com.example.apptest

data class TripDetailsApiModel(
    val id: Int? = null,
    val beginWork: String? = null,
    val driverName: String? = null,
    val driverFederalRegistration: String? = null,
    val region: String? = null,
    val state: String? = null,
    val city: String? = null,
    val date: String? = null,
    val startTime: String? = null,
    val origin: String? = null,
    val destination: String? = null,
    val licensePlate: String? = null,
    val type: Int? = null,
    val hasDocument: Boolean? = false,
    val hasMovableItems: Boolean? = false,
    val received: Boolean? = false,
    val carFound: Boolean? = false,
    val receptorName: String? = null,
    val incidentDescription: String? = null,
    val estimatedTime: Int? = null,
    val finishTime: String? = null,
    val endWork: String? = null,
    val originLatitude: String? = null,
    val originLongitude: String? = null,
    val destinationLatitude: String? = null,
    val destinationLongitude: String? = null,
    val problem: String? = null
)

