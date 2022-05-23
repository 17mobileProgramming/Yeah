package androidtown.org.moblieteam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidtown.org.moblieteam.databinding.ActivityAlreadyLoginBinding
import androidtown.org.moblieteam.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class AlreadyLogin : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityAlreadyLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        auth = Firebase.auth
        binding = DataBindingUtil.setContentView(this,R.layout.activity_already_login)

        binding.logoutBtn.setOnClickListener{

            auth.signOut()
            Toast.makeText(this, "로그아웃!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)

        }

        binding.mypage.setOnClickListener{
            Toast.makeText(this, "My Page", Toast.LENGTH_LONG).show()

            val intent = Intent(this, MyPage::class.java)
            startActivity(intent)


        }



    }
}