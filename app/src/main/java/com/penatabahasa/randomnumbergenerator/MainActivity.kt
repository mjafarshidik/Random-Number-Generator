package com.penatabahasa.randomnumbergenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.randomnumbergenerator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var Xo : Int = 0
    private var m : Int = 0
    private var a : Int = 0
    private var randomNum : Int = 0
    private var noOfRandomNum : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

        }
    }

    fun multiplicativeCongruentialMethod(Xo: Int, m: Int, a: Int, randomNum: Int,noOfRandomNum: Int) : Int{
        for (i in 1..noOfRandomNum){

        }
        return Xo
    }
}