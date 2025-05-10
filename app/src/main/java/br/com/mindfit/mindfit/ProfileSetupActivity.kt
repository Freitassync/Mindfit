package br.com.mindfit.mindfit

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import br.com.mindfit.mindfit.R
import com.google.android.material.chip.ChipGroup
import com.google.android.material.textfield.TextInputLayout

class ProfileSetupActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var ivProfile: ImageView
    private lateinit var tilName: TextInputLayout
    private lateinit var tilAge: TextInputLayout
    private lateinit var tilWeight: TextInputLayout
    private lateinit var tilHeight: TextInputLayout
    private lateinit var chipGroupGoals: ChipGroup
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_setup)

        initViews()
        setupToolbar()
        setupClickListeners()
    }

    private fun initViews() {
        toolbar = findViewById(R.id.toolbar)
        ivProfile = findViewById(R.id.ivProfile)
        tilName = findViewById(R.id.tilName)
        tilAge = findViewById(R.id.tilAge)
        tilWeight = findViewById(R.id.tilWeight)
        tilHeight = findViewById(R.id.tilHeight)
        chipGroupGoals = findViewById(R.id.chipGroupGoals)
        btnSave = findViewById(R.id.btnSave)
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Configurar Perfil"
    }

    private fun setupClickListeners() {
        ivProfile.setOnClickListener {
            // Mock de seleção de foto
            Toast.makeText(this, "Selecionar foto - Em desenvolvimento", Toast.LENGTH_SHORT).show()
        }

        btnSave.setOnClickListener {
            if (validateInputs()) {
                saveProfile()
            }
        }
    }

    private fun validateInputs(): Boolean {
        var isValid = true

        // Limpa erros anteriores
        tilName.error = null
        tilAge.error = null
        tilWeight.error = null
        tilHeight.error = null

        // Valida campos obrigatórios
        if (tilName.editText?.text.isNullOrEmpty()) {
            tilName.error = "Campo obrigatório"
            isValid = false
        }
        if (tilAge.editText?.text.isNullOrEmpty()) {
            tilAge.error = "Campo obrigatório"
            isValid = false
        }
        if (tilWeight.editText?.text.isNullOrEmpty()) {
            tilWeight.error = "Campo obrigatório"
            isValid = false
        }
        if (tilHeight.editText?.text.isNullOrEmpty()) {
            tilHeight.error = "Campo obrigatório"
            isValid = false
        }

        return isValid
    }

    private fun saveProfile() {
        // Mock de salvamento do perfil
        Toast.makeText(this, "Perfil salvo com sucesso!", Toast.LENGTH_SHORT).show()
        finish()
    }
}