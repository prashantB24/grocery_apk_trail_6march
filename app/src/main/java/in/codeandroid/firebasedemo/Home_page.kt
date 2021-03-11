package `in`.codeandroid.firebasedemo


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.v
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import com.google.firebase.auth.FirebaseAuth

import kotlinx.android.synthetic.main.activity_home_page.*

class Home_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        lateinit var auth: FirebaseAuth

        auth = FirebaseAuth.getInstance()

        btn_profile.setOnClickListener(){
            startActivity(Intent(this,Profile::class.java))

        }



        btn_sign_out.setOnClickListener(){
            FirebaseAuth.getInstance().signOut()
            finish()
            startActivity(Intent(this, LoginActivity::class.java))
            Toast.makeText(
                baseContext, "Sign out succesfully",
                Toast.LENGTH_SHORT
            ).show()
        }


    }
}