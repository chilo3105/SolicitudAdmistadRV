package com.example.solicitudadmistadrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solicitudadmistadrv.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeSolicitudData: Array<JSONObject> = arrayOf(
            JSONObject("{\"name\": \"Sofi Alejandre\", \"tiempo\": \"23 h\", \"amigosComun\": \"10 amigos en comun\"}"),
            JSONObject("{\"name\": \"Isidro Rodriguez\", \"tiempo\": \"1 sem\", \"amigosComun\": \"80 amigos en comun\"}"),
            JSONObject("{\"name\": \"Orlando Ochoa\", \"tiempo\": \"6 sem\", \"amigosComun\": \"90 amigos en comun\"}"),
            JSONObject("{\"name\": \"Francisco Cortez\", \"tiempo\": \"22 h\", \"amigosComun\": \"15 amigos en comun\"}"),
            JSONObject("{\"name\": \"Jose Carlos Munguia\", \"tiempo\": \"2 h\", \"amigosComun\": \"23 amigos en comun\"}"),
            JSONObject("{\"name\": \"Irving Escutia\", \"tiempo\": \"1 h\", \"amigosComun\": \"78 amigos en comun\"}"),
            JSONObject("{\"name\": \"Ian Corona\", \"tiempo\": \"2 h\", \"amigosComun\": \"99 amigos en comun\"}"),
            JSONObject("{\"name\": \"Victor Sanchez\", \"tiempo\": \"4 sem\", \"amigosComun\": \"12 amigos en comun\"}"),
            JSONObject("{\"name\": \"Luis Domiguez\", \"tiempo\": \"1 años\", \"amigosComun\": \"24 amigos en comun\"}"),
            JSONObject("{\"name\": \"Jesus Aguirre\", \"tiempo\": \"2 años\", \"amigosComun\": \"45 amigos en comun\"}"),
            JSONObject("{\"name\": \"Jorge Fuerte\", \"tiempo\": \"32 sem\", \"amigosComun\": \"75 amigos en comun\"}"),
            JSONObject("{\"name\": \"Alejandro Ruiz\", \"tiempo\": \"44 sem\", \"amigosComun\": \"65 amigos en comun\"}"),
            JSONObject("{\"name\": \"Raquel Rodriguez\", \"tiempo\": \"3 h\", \"amigosComun\": \"86 amigos en comun\"}"),
            JSONObject("{\"name\": \"Iker Casillas\", \"tiempo\": \"1 d\", \"amigosComun\": \"74 amigos en comun\"}"),
            JSONObject("{\"name\": \"Cristiano Ronaldo\", \"tiempo\": \"4 d\", \"amigosComun\": \"71 amigos en comun\"}"),
            JSONObject("{\"name\": \"Guillermo Ochoa\", \"tiempo\": \"3 sem\", \"amigosComun\": \"82 amigos en comun\"}"),
            JSONObject("{\"name\": \"Irving Lozano\", \"tiempo\": \"5 d\", \"amigosComun\": \"13 amigos en comun\"}"),
        )

        binding.rvSolicitudEntries.adapter = MainAdapter(fakeSolicitudData)
    }
}