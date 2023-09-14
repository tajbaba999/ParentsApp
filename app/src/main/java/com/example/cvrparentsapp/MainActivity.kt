package com.example.cvrparentsapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import com.example.cvrparentsapp.databinding.ActivityMainBinding
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        showFragment(HomeFragment())



        binding.bottomNavigation.setOnItemReselectedListener{item->
            when(item.itemId){
                R.id.home ->{
                    showFragment(HomeFragment())
                }
                R.id.profile->{
                    showFragment(ProfileFragment())
                }
            }
//            return@setOnItemReselectedListener

        }




    }
    fun showFragment(fragment: Fragment) {
//        val fragmentManger = supportFragmentManager
//        val fragmentTransaction = fragmentManger.beginTransaction()
//        fragmentTransaction.replace(R.id.framelayout, fragment)
////        fragmentTransaction.commit()
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.framelayout, fragment)
//        transaction.disallowAddToBackStack()
//        transaction.commit()

        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.framelayout, fragment)
            transaction.disallowAddToBackStack()
            transaction.commit()
        }

    }
}