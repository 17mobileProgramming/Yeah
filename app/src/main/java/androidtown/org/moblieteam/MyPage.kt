package androidtown.org.moblieteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidtown.org.moblieteam.databinding.ActivityAlreadyLoginBinding
import androidtown.org.moblieteam.databinding.ActivityMyPageBinding
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MyPage : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMyPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        binding = DataBindingUtil.setContentView(this,R.layout.activity_my_page)

        var nickname = findViewById<TextView>(R.id.username)

        val user = Firebase.auth.currentUser
        user?.let {
            val email = user.email
            nickname.setText(email)
        }


    }
}