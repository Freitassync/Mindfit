package br.com.mindfit.mindfit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class WorkoutPlannerActivity : AppCompatActivity() {

    private lateinit var cardDashboard: CardView
    private lateinit var cardNutrition: CardView
    private lateinit var cardChatbot: CardView
    private lateinit var cardSettings: CardView
    private lateinit var fabAddExercise: FloatingActionButton
    private lateinit var ivNotification: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_planner)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        cardDashboard = findViewById(R.id.cardDashboard)
        cardNutrition = findViewById(R.id.cardNutrition)
        cardChatbot = findViewById(R.id.cardChatbot)
        cardSettings = findViewById(R.id.cardSettings)
        fabAddExercise = findViewById(R.id.fabAddExercise)
        ivNotification = findViewById(R.id.ivNotification)
    }

    private fun setupClickListeners() {
        cardDashboard.setOnClickListener {
            startActivity(Intent(this, MainDashboardActivity::class.java))
            finish()
        }

        cardNutrition.setOnClickListener {
            startActivity(Intent(this, NutritionTrackerActivity::class.java))
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

        fabAddExercise.setOnClickListener {

        }


        ivNotification.setOnClickListener {
        }
    }
}