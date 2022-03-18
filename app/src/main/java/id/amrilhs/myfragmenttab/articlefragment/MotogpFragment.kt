package id.amrilhs.myfragmenttab.articlefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.amrilhs.myfragmenttab.databinding.FragmentMotogpBinding


class MotogpFragment : Fragment() {

    private var _motogpBinding : FragmentMotogpBinding?= null
   //cara 1 menjauhkan NPE pada variabel binding
   // yaitu menghapus binding get() dan pada return binding.root diganti dengan statusqBinding

   // private val binding get() = statusqBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _motogpBinding = FragmentMotogpBinding.inflate(inflater,container,false)
     //   return binding.root
          return _motogpBinding?.root
    }

    override fun onDestroy() {

        super.onDestroy()
        _motogpBinding =null
    }
}