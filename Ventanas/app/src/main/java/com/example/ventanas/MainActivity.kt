package com.example.ventanas

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_option_alta -> {
                openFormActivity(FormType.ALTA)
                true
            }
            R.id.menu_option_baja -> {
                openFormActivity(FormType.BAJA)
                true
            }
            R.id.menu_option_cambio -> {
                openFormActivity(FormType.CAMBIO)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openFormActivity(formType: FormType) {
        val intent = Intent(this, FormActivity::class.java)
        intent.putExtra("formType", formType)
        startActivity(intent)
    }
}
