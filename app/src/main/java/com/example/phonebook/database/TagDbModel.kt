package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hex") val hex: String,
    @ColumnInfo(name = "name") val name: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, "#fafafa","Friend"),
            TagDbModel(2, "#4af207","Home"),
            TagDbModel(3, "#1b07f2","Work"),
            TagDbModel(4, "#f20f07","Emergency")
        )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}
