package br.com.mindfit.mindfit

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import br.com.mindfit.mindfit.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NutritionTrackerActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var rvMeals: RecyclerView
    private lateinit var fabAddMeal: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition_tracker)

        initViews()
        setupToolbar()
        setupClickListeners()
        loadMockMeals()
    }

    private fun initViews() {
        toolbar = findViewById(R.id.toolbar)
        rvMeals = findViewById(R.id.rvMeals)
        fabAddMeal = findViewById(R.id.fabAddMeal)
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Nutrição"
    }

    private fun setupClickListeners() {
        fabAddMeal.setOnClickListener {
            showToast("Adicionar refeição - Em desenvolvimento")
        }
    }

    private fun loadMockMeals() {
        // Aqui você pode adicionar dados mock para a lista de refeições
        // Por enquanto deixaremos vazio
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}