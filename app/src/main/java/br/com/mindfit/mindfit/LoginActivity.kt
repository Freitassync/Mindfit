package br.com.mindfit.mindfit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Referências aos elementos do layout
        val etEmailUsername = findViewById<TextInputEditText>(R.id.et_email_username)
        val etPassword = findViewById<TextInputEditText>(R.id.et_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)
        val tvForgotPassword = findViewById<TextView>(R.id.tv_forgot_password)
        val btnGoogle = findViewById<ImageButton>(R.id.btn_google)
        val btnFacebook = findViewById<ImageButton>(R.id.btn_facebook)

        // Ação do botão Log In
        btnLogin.setOnClickListener {
            val emailUsername = etEmailUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            // Validação simples
            if (emailUsername.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else {
                // Simulação de login bem-sucedido
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Fecha a LoginActivity
            }
        }

        // Ação do link Forgot Password
        tvForgotPassword.setOnClickListener {
            Toast.makeText(this, "Funcionalidade de recuperação de senha ainda não implementada", Toast.LENGTH_SHORT).show()
        }

        // Ação do botão Google (placeholder)
        btnGoogle.setOnClickListener {
            Toast.makeText(this, "Login com Google ainda não implementado", Toast.LENGTH_SHORT).show()
        }

        // Ação do botão Facebook (placeholder)
        btnFacebook.setOnClickListener {
            Toast.makeText(this, "Login com Facebook ainda não implementado", Toast.LENGTH_SHORT).show()
        }
    }
}