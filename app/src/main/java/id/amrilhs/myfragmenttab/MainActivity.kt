package id.amrilhs.myfragmenttab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import id.amrilhs.myfragmenttab.adapter.MyFragmentAdapter
import id.amrilhs.myfragmenttab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   var _tabTitle = arrayOf("Dashboard","Article","Setting")

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pager = binding.viewPager2
        val tablayout = binding.tabLayout
        pager.adapter = MyFragmentAdapter(supportFragmentManager,lifecycle)


        TabLayoutMediator(tablayout,pager){
            tab,position ->
            tab.text = _tabTitle[position]
        }.attach()
    }
}