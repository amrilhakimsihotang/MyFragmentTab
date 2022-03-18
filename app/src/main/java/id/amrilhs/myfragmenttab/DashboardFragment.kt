package id.amrilhs.myfragmenttab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.amrilhs.myfragmenttab.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {
    private var dashboardBinding: FragmentDashboardBinding? = null
    private val binding get() = dashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardBinding = FragmentDashboardBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        dashboardBinding =null
    }
}