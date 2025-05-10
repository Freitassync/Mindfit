package br.com.mindfit.mindfit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.mindfit.mindfit.R
import com.google.android.material.chip.ChipGroup
import com.google.android.material.textfield.TextInputLayout

class ProfileSetupActivity : AppCompatActivity() {

    private lateinit var btnBack: ImageButton
    private lateinit var tilAge: TextInputLayout
    private lateinit var tilHeight: TextInputLayout
    private lateinit var tilWeight: TextInputLayout
    private lateinit var tilGoalWeight: TextInputLayout
    private lateinit var tilOtherConditions: TextInputLayout
    private lateinit var chipGroupConditions: ChipGroup
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_setup)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        btnBack = findViewById(R.id.btnBack)
        tilAge = findViewById(R.id.tilAge)
        tilHeight = findViewById(R.id.tilHeight)
        tilWeight = findViewById(R.id.tilWeight)
        tilGoalWeight = findViewById(R.id.tilGoalWeight)
        tilOtherConditions = findViewById(R.id.tilOtherConditions)
        chipGroupConditions = findViewById(R.id.chipGroupConditions)
        btnSave = findViewById(R.id.btnSave)
    }

    private fun setupClickListeners() {
        btnBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
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
        tilAge.error = null
        tilHeight.error = null
        tilWeight.error = null
        tilGoalWeight.error = null

        // Valida campos obrigatórios
        if (tilAge.editText?.text.isNullOrEmpty()) {
            tilAge.error = "Campo obrigatório"
            isValid = false
        }
        if (tilHeight.editText?.text.isNullOrEmpty()) {
            tilHeight.error = "Campo obrigatório"
            isValid = false
        }
        if (tilWeight.editText?.text.isNullOrEmpty()) {
            tilWeight.error = "Campo obrigatório"
            isValid = false
        }
        if (tilGoalWeight.editText?.text.isNullOrEmpty()) {
            tilGoalWeight.error = "Campo obrigatório"
            isValid = false
        }

        return isValid
    }

    private fun saveProfile() {
        Toast.makeText(this, "Perfil salvo com sucesso!", Toast.LENGTH_SHORT).show()
        finish()
    }
}