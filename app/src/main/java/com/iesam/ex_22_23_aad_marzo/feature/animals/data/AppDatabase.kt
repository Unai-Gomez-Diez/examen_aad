package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalDao
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalEntity
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalTypeConverter

@Database(

    entities = [AnimalEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(AnimalTypeConverter::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun animalDao(): AnimalDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).addTypeConverter(AnimalTypeConverter()).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
