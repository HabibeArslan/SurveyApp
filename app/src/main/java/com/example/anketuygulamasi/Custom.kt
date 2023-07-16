package com.example.anketuygulamasi


import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import kotlinx.parcelize.Parcelize


@Parcelize
data class Info(
    val adSoyad: String,
    val email: String,
    val phone: String,
    val sektor: String,
    val meslek: String,
    val uzmanlikAlani: String
) : Parcelable