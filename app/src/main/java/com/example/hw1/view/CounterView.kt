package com.example.hw1.view

interface CounterView {
    fun updateCount(count: String)
    fun showToastMinus()
    fun showToastIncrement()
    fun getColor()
}