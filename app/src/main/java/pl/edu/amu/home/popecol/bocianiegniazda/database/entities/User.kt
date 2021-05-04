package pl.edu.amu.home.popecol.bocianiegniazda.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    var userId: Long = 0L,

    @ColumnInfo(name = "permission_type")
    val permissionType: Int = 1,

    @ColumnInfo(name = "login")
    val login: String,

    @ColumnInfo(name = "email")
    val email: String,

    @ColumnInfo(name = "password_hash")
    val password: String
)
