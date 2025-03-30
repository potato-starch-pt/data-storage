package org.example

class ContactsAdapter(private val contacts: List<Contact>, private val onNoteClick: (Contact) -> Unit) :
    RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {
    // Реализация адаптера
}
