package com.codeyard.cubecompanion.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * @param context Context
 * @param fm FragmentManger
 * @param titleList Title for each tab
 * @param fragmentList List of fragments. Corresponding to [titleList]
 * Implementation of [FragmentStatePagerAdapter] for ViewPager
 */
class SectionsPagerAdapter(
    private val context: Context,
    private val fm: FragmentManager,
    private val titleList: Array<String>,
    private val fragmentList: Array<Fragment>
) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    /**
     * @param position Position in the array to get the fragment
     * @return Selected fragment
     */
    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    /**
     * @return Returns the count of fragments
     */
    override fun getCount(): Int {
        return fragmentList.size
    }

    /**
     * @param position Position in array
     * @return Return the element from [titleList] with position [position]
     */
    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}