package br.com.mindfit.mindfit

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.switchmaterial.SwitchMaterial
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var switchNotifications: SwitchMaterial
    private lateinit var switchDarkMode: SwitchMaterial
    private lateinit var tvVersion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        initViews()
        setupToolbar()
        setupClickListeners()
        loadMockSettings()
    }

    private fun initViews() {
        toolbar = findViewById(R.id.toolbar)
        switchNotifications = findViewById(R.id.switchNotifications)
        switchDarkMode = findViewById(R.id.switchDarkMode)
        tvVersion = findViewById(R.id.tvVersion)
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Configurações"
    }

    private fun setupClickListeners() {
        switchNotifications.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(
                this,
                "Notificações ${if (isChecked) "ativadas" else "desativadas"}",
                Toast.LENGTH_SHORT
            ).show()
        }

        switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(
                this,
                "Tema escuro ${if (isChecked) "ativado" else "desativado"}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun loadMockSettings() {
        switchNotifications.isChecked = true
        switchDarkMode.isChecked = false
        tvVersion.text = "Versão 1.0.0"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}