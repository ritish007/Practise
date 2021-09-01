package com.example.practise1.utils

class Checking(val errorMsg: Error, val successMsg: Success) {

    fun checkEmpty(email: String, password: String){
        if(email.isEmpty() || password.isEmpty()){
            errorMsg.status()
        }
    }

    fun checkValidity(email: String, password: String){
        if(email == "ritish.singh@crib.in" && password == "123456"){
            successMsg.status()
        }else{
            errorMsg.status()
        }
    }
}