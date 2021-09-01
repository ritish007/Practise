package com.example.practise1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.practise1.R
import com.example.practise1.databinding.FragmentLoginBinding
import com.example.practise1.utils.Checking
import org.koin.android.ext.android.inject

class LoginFragment : Fragment() {

    var _binding: FragmentLoginBinding?=null
    val binding get()=_binding!!

    //lazy
    val check by inject<Checking>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.loginButton.setOnClickListener {


            check.checkEmpty(binding.email.text.toString().trim(), binding.password.text.toString().trim())
            check.checkValidity(binding.email.text.toString().trim(), binding.password.text.toString().trim())

            Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment_to_mainFragment)
        }

        binding.signup.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment_to_signupFragment)
        }

        return binding.root
    }

}