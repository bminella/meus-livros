package com.mentoria.meuslivros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    var JSON_BOOKS = """
    {
      "id": 84,
      "title": "Frankenstein; Or, The Modern Prometheus",
      "authors": [
        {
          "name": "Shelley, Mary Wollstonecraft",
          "birth_year": 1797,
          "death_year": 1851
        }
      ],
      "translators": [],
      "subjects": [
        "Frankenstein's monster (Fictitious character) -- Fiction",
        "Frankenstein, Victor (Fictitious character) -- Fiction",
        "Gothic fiction",
        "Horror tales",
        "Monsters -- Fiction",
        "Science fiction",
        "Scientists -- Fiction"
      ],
      "bookshelves": [
        "Gothic Fiction",
        "Movie Books",
        "Precursors of Science Fiction",
        "Science Fiction by Women"
      ],
      "languages": [
        "en"
      ],
      "copyright": false,
      "media_type": "Text",
      "formats": {
        "text/plain; charset=utf-8": "https://www.gutenberg.org/files/84/84-0.txt",
        "application/zip": "https://www.gutenberg.org/files/84/84-0.zip",
        "image/jpeg": "https://www.gutenberg.org/cache/epub/84/pg84.cover.medium.jpg",
        "text/html; charset=utf-8": "https://www.gutenberg.org/files/84/84-h.zip",
        "text/html": "https://www.gutenberg.org/ebooks/84.html.images",
        "application/x-mobipocket-ebook": "https://www.gutenberg.org/ebooks/84.kindle.images",
        "application/rdf+xml": "https://www.gutenberg.org/ebooks/84.rdf",
        "application/epub+zip": "https://www.gutenberg.org/ebooks/84.epub.images"
      },
      "download_count": 75355
    }""".trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val book = Gson().fromJson(JSON_BOOKS, Book::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_books)

        recyclerView.adapter = BookAdapter(arrayOf(book))

//        Log.d("App", tt.toString())
    }
}