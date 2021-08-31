package com.example.practise1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.practise1.databinding.FragmentLoginBinding
import com.example.practise1.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    var _binding: FragmentSignupBinding?=null
    val binding get()=_binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentSignupBinding.inflate(inflater, container, false)

        binding.signup.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_signupFragment_to_mainFragment)
        }

        return binding.root
    }
}