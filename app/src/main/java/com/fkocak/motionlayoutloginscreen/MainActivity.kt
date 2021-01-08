package com.fkocak.motionlayoutloginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a reference to the layout params
        val layoutParams = bottom_sheet.layoutParams as CoordinatorLayout.LayoutParams

        // Get a reference to the BottomSheetBehaviour
        val bottomSheetBehavior = layoutParams.behavior as BottomSheetBehavior

        button_sticky.setOnClickListener {
            if(bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED)
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            else
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

    }
}