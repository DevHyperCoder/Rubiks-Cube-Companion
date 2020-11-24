package com.codeyard.cubecompanion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codeyard.cubecompanion.adapters.SectionsPagerAdapter
import com.codeyard.cubecompanion.ui.timer.TimerFragment
import com.codeyard.cubecompanion.ui.timings.TimingsFragment
import kotlinx.android.synthetic.main.main_activity.*

/**
 * Implementation of [AppCompatActivity]
 * Main entry point
 */
class MainActivity : AppCompatActivity() {

    /**
     * Run when the activity is created
     * Initialize a [SectionsPagerAdapter] for ViewPager adapter
     * Setup the tabLayout with the viewPager
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val sectionsPagerAdapter = SectionsPagerAdapter(
            this,
            supportFragmentManager,
            arrayOf(this.getString(R.string.timer_tab), this.getString(R.string.timings_tab)),
            arrayOf(TimerFragment(), TimingsFragment())
        )

        view_pager.adapter = sectionsPagerAdapter
        tab_layout.setupWithViewPager(view_pager)
    }
}