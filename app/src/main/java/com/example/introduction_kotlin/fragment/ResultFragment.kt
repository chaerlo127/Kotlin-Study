package com.example.introduction_kotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.introduction_kotlin.R
import kotlinx.android.synthetic.main.fragment_result.*


/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {
// bundle로 가져온 데이터를 잡아줘야한다.

    var option = -1
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        option = arguments?.getInt("index") ?:-1 // null이면 -1을 반환한다.
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        setResult(option)
        home.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment2)
        }
    }

    private fun setResult(option: Int) {
        when(option){
            1->{
                result_title.text = "You are a QUITTER"
//                result_title.setText("")
                sentence.text = "You can let the person easily."
            }
            2->{
                result_title.text = "You should focus on yourself"
                sentence.text = "You become really clingy to your ex."
            }
            3->{
                result_title.text = "You should take it easy"
                sentence.text = "You can do crazy things no matter what it takes."
            }
            4->{
                result_title.text = "You are pretty mature."
                sentence.text = "You can easily accept the break-up"
            }
        }
    }


}