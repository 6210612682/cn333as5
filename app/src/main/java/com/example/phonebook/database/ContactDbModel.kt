package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,





) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "A-test-name", "0918812684", false, false, 1, false),
            ContactDbModel(2, "D-test-name", "0923786776", false, false, 2, false),
            ContactDbModel(3, "H-test-name", "0818342749", false, false, 3, false),
            ContactDbModel(4, "L-test-name", "0891225811", false, false, 4, false),
        )
    }
}


