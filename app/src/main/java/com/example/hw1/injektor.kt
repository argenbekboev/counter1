package com.example.hw1

import com.example.hw1.model.CounterModel
import com.example.hw1.present.Presenter

class injektor {

    companion object{
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun  getModel(): CounterModel {
            return CounterModel()
        }


    }
}