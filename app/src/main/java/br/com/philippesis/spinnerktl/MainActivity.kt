package br.com.philippesis.spinnerktl

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtSelectedOption = findViewById<TextView>(R.id.txtSelectedOption)
        val spnOptions = findViewById<Spinner>(R.id.spnOptions)

        val languages = arrayOf("Kotlin", "Java", "C++", "Dart")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
        spnOptions.adapter = arrayAdapter

        spnOptions.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                txtSelectedOption.setText("Selecionado: " + languages[position])
            }

        }

    }
}