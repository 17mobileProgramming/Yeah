package androidtown.org.moblieteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidtown.org.moblieteam.databinding.ActivityLoginStartBinding
import androidtown.org.moblieteam.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginStart : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    private lateinit var binding: ActivityLoginStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        auth = Firebase.auth

        binding = DataBindingUtil.setContentView(this,R.layout.activity_login_start)



        binding.loginBtn.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)

        }
        binding.joinBtn.setOnClickListener{
            val intent = Intent(this,Join::class.java)
            startActivity(intent)
        }
    }
}