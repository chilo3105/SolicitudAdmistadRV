package com.example.solicitudadmistadrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.solicitudadmistadrv.databinding.ItemSolicitudBinding
import org.json.JSONObject

class MainAdapter(private val solicitudes: Array<JSONObject>):RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemSolicitudBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(solicitudes[position])
    }

    override fun getItemCount(): Int {
        return solicitudes.size
    }

    class MainHolder(val binding: ItemSolicitudBinding): RecyclerView.ViewHolder(binding.root) {
        fun render(solicitud: JSONObject){
            binding.tvName.setText(solicitud.getString("name"))
            binding.tvTiempo.setText(solicitud.getString("tiempo"))
            binding.tvAmigosComun.setText(solicitud.getString("amigosComun"))
            binding.ivAvatar.setImageResource(R.drawable.va_person)
            binding.ivPerson1.setImageResource(R.drawable.va_person)
            binding.ivPerson2.setImageResource(R.drawable.va_person)
        }
    }

}