package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
class NameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false).apply {
            val display = findViewById<TextView>(R.id.displayTextView)
            val typeText = findViewById<TextView>(R.id.nameEditText)
            findViewById<Button>(R.id.changeButton).setOnClickListener {
                display.text = "Hello + ${typeText.text}"
            }
        }
    }
}