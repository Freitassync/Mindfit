package br.com.mindfit.mindfit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NutritionTrackerActivity : AppCompatActivity() {

    private lateinit var cardDashboard: CardView
    private lateinit var cardWorkout: CardView
    private lateinit var cardChatbot: CardView
    private lateinit var cardSettings: CardView
    private lateinit var ivNotification: ImageView
    private lateinit var rvMeals: RecyclerView
    private lateinit var fabAddMeal: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition_tracker)

        initViews()
        setupClickListeners()
        setupRecyclerView()
        loadMockMeals()
    }

    private fun initViews() {
        // Navegação
        cardDashboard = findViewById(R.id.cardDashboard)
        cardWorkout = findViewById(R.id.cardWorkout) // Note que mudamos para cardWorkout
        cardChatbot = findViewById(R.id.cardChatbot)
        cardSettings = findViewById(R.id.cardSettings)
        ivNotification = findViewById(R.id.ivNotification)

        // Componentes específicos da nutrição
        rvMeals = findViewById(R.id.rvMeals)
        fabAddMeal = findViewById(R.id.fabAddMeal)
    }

    private fun setupClickListeners() {
        // Navegação
        cardDashboard.setOnClickListener {
            startActivity(Intent(this, MainDashboardActivity::class.java))
            finish()
        }

        cardWorkout.setOnClickListener {
            startActivity(Intent(this, WorkoutPlannerActivity::class.java))
            finish()
        }

        cardChatbot.setOnClickListener {
            startActivity(Intent(this, ChatbotActivity::class.java))
            finish()
        }

        cardSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            finish()
        }

        ivNotification.setOnClickListener {
            // Implementar notificações
        }

        // Nutrição específica
        fabAddMeal.setOnClickListener {
            showToast("Adicionar refeição - Em desenvolvimento")
        }
    }

    private fun setupRecyclerView() {
        rvMeals.layoutManager = LinearLayoutManager(this)
        // rvMeals.adapter = MealsAdapter() // Descomente quando criar o adapter
    }

    private fun loadMockMeals() {
        // Implementação futura
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}