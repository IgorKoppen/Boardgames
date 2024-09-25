package com.github.igorkoppen.boardgames

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "boardgames")
data class BoardGame(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val url: String,
    val description: String
)