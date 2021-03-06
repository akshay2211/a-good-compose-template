package io.ak1.template.data.local

import androidx.paging.DataSource
import androidx.room.*
import io.ak1.template.models.User

/**
 * Created by akshay on 27/10/21
 * https://ak1.io
 */

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}

@Dao
interface UserDao {
    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun getTemplate(): DataSource.Factory<Int, User>

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun getTemplateSimple(): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(images: List<User>)

    @Query("DELETE FROM user_table")
    suspend fun deleteTable()

}