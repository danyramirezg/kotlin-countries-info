package com.dany.country_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colombia = colombiaId
        val usa = usaId

        // Register the views to receive the events OnClickLister
        colombia.setOnClickListener(this)
        usa.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id){

            // Remember!! register them first in (onCreate function), so I can use them
            colombiaId.id -> {
                //Toast.makeText(this, "Colombia", Toast.LENGTH_LONG).show()  --> I can use this to make a test, before implementation

                var colombiaIntent = Intent(this, DetailsActivity::class.java)
                colombiaIntent.putExtra("country", "colombia")
                startActivity(colombiaIntent)
            }
            usaId.id -> {
                var usaIntent = Intent(this, DetailsActivity::class.java)
                usaIntent.putExtra("country", "usa")
                startActivity(usaIntent)
            }
        }
    }
}