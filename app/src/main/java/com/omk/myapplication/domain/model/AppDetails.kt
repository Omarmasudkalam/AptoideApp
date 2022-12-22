package com.omk.myapplication.domain.model

data class AppDetails(

    val added: String,

    val apkTags: List<String>,

    val downloads: Int,

    val graphic: String?,

    val icon: String,

    val id: Int,

    val md5sum: String,

    val modified: String,

    val name: String,

    val packageX: String,

    val pDownloads: Int,

    val rating: Double,

    val size: Int,

    val storeId: Int,

    val storeName: String,

    val updated: String,

    val upType: String,

    val versionCode: Int,

    val versionName: String
)