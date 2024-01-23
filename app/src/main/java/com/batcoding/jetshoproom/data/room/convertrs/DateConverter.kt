package com.batcoding.jetshoppingroom.data.room.convertrs

import androidx.room.TypeConverter
import java.util.Date

open class DateConverter{
    @TypeConverter
    fun toDate(date: Long?): Date? {
        return date?.let { Date(it) }
    }

    @TypeConverter
    fun fromDate(date: Date?): Long?{
        return date?.time
    }
}

//class DateConverter {
//
//    @TypeConverter
//    fun toDate(timestamp: Long): java.sql.Date {
//        return java.sql.Date(timestamp)
//    }
//
//    @TypeConverter
//    fun toTimestamp(date: java.sql.Date): Long {
//        return date.time
//    }
//}