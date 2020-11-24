package com.codeyard.cubecompanion.ui.timings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codeyard.cubecompanion.R

/**
 * Implementation of [Fragment]
 * TODO
 */
class TimingsFragment : Fragment() {

    /**
     * @return Return a [View] inflated with [R.layout.timer_fragment]
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.timings_fragment, container, false)
    }

}