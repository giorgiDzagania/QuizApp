package giorgidzagania.example.quizapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import giorgidzagania.example.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        binding.tvName.text = userName

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        binding.tvScore.text = "You score is $correctAnswers out of $totalQuestion"

        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}