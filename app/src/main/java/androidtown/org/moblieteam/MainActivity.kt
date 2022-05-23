package androidtown.org.moblieteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidtown.org.moblieteam.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {

    private lateinit var auth:FirebaseAuth

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.login.setOnClickListener{

            val currentUser = auth.currentUser
            if(currentUser == null){

                val intent = Intent(this,LoginStart::class.java)
                startActivity(intent)
            }
            else{
                val intent = Intent(this, AlreadyLogin::class.java)
                startActivity(intent)

            }
        }
    }
}