package shabnam.viewbinding1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import shabnam.viewbinding1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnValidate?.setOnClickListener{
            if (binding?.etName?.text?.toString().isNullOrEmpty()){
                binding?.etName?.error="Enter Your Name"
            }
            else if (binding?.etCollegeName?.text?.toString().isNullOrEmpty()){
                binding?.etCollegeName?.error="Enter Your College Name"
            }
        }
    }
}
