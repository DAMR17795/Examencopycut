package www.iesmurgi.examencopycut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class SpinnerAnidado : AppCompatActivity() {

    //spinner anidado

    private var miSpinner1: Spinner? = null
    private var miSpinner2: Spinner? = null
    private var miSeleccion : TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anidado)

        miSpinner1 = findViewById(R.id.spinner1)
        miSpinner2 = findViewById(R.id.spinner2)
        miSeleccion = findViewById(R.id.sel)

        val ligas = arrayOf("liga santander", "premier league", "serie a")
        val ligaSantander = arrayOf("real madrid", "barcelona", "celta")
        val premierLeague = arrayOf("city", "united", "chelsea")
        val serieA = SerieA.serieA

        var adaptadorLigas : ArrayAdapter<String>
        var adaptadorLigaSantander : ArrayAdapter<String>
        var adaptadorPremier : ArrayAdapter<String>
        val adaptadorSerieA : ArrayAdapter<SerieA>

        adaptadorLigas =  ArrayAdapter(this, android.R.layout.simple_spinner_item, ligas)
        adaptadorLigaSantander = ArrayAdapter(this, android.R.layout.simple_spinner_item, ligaSantander)
        adaptadorPremier = ArrayAdapter(this, android.R.layout.simple_spinner_item, premierLeague)
        adaptadorSerieA =  ArrayAdapter(this, android.R.layout.simple_spinner_item, serieA)
        miSpinner1?.adapter = adaptadorLigas

        miSpinner1?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                if (miSpinner1?.selectedItem.toString().equals("liga santander")){


                    miSpinner2?.adapter = adaptadorLigaSantander

                }

                if (miSpinner1?.selectedItem.toString().equals("premier league")){


                    miSpinner2?.adapter = adaptadorPremier

                }

                if (miSpinner1?.selectedItem.toString().equals("serie a")){


                    miSpinner2?.adapter = adaptadorSerieA

                }

                miSpinner2?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {


                        miSeleccion?.text = "Has seleccionado el equipo: "+miSpinner2?.selectedItem.toString()+"\n que está en la liga: "+miSpinner1?.selectedItem.toString()


                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }


                }


                miSeleccion?.text = "Has seleccionado el equipo: "+miSpinner2?.selectedItem.toString()+"\n que está en la liga: "+miSpinner1?.selectedItem.toString()


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }



        }
    }
}