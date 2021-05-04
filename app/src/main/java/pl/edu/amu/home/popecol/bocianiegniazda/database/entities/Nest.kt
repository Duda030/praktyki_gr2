package pl.edu.amu.home.popecol.bocianiegniazda.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "nests_table")
data class Nest(
    @PrimaryKey(autoGenerate = true)
    val nestId: Long = 0L,

    @ColumnInfo(name = "region")
    val permissionType: String,

    @ColumnInfo(name = "voivodeship")
    val province: String,

    @ColumnInfo(name = "district")
    val district: String,

    @ColumnInfo(name = "county")
    val county: String,

    @ColumnInfo(name = "town")
    val town: String,

    @ColumnInfo(name = "address")
    val address: String,

    @ColumnInfo(name = "longitude")
    val longitude: String,

    @ColumnInfo(name = "latitude")
    val latitude: String,

    @ColumnInfo(name = "is_nesting_platform")
    val isNestingPlatform: Boolean,

    @ColumnInfo(name = "structure_type")
    val structureType: Int
)
