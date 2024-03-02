package com.example.petpojecttbalayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class NumberViewPagerAdapter(fragmentManager: FragmentManager, lifeCycle: Lifecycle):
    FragmentStateAdapter(fragmentManager, lifeCycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> NumberFragment.newInstance(position + 1)
            1 -> NumberFragment.newInstance(position + 1)
            else -> NumberFragment.newInstance(position + 1)
        }
    }
}