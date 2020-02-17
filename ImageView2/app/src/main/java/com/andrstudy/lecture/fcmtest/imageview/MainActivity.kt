package com.andrstudy.lecture.fcmtest.imageview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photoView.setOnClickListener(object : View.OnClickListener {
            var isDefault = true
            override fun onClick(v: View?) {
                isDefault = !isDefault
                if(isDefault) photoView.setImageResource(R.drawable.mountain)
                else photoView.setImageResource(R.drawable.schilthorn)

            }

        })

        scaleTypeButton.setOnClickListener(object: View.OnClickListener{
            var isDefault = true
            override fun onClick(v: View?) {
                isDefault = !isDefault
                if(isDefault) photoView.scaleType = ImageView.ScaleType.CENTER_CROP
                else photoView.scaleType = ImageView.ScaleType.CENTER_INSIDE
            }

        })
    }
}
