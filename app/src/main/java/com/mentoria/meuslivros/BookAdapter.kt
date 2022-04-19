package com.mentoria.meuslivros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class BookAdapter(private val bookList: Array<Book>) :
    RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView
        val tvAuthors: TextView
        val tvSubjects: TextView
        val ivBookCover: ImageView
        val btPreview: Button

        init {
            // Define click listener for the ViewHolder's View.
            tvTitle = view.findViewById(R.id.book_item_title)
            tvAuthors = view.findViewById(R.id.book_item_authors)
            tvSubjects = view.findViewById(R.id.book_item_subjects)
            ivBookCover = view.findViewById(R.id.book_item_image)
            btPreview = view.findViewById(R.id.book_item_preview)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.book_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.tvTitle.text = bookList[position].title
        viewHolder.tvAuthors.text = bookList[position].authors.toString()
        viewHolder.tvSubjects.text = bookList[position].subjects.toString()
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = bookList.size
}