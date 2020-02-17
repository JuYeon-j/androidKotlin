package com.andrstudy.lecture.fcmtest.checkbox_radiobox

import android.graphics.Color
import android.graphics.Typeface.BOLD
import android.graphics.Typeface.ITALIC
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        var option = 0

        if (boldOption.isChecked) option += BOLD
        if (italicOption.isChecked) option += ITALIC

        previewText.setTypeface(null, option)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boldOption.setOnCheckedChangeListener(this)
        italicOption.setOnCheckedChangeListener(this)

        colorOptionGroup.setOnCheckedChangeListener(object: RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                when(checkedId){
                    R.id.redOption -> previewText.setTextColor(Color.RED)
                    R.id.blueOption -> previewText.setTextColor(Color.BLUE)
                    R.id.BlackOption -> previewText.setTextColor(Color.BLACK)
                }
            }

        })
    }
}
