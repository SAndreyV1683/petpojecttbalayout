package com.example.petpojecttbalayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.petpojecttbalayout.databinding.FragmentNumberBinding

class NumberFragment : Fragment() {
    private lateinit var binding: FragmentNumberBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        conteiner: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumberBinding.inflate(inflater, conteiner, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.number.text = requireArguments().getInt(NUMBER).toString()
    }

    companion object {
        private const val NUMBER = "number"
        fun newInstance(number: Int) = NumberFragment().apply {
            arguments = Bundle().apply {
                putInt(NUMBER, number)
            }
        }
    }
}