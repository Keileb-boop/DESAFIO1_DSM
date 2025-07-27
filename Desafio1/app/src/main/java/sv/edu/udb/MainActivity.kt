package sv.edu.udb


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var n1: EditText
    lateinit var n2: EditText
    lateinit var btnSumar: Button
    lateinit var btnRestar: Button
    lateinit var btnMultiplicar:Button
    lateinit var  btnDividir:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        n1 = findViewById(R.id.edtN1)
        n2 = findViewById(R.id.edtN2)
        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnRestar)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        btnDividir = findViewById(R.id.btnDividir)







        btnSumar.setOnClickListener {
            val num1 = n1.text.toString().toFloat()
            val num2 = n2.text.toString().toFloat()
            val res = num1 + num2
            if (num1 != null && num2 != null) {
                val res = num1 + num2


                val intent = Intent(this, pntResultado::class.java)
                intent.putExtra("resultado", res.toString())
                startActivity(intent)
            }else {
                    Toast.makeText(this, "Ingresa valores válidos", Toast.LENGTH_SHORT).show()
                }


        }

        btnRestar.setOnClickListener {
            val num1 = n1.text.toString().toFloat()
            val num2 = n2.text.toString().toFloat()
            val res = num1 - num2
            if (num1 != null && num2 != null) {
                val res = num1 - num2


                val intent = Intent(this, pntResultado::class.java)
            intent.putExtra("resultado", res.toString())
            startActivity(intent)
            }else {
                Toast.makeText(this, "Ingresa valores válidos", Toast.LENGTH_SHORT).show()
            }
        }

        btnMultiplicar.setOnClickListener {
            val num1 = n1.text.toString().toFloat()
            val num2 = n2.text.toString().toFloat()
            val res = num1 * num2


            val intent = Intent(this, pntResultado::class.java)
            intent.putExtra("resultado", res.toString())
            startActivity(intent)
        }

        btnDividir.setOnClickListener {
            val num1 = n1.text.toString().toFloat()
            val num2 = n2.text.toString().toFloat()
            val res = num1 / num2

            if (num1 != null && num2 != null) {
                if (num2 != 0f) {
                    val res = num1 / num2


            val intent = Intent(this, pntResultado::class.java)
            intent.putExtra("resultado", res.toString())
            startActivity(intent)
        } else {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Ingresa valores válidos", Toast.LENGTH_SHORT).show()
        }




    }
    }
}