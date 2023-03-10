package com.example.mealzapp.ui.meals

import androidx.lifecycle.ViewModel
import com.example.model.MealsRepository
import com.example.model.response.MealsCategoriesResponse


class MealsCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals { response ->
            successCallback(response)
        }
    }
}