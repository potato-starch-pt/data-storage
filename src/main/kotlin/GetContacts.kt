package org.example

import android.content.ContentResolver
import android.database.Cursor
import android.provider.ContactsContract

fun getContacts(contentResolver: ContentResolver): List<Contact> {
    val contacts = mutableListOf<Contact>()
    val cursor: Cursor? = contentResolver.query(
        ContactsContract.Contacts.CONTENT_URI,
        null, null, null, null
    )

    cursor?.use {
        while (it.moveToNext()) {
            val id = it.getString(it.getColumnIndex(ContactsContract.Contacts._ID))
            val name = it.getString(it.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME))
            contacts.add(Contact(id, name))
        }
    }
    return contacts
}
