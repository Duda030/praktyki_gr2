package pl.edu.amu.home.popecol.bocianiegniazda.database

import androidx.room.*
import pl.edu.amu.home.popecol.bocianiegniazda.database.entities.User

@Dao
interface UserDao {

    @Insert
    suspend fun insert(user: User)

    @Update
    suspend fun update(user: User)

    @Query("SELECT * FROM users_table")
    suspend fun getAllUsers()

    @Query("SELECT * FROM users_table WHERE userId = :userId")
    suspend fun getUser(userId: Int)

    @Query("DELETE FROM users_table")
    suspend fun clear()

    @Delete
    suspend fun delete(user: User)
}