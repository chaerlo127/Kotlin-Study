package com.example.introduction_kotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.introduction_kotlin.R
import kotlinx.android.synthetic.main.fragment_selection.*

/**
 * A simple [Fragment] subclass.
 * Use the [SelectionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SelectionFragment : Fragment() , View.OnClickListener{
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        back_btn.setOnClickListener(this)
        option_1.setOnClickListener(this)
        option_2.setOnClickListener(this)
        option_3.setOnClickListener(this)
        option_4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        // view 에 있는 id의 값을 불러온다.
        when(v?.id){
            R.id.back_btn ->{
                navController.navigateUp()
                // 안드로이드는 stack처럼 view를 저장한다.
                // 앞으로 가기 위해서는 현재 화면을 pop 하면 된다.
            }
            R.id.option_1 ->{
                navigateWithIndex(1)
            }R.id.option_2 ->{
                navigateWithIndex(2)
            }R.id.option_3 ->{
                navigateWithIndex(3)
            }R.id.option_4 ->{
                navigateWithIndex(4)
            }
        }
    }

    private fun navigateWithIndex(index: Int){
        val bundle = bundleOf("index" to index)
        // bundle로 쌓아서 데이터를 보내준다.
        // index라는 key안의 index를 넣어준다.
        // index(key) to index(value)

        navController.navigate(R.id.action_selectionFragment_to_resultFragment,bundle)
    }


}