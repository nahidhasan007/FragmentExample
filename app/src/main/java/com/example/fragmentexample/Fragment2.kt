package com.example.fragmentexample

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment2 : Fragment(R.layout.fragment2){
    var contact = ArrayList<ContactInfo>()
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = layoutInflater.inflate(R.layout.fragment2,container,false)
        var inputText = arguments?.getString("Input_text")
        //val outText = rootView.findViewById<TextView>(R.id.textView)
        val btn2 = rootView.findViewById<Button>(R.id.fragment2btn)
        btn2.setOnClickListener(){ replaceFragment(Fragment2())}
        //val btn = rootView.findViewById<Button>(R.id.inputText)
        val input = inputText
        /*btn2.setOnClickListener(){
            val msg = editText.text.toString()
            val sharedPref = getSharedPreferences(
                getString(R.string.demo), Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("Message",msg)
            editor.apply()
            textView.text = msg



        }

        val getshared = getSharedPreferences(getString(R.string.demo), Context.MODE_PRIVATE)
        val getmsg = getshared.getString("Message","Default msg shown because of NUll! value")
        textView.text = getmsg

         */
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.contactInfo)
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))
        contact.add(ContactInfo(R.drawable.sharetrip3,"Save more on international flight bookings!","Back from a 1000+ hotels and resorts right from our app","23 Nov'22"))

        recyclerView.adapter = Adapter(contact)
        super.onResume()
        (requireActivity() as MainActivity).supportActionBar?.title = input
        //outText.text = inputText
        return rootView
    }



    /* override fun onResume() {
         val btn = findViewById<Button>(R.id.inputText)
         val editText = findViewById<EditText>(R.id.editText)
         btn.setOnClickListener(){
             val msg = editText.text.toString()
             val sharedPref = getSharedPreferences(
                 getString(R.string.demo), Context.MODE_PRIVATE)
             val editor = sharedPref.edit()
             editor.putString("Message",msg)
             editor.apply()
             textView.text = msg



         }
         val getshared = getSharedPreferences(getString(R.string.demo), Context.MODE_PRIVATE)
         val getmsg = getshared.getString("Message","Default msg shown because of NUll! value")
         textView.text = getmsg
         super.onResume()
         (requireActivity() as MainActivity).supportActionBar?.title = "Deals"
     }

     */
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()
    }
}
