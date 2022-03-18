package id.amrilhs.myfragmenttab.articlefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.amrilhs.myfragmenttab.databinding.FragmentBadmintonBinding



class BadmintonFragment : Fragment() {
    private var _fragmentBadmintonBinding: FragmentBadmintonBinding? = null
    //cara 2 untuk menjauhkan NPE
    //
    //private val _binding get() = binding!!
    private val _binding get() = _fragmentBadmintonBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _fragmentBadmintonBinding = FragmentBadmintonBinding.inflate(layoutInflater,container,false)
        return _binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _fragmentBadmintonBinding = null
    }

}