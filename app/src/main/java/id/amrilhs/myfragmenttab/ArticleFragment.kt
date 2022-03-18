package id.amrilhs.myfragmenttab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import id.amrilhs.myfragmenttab.articlefragment.adapter.MyFragmentTabAdapter
import id.amrilhs.myfragmenttab.databinding.FragmentArticleBinding


class ArticleFragment : Fragment() {

    var tabFragment = arrayOf("Badminton", "Football", "MotoGP")

    private var _binding: FragmentArticleBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pagerfragment = binding?.viewpagerFragment
        val tablayout = binding?.tablayoutFragment

        pagerfragment?.adapter = MyFragmentTabAdapter(childFragmentManager,lifecycle)

        if (pagerfragment != null) {
            if (tablayout != null) {
                TabLayoutMediator(tablayout,pagerfragment){ tab,position ->
                    tab.text = tabFragment[position]

                }.attach()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentArticleBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding =null
    }
}

