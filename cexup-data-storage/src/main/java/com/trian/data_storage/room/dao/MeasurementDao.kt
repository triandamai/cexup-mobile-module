package com.trian.data_storage.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.trian.data_storage.room.entity.Measurement

@SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
@Dao
interface MeasurementDao {
    @Query("SELECT * FROM tb_measurement")
    fun allCheckUp(): LiveData<List<Measurement?>?>?

    @Query("SELECT * FROM tb_measurement WHERE id_patient = :id_patient")
    fun getLastCheckUpById(id_patient: String?): LiveData<List<Measurement?>?>?

    @Query("SELECT COUNT(id) FROM tb_measurement WHERE type = :type AND  id_patient = :id")
    fun getCount(type: Int, id: String?): Int

    @Query("SELECT * FROM tb_measurement WHERE type = :type AND id_patient = :idpatient")
    fun getHistory(type: Int, idpatient: String?): List<Measurement?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBatch(measurement:List<Measurement>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(measurement:Measurement?)

    @Update
    fun update(measurement: Measurement?)

    @Delete
    fun delete(measurement:Measurement?)
}
