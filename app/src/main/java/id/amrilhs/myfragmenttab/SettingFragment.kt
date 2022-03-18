package id.amrilhs.myfragmenttab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.amrilhs.myfragmenttab.databinding.FragmentSettingBinding


class SettingFragment : Fragment() {

    private var settingBinding: FragmentSettingBinding? = null
    private val binding get() = settingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        settingBinding = FragmentSettingBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        settingBinding = null
    }
}