package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    private lateinit var tvName: TextView
    private lateinit var tvNim: TextView
    private lateinit var tvJurusan: TextView
    private lateinit var tvAddress: TextView
    private lateinit var ivProfilePicture: CircleImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivProfilePicture = findViewById(R.id.ivProfilePicture)
        tvName = findViewById(R.id.tvName)
        tvNim = findViewById(R.id.tvNim)
        tvJurusan = findViewById(R.id.tvJurusan)
        tvAddress = findViewById(R.id.tvAddress)

        tvName.text = "Dimas wittangguh laksana"
        tvNim.text = "SSI202203128"
        tvJurusan.text = "Sistem Informasi"
        tvAddress.text = "JL MERANTI NO 204 PERUM TANJUNG ELOK"

        // Jika menggunakan drawable vektor
        ivProfilePicture.setImageResource(R.drawable.profil)
        // Jika menggunakan gambar dari gallery/kamera
        // val bitmap = BitmapFactory.decodeFile("/path/to/image/file.jpg")
        // ivPhoto.setImageBitmap(bitmap)
    }
}