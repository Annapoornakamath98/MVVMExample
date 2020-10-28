package com.yml.retrofitexample2

interface APIResponseInterface {
    fun onResponse(response: List<ResponseObjects>)
    fun onFailure(t:Throwable)
}