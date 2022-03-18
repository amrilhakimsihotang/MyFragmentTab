package id.amrilhs.myfragmenttab.articlefragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import id.amrilhs.myfragmenttab.articlefragment.FootballFragment
import id.amrilhs.myfragmenttab.articlefragment.BadmintonFragment
import id.amrilhs.myfragmenttab.articlefragment.MotogpFragment

class MyFragmentTabAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return BadmintonFragment()
            1 -> return FootballFragment()
            2 -> return MotogpFragment()
            else -> return  BadmintonFragment()
        }
    }

}