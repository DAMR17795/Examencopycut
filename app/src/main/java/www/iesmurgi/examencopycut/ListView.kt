package www.iesmurgi.examencopycut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView

class ListView : AppCompatActivity() {

    ///listview

    private var miLista: ListView? = null
    private var equipo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista)

        miLista = findViewById(R.id.listaEquipos)
        equipo = findViewById(R.id.equipo)

        val serieA = SerieA.serieA

        val adaptadorSerieA: ArrayAdapter<SerieA>
        adaptadorSerieA = ArrayAdapter(this, android.R.layout.simple_spinner_item, serieA)
        miLista?.adapter = adaptadorSerieA

        miLista?.setOnItemClickListener { parent, view, position, id ->

            equipo?.text =parent.adapter.getItem(position).toString()

        }


    }
}