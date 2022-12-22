package com.omk.myapplication.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.omk.myapplication.domain.model.AppDetails

data class Dto(
    @SerializedName("added")
    val added: String,
    @SerializedName("apk_tags")
    val apkTags: List<String>,
    @SerializedName("downloads")
    val downloads: Int,
    @SerializedName("graphic")
    val graphic: String?,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("md5sum")
    val md5sum: String,
    @SerializedName("modified")
    val modified: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("package")
    val packageX: String,
    @SerializedName("pdownloads")
    val pdownloads: Int,
    @SerializedName("rating")
    val rating: Double,
    @SerializedName("size")
    val size: Int,
    @SerializedName("store_id")
    val storeId: Int,
    @SerializedName("store_name")
    val storeName: String,
    @SerializedName("updated")
    val updated: String,
    @SerializedName("uptype")
    val uptype: String,
    @SerializedName("vercode")
    val vercode: Int,
    @SerializedName("vername")
    val vername: String
){
    fun toAppDetails() = AppDetails(
        added = added,
        apkTags = apkTags,
        downloads = downloads,
        graphic = graphic,
        icon = icon,
        id = id,
        md5sum = md5sum,
        modified = modified,
        name = name,
        packageX = packageX,
        pDownloads = pdownloads,
        rating = rating,
        size = size,
        storeId = storeId,
        storeName = storeName,
        updated = updated,
        upType = uptype,
        versionCode = vercode,
        versionName = vername
    )
}