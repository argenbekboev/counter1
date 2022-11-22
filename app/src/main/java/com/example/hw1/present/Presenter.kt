package com.example.hw1.present

import com.example.hw1.MainActivity
import com.example.hw1.injektor
import com.example.hw1.view.CounterView

class Presenter {
    private val model =injektor.getModel()
    private lateinit var view : CounterView

    fun increment(){
        model.increment()
        view.updateCount(model.getCount().toString())
        if (model.getCount()==+10){
            view.showToastIncrement()
        }
        if (model.getCount() == +15){
            view.getColor()
        }
    }

    fun decrement(){
        model.decrement()
        view.updateCount(model.getCount().toString())
        if (model.getCount()==-5){
            view.showToastMinus()
        }
    }
    fun attachView(view: MainActivity){
        this.view=view

    }
}