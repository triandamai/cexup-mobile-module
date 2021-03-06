package com.trian.data_storage.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_nurse")
data class Nurse(
    @PrimaryKey(autoGenerate = true)
     var id: Int ,
  //@ColumnInfo(name = "name")
 var name: String?,

//@ColumnInfo(name = "email")
 var email: String?,

//@ColumnInfo(name = "gender")
 var gender: String? ,

//@ColumnInfo(name = "phone_number")
 var phoneNumber: String? ,

//@ColumnInfo(name = "type")
 var type: String? ,

//@ColumnInfo(name = "no_type")
 var no_type: String?,

//@ColumnInfo(name = "address")
 var address: String?
 )


