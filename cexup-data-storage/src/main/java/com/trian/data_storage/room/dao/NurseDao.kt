package com.trian.data_storage.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.trian.data_storage.room.entity.Nurse

@SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
@Dao
interface NurseDao {
    @Query("SELECT * FROM tb_nurse")
    fun allNurse(): LiveData<List<Nurse?>?>?

    @Insert
    fun insert(nurse:Nurse?)

    @Update
    fun update(nurse: Nurse?)

    @Delete
    fun delete(nurse: Nurse?)
}
