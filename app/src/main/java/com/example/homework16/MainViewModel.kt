package com.example.homework16

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {

    private var users = MutableLiveData<List<User>>()
    var _users:MutableLiveData<List<User>> = users



    fun read(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
               var user =  DataBase.db.userDao().getAll()
                _users.postValue(user)

            }
        }
    }


    fun write(firstName:String,lastName:String,age:String,adress:String,height:String,profile:String,id:String){
        val user = User(firstName,lastName,age,adress,height,profile,id)
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                DataBase.db.userDao().insertAll(user)
            }
        }

    }



}