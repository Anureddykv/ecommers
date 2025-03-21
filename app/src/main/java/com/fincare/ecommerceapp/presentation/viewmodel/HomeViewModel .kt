package com.fincare.ecommerceapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fincare.ecommerceapp.data.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _productList = MutableStateFlow<List<Map<String, Any>>>(emptyList())
    val productList: StateFlow<List<Map<String, Any>>> = _productList.asStateFlow()

    private val _categories = MutableStateFlow<List<Pair<String, String?>>>(emptyList())
    val categories: StateFlow<List<Pair<String, String?>>> = _categories.asStateFlow()

    init {
        fetchProducts()
        fetchCategories()
    }

    private fun fetchProducts() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getProducts()
                _productList.value = response.map { product ->
                    mapOf(
                        "id" to product.id,
                        "title" to product.title,
                        "price" to product.price,
                        "image" to product.image,
                        "category" to product.category,
                        "rating" to product.rating.rate as Any
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun fetchCategories() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getCategories()
                _categories.value = response.map { categoryName -> categoryName to null }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
