package me.yusufaw.android.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.yusufaw.android.mvvm.data.Animal
import me.yusufaw.android.mvvm.databinding.ActivityAnimalBinding

class AnimalActivity : AppCompatActivity() {
     lateinit var binding: ActivityAnimalBinding
     lateinit var viewModel: AnimalViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = AnimalViewModel(Animal("Dog", 0))

        binding.button.setOnClickListener {
            viewModel.shout()
            binding.textView.text = viewModel.info
        }
    }
}