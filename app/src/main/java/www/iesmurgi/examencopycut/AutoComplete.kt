package www.iesmurgi.examencopycut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView

class AutoComplete : AppCompatActivity() {

    //autocomplete

    private var miAuto: AutoCompleteTextView ?= null
    private var miSel : TextView ? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.autocomplete)

        miAuto = findViewById(R.id.auto)
        miSel = findViewById(R.id.seleccion)


        var equipos = SerieA.serieA

        var adaptadorEquipos : ArrayAdapter<SerieA>

        adaptadorEquipos =  ArrayAdapter(this, android.R.layout.simple_spinner_item, equipos)

        miAuto?.setAdapter(adaptadorEquipos)

        miAuto?.setOnItemClickListener { parent, view, position, id ->

            miSel?.text = parent.adapter.getItem(position).toString()

        }



    }
}