package heda.akbas.dortislemprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var textView1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view : View){
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        textView1 = findViewById(R.id.textView1)

        var sayi1= editText1.text.toString().toIntOrNull()
        var sayi2= editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null){
            textView1.text="Sayı girmeyi unutmayınız"
        }else{
            var sonuc = sayi1+ sayi2
            textView1.text="Sonuç: ${sonuc}"
        }


    }
    fun cikar(view : View){
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        textView1 = findViewById(R.id.textView1)

        var sayi1= editText1.text.toString().toIntOrNull()
        var sayi2= editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null){
            textView1.text="Sayı girmeyi unutmayınız"
        }else{
            var sonuc = sayi1- sayi2
            textView1.text="Sonuç: ${sonuc}"
        }

    }
    fun carp(view : View){
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        textView1 = findViewById(R.id.textView1)

        var sayi1= editText1.text.toString().toIntOrNull()
        var sayi2= editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null){
            textView1.text="Sayı girmeyi unutmayınız"
        }else{
            var sonuc = sayi1* sayi2
            textView1.text="Sonuç: ${sonuc}"
        }

    }
    fun bol(view : View){
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        textView1 = findViewById(R.id.textView1)

        var sayi1= editText1.text.toString().toDoubleOrNull()
        var sayi2= editText2.text.toString().toDoubleOrNull()

        if (sayi1==null || sayi2==null){
            textView1.text="Sayı girmeyi unutmayınız"
        }else{
            var sonuc = sayi1/ sayi2
            textView1.text="Sonuç: ${sonuc}"
        }

    }


}


