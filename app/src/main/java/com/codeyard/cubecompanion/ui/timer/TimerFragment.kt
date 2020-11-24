package com.codeyard.cubecompanion.ui.timer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codeyard.cubecompanion.R

/**
 * Implementation of [Fragment]
 * Home Screen of App.
 * TODO
 */
class TimerFragment : Fragment() {

    /**
     * @return Return a [View] inflated with the [R.layout.timer_fragment]
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.timer_fragment, container, false)
    }
}