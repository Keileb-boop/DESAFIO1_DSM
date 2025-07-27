package sv.edu.udb

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pntResultado : AppCompatActivity() {

    lateinit var tvResultadoFinal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pnt_resultado)

        tvResultadoFinal = findViewById(R.id.txtResultado)

        val resultado = intent.getStringExtra("resultado")
        tvResultadoFinal.text= "Resultado : $resultado"
    }
}