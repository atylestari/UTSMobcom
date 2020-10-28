package id.aty.utsmobcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_plus2 = findViewById(R.id.btn_plus) as Button
        btn_plus2.setOnClickListener {
            Toast.makeText(this, "Plus", Toast.LENGTH_SHORT).show()
        }

    }
}