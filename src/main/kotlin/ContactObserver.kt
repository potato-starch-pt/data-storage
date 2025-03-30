package org.example

import android.database.ContentObserver
import android.net.Uri
import android.os.Handler

class ContactsObserver(handler: Handler, private val contentResolver: ContentResolver) : ContentObserver(handler) {
    override fun onChange(selfChange: Boolean) {
        super.onChange(selfChange)
        // Обновите базу данных Room при изменении контактов
        updateRoomDatabase()
    }

    private fun updateRoomDatabase() {
        // Логика для обновления базы данных Room
    }
}
