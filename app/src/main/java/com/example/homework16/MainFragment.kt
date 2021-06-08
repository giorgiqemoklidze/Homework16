package com.example.homework16


import android.os.Bundle
import android.util.Log.d
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.room.Room
import com.example.homework16.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var binding : MainFragmentBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(layoutInflater,container,false)
        init()
        return binding.root
    }


    fun init(){
        binding.read.setOnClickListener{

            viewModel.read()
        }


        binding.write.setOnClickListener{
            viewModel.write(
                binding.firstName.text.toString(),
                binding.lastName.text.toString(),
                binding.age.text.toString(),
                binding.adress.text.toString(),
                binding.height.text.toString(),
                binding.profile.text.toString(),
                binding.id.text.toString())



        }



        observe()


    }


    private fun observe(){
        viewModel._users.observe(viewLifecycleOwner){
            d("READ","$it")


        }


    }





}