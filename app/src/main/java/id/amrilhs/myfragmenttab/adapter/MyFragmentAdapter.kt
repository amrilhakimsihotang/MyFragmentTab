package id.amrilhs.myfragmenttab.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import id.amrilhs.myfragmenttab.ArticleFragment
import id.amrilhs.myfragmenttab.DashboardFragment
import id.amrilhs.myfragmenttab.SettingFragment

class MyFragmentAdapter(fragmentAdapter: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentAdapter, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return DashboardFragment()
            1 -> return ArticleFragment()
            2 -> return SettingFragment()
            else -> return DashboardFragment()
        }
    }
}