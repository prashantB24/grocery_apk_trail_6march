package `in`.codeandroid.firebasedemo


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.dialog_forgot_password.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)



        btn_submit.setOnClickListener() {
            Toast.makeText(
                baseContext, "submitted suceesfully",
                Toast.LENGTH_SHORT
            ).show()
        }

        btn_reset.setOnClickListener() {
            et_number.clearFocus()
            et_email.clearFocus()
            et_address.clearFocus()
            et_username.clearFocus()
        }
    }}