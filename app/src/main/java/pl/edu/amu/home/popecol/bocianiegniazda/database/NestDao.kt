package pl.edu.amu.home.popecol.bocianiegniazda.database

import androidx.room.*
import pl.edu.amu.home.popecol.bocianiegniazda.database.entities.Nest

@Dao
interface NestDao {

    @Insert
    suspend fun insert(nest: Nest)

    @Update
    suspend fun update(nest: Nest)

    @Query("SELECT * FROM nests_table")
    suspend fun getAllNests()

    @Query("SELECT * FROM nests_table WHERE nestId = :nestId")
    suspend fun getNest(nestId: Int)

    @Query("DELETE FROM nests_table")
    suspend fun clear()

    @Delete
    suspend fun delete(nest: Nest)
}