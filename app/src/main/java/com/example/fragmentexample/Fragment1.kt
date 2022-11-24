package com.example.fragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class Fragment1 : Fragment(R.layout.fragment1) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = layoutInflater.inflate(R.layout.fragment1,container,false)
        val btn = rootView.findViewById<Button>(R.id.fragment1btn)
        //val btn = findViewById<Button>(R.id.fragment1btn)
        //val btn2 = findViewById<Button>(R.id.fragment2btn)

        btn.setOnClickListener() { replaceFragment(Fragment1()) }

        val inputText = rootView.findViewById<EditText>(R.id.inputText)
        btn.setOnClickListener(){
            passDataCom(inputText.text.toString())
        }
        return rootView
    }

    fun passDataCom(editText: String){
        val bundle = Bundle()
        bundle.putString("Input_text",editText)
        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        val frag2 = Fragment2()
        frag2.arguments = bundle
        transaction.replace(R.id.fragmentContainer,frag2)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()
    }
}