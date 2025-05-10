package br.com.mindfit.mindfit

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import java.text.SimpleDateFormat
import java.util.*

class MainDashboardActivity : AppCompatActivity() {

    private lateinit var tvCurrentWeight: TextView
    private lateinit var tvWeightDiff: TextView
    private lateinit var tvCaloriesConsumed: TextView
    private lateinit var tvCaloriesGoal: TextView
    private lateinit var tvWorkoutsCompleted: TextView
    private lateinit var tvStreak: TextView
    private lateinit var weightChart: LineChart
    private lateinit var cardNutrition: CardView
    private lateinit var cardWorkout: CardView
    private lateinit var cardChatbot: CardView
    private lateinit var cardSettings: CardView
    private lateinit var ivNotification: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dashboard)

        initViews()
        setupWeightChart()
        loadMockData()
        setupClickListeners()
    }

    private fun initViews() {
        tvCurrentWeight = findViewById(R.id.tvCurrentWeight)
        tvWeightDiff = findViewById(R.id.tvWeightDiff)
        tvCaloriesConsumed = findViewById(R.id.tvCaloriesConsumed)
        tvCaloriesGoal = findViewById(R.id.tvCaloriesGoal)
        tvWorkoutsCompleted = findViewById(R.id.tvWorkoutsCompleted)
        tvStreak = findViewById(R.id.tvStreak)
        weightChart = findViewById(R.id.weightChart)
        cardNutrition = findViewById(R.id.cardNutrition)
        cardWorkout = findViewById(R.id.cardWorkout)
        cardChatbot = findViewById(R.id.cardChatbot)
        cardSettings = findViewById(R.id.cardSettings)
        ivNotification = findViewById(R.id.ivNotification)
    }

    private fun setupWeightChart() {
        weightChart.apply {
            description.isEnabled = false
            legend.isEnabled = false
            setTouchEnabled(true)
            setScaleEnabled(false)
            isDragEnabled = true
            setDrawGridBackground(false)

            xAxis.apply {
                position = XAxis.XAxisPosition.BOTTOM
                setDrawGridLines(false)
                granularity = 1f
                valueFormatter = IndexAxisValueFormatter(getLastSevenDays())
            }

            axisRight.isEnabled = false
            axisLeft.apply {
                setDrawGridLines(true)
                axisMinimum = 70f
                axisMaximum = 76f
            }
        }
    }

    private fun loadMockData() {
        tvCurrentWeight.text = "73.0 kg"
        tvWeightDiff.text = "-2.5 kg"
        tvWeightDiff.setTextColor(Color.GREEN)

        tvCaloriesConsumed.text = "1850"
        tvCaloriesGoal.text = "2000"

        tvWorkoutsCompleted.text = "12"
        tvStreak.text = "5 dias"

        val entries = listOf(
            Entry(0f, 75.5f),
            Entry(1f, 75.0f),
            Entry(2f, 74.5f),
            Entry(3f, 74.2f),
            Entry(4f, 73.8f),
            Entry(5f, 73.3f),
            Entry(6f, 73.0f)
        )

        val dataSet = LineDataSet(entries, "Peso").apply {
            color = Color.BLUE
            lineWidth = 2f
            setCircleColor(Color.BLUE)
            circleRadius = 4f
            setDrawValues(false)
            mode = LineDataSet.Mode.CUBIC_BEZIER
        }

        weightChart.data = LineData(dataSet)
        weightChart.invalidate()
    }

    private fun getLastSevenDays(): ArrayList<String> {
        val dateFormat = SimpleDateFormat("dd/MM", Locale.getDefault())
        val dates = ArrayList<String>()
        val calendar = Calendar.getInstance()

        for (i in 6 downTo 0) {
            calendar.add(Calendar.DAY_OF_YEAR, -1)
            dates.add(dateFormat.format(calendar.time))
        }
        return dates
    }

    private fun setupClickListeners() {
        cardWorkout.setOnClickListener {
            startActivity(Intent(this, WorkoutPlannerActivity::class.java))
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
    }
}