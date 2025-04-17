package com.example.ktormirea_mobileapp

import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("login") val username: String,
    @SerializedName("password") val password: String,
    @SerializedName("email") val email: String
)

data class LoginRequest(
    @SerializedName("login") val username: String,
    @SerializedName("password") val password: String
)

data class AuthResponse(
    @SerializedName("message") val message: String,
    @SerializedName("token") val token: String? = null
)