package shmuly.sternbach.custommishnahlearningprogram.activities

import android.os.Bundle
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import shmuly.sternbach.custommishnahlearningprogram.MishnahPickerDialog
import shmuly.sternbach.custommishnahlearningprogram.R

private const val TAG = "MainActivity"
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
        lateinit var mishnahPickerDialog: MishnahPickerDialog// = MishnahPickerDialog(this)

        findViewById<AutoCompleteTextView>(R.id.start_autocomplete_text_view).setOnClickListener{
            mishnahPickerDialog.show(supportFragmentManager,"")
        }
        findViewById<AutoCompleteTextView>(R.id.end_autocomplete_text_view).setOnClickListener{
            mishnahPickerDialog.show(supportFragmentManager,"")
        }
        findViewById<TextInputLayout>(R.id.start_text_input_layout).setEndIconOnClickListener{
            mishnahPickerDialog.show(supportFragmentManager,"")
        }
        findViewById<TextInputLayout>(R.id.end_text_input_layout).setEndIconOnClickListener{
            mishnahPickerDialog.show(supportFragmentManager,"")
        }
    }
//
//    override fun onMishnahPicked(masechta: String, perek: String, mishnah: String){
//
////        findViewById<TextView>(R.id.calendar_result).text = getCalendar().toString()
//    }
}