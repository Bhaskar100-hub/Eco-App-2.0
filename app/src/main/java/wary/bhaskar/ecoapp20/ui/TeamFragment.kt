package wary.bhaskar.ecoapp20.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_team.*
import wary.bhaskar.ecoapp20.R
import wary.bhaskar.ecoapp20.Team.FirstFragment
import wary.bhaskar.ecoapp20.Team.SecondFragment

class TeamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_team, container, false)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        btnFragment1.setOnClickListener {

        }

        return view
    }
}