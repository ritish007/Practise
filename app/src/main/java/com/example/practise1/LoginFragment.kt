package com.example.practise1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.practise1.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    var _binding: FragmentLoginBinding?=null
    val binding get()=_binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.loginButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment_to_mainFragment)
        }

        binding.signup.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment_to_signupFragment)
        }

        return binding.root
    }

}