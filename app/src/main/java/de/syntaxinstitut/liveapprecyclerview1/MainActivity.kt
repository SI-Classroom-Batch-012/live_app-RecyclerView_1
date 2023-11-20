package de.syntaxinstitut.liveapprecyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import de.syntaxinstitut.liveapprecyclerview1.adapter.Textadapter
import de.syntaxinstitut.liveapprecyclerview1.data.Datasource
import de.syntaxinstitut.liveapprecyclerview1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Inflate binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Lade Daten und erstelle den Adapter
        val data = Datasource().loadData()
        val adapter = Textadapter(data)
        binding.textRV.adapter = adapter
    }
}