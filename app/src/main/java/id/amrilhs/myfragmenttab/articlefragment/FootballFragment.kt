package id.amrilhs.myfragmenttab.articlefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.amrilhs.myfragmenttab.databinding.FragmentFootballBinding


class FootballFragment : Fragment() {


    private var _footballBinding: FragmentFootballBinding? =null
    private val binding get() = _footballBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _footballBinding = FragmentFootballBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _footballBinding =null
    }

}