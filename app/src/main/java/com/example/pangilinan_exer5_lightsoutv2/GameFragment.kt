package com.example.pangilinan_exer5_lightsoutv2


import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.pangilinan_exer5_lightsoutv2.databinding.FragmentGameBinding
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_title.*


/**
 * A simple [Fragment] subclass.
 */
class GameFragment : Fragment() {
    private var buttonLight11 =1 //lightsOn
    private var buttonLight12 =1 //lightsOn
    private var buttonLight13 =1 //lightsOn
    private var buttonLight14 =1 //lightsOn
    private var buttonLight15 =1 //lightsOn
    private var buttonLight21 =1 //lightsOn
    private var buttonLight22 =1 //lightsOn
    private var buttonLight23 =1 //lightsOn
    private var buttonLight24 =1 //lightsOn
    private var buttonLight25 =1 //lightsOn
    private var buttonLight31 =1 //lightsOn
    private var buttonLight32 =1 //lightsOn
    private var buttonLight33 =1 //lightsOn
    private var buttonLight34 =1 //lightsOn
    private var buttonLight35 =1 //lightsOn
    private var buttonLight41 =1 //lightsOn
    private var buttonLight42 =1 //lightsOn
    private var buttonLight43 =1 //lightsOn
    private var buttonLight44 =1 //lightsOn
    private var buttonLight45 =1 //lightsOn
    private var buttonLight51 =1 //lightsOn
    private var buttonLight52 =1 //lightsOn
    private var buttonLight53 =1 //lightsOn
    private var buttonLight54 =1 //lightsOn
    private var buttonLight55 =1 //lightsOn
    private var moves= 0


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater, R.layout.fragment_game, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setListeners()

    }

    private fun changeLight(light: Int, btn: Button): Int {
        return if(light==1){
            btn.setBackgroundResource(R.color.black)
            0
        }else{
            btn.setBackgroundResource(R.color.lightOn)
            1
        }
    }
    private fun flip(view: View) {
        when (view.id) {
            R.id.button1_1 -> {
                buttonLight11 = changeLight(buttonLight11,button1_1)
                buttonLight21 = changeLight(buttonLight21,button2_1)
                buttonLight12 = changeLight(buttonLight12,button1_2)}
            R.id.button1_2 -> {
                buttonLight12 = changeLight(buttonLight12,button1_2)
                buttonLight11 = changeLight(buttonLight11,button1_1)
                buttonLight22 = changeLight(buttonLight22,button2_2)
                buttonLight13 = changeLight(buttonLight13,button1_3)}
            R.id.button1_3 -> {
                buttonLight13 = changeLight(buttonLight13,button1_3)
                buttonLight12 = changeLight(buttonLight12,button1_2)
                buttonLight14 = changeLight(buttonLight14,button1_4)
                buttonLight23 = changeLight(buttonLight23,button2_3)}
            R.id.button1_4 -> {
                buttonLight14 = changeLight(buttonLight14,button1_4)
                buttonLight13 = changeLight(buttonLight13,button1_3)
                buttonLight15 = changeLight(buttonLight15,button1_5)
                buttonLight24 = changeLight(buttonLight24,button2_4)}
            R.id.button1_5 -> {
                buttonLight15 = changeLight(buttonLight15,button1_5)
                buttonLight14 = changeLight(buttonLight14,button1_4)
                buttonLight25 = changeLight(buttonLight25,button2_5)}

            R.id.button2_1 -> {
                buttonLight11 = changeLight(buttonLight11,button1_1)
                buttonLight21 = changeLight(buttonLight21,button2_1)
                buttonLight22 = changeLight(buttonLight22,button2_2)
                buttonLight31 = changeLight(buttonLight31,button3_1)}
            R.id.button2_2 -> {
                buttonLight12 = changeLight(buttonLight12,button1_2)
                buttonLight21 = changeLight(buttonLight21,button2_1)
                buttonLight22 = changeLight(buttonLight22,button2_2)
                buttonLight23 = changeLight(buttonLight23,button2_3)
                buttonLight32 = changeLight(buttonLight32,button3_2)}
            R.id.button2_3 -> {
                buttonLight23 = changeLight(buttonLight23,button2_3)
                buttonLight22 = changeLight(buttonLight22,button2_2)
                buttonLight24 = changeLight(buttonLight24,button2_4)
                buttonLight33 = changeLight(buttonLight33,button3_3)
                buttonLight13 = changeLight(buttonLight13,button1_3)}
            R.id.button2_4 -> {
                buttonLight24 = changeLight(buttonLight24,button2_4)
                buttonLight23 = changeLight(buttonLight23,button2_3)
                buttonLight25 = changeLight(buttonLight25,button2_5)
                buttonLight34 = changeLight(buttonLight34,button3_4)
                buttonLight14 = changeLight(buttonLight14,button1_4)}
            R.id.button2_5 -> {
                buttonLight25 = changeLight(buttonLight25,button2_5)
                buttonLight24 = changeLight(buttonLight24,button2_4)
                buttonLight35 = changeLight(buttonLight35,button3_5)
                buttonLight15 = changeLight(buttonLight15,button1_5)}

            R.id.button3_1 -> {
                buttonLight21 = changeLight(buttonLight21,button2_1)
                buttonLight31 = changeLight(buttonLight31,button3_1)
                buttonLight32 = changeLight(buttonLight32,button3_2)
                buttonLight41 = changeLight(buttonLight41,button4_1)}
            R.id.button3_2 -> {
                buttonLight22 = changeLight(buttonLight22,button2_2)
                buttonLight31 = changeLight(buttonLight31,button3_1)
                buttonLight32 = changeLight(buttonLight32,button3_2)
                buttonLight33 = changeLight(buttonLight33,button3_3)
                buttonLight42 = changeLight(buttonLight42,button4_2)}
            R.id.button3_3 -> {
                buttonLight33 = changeLight(buttonLight33,button3_3)
                buttonLight32 = changeLight(buttonLight32,button3_2)
                buttonLight34 = changeLight(buttonLight34,button3_4)
                buttonLight43 = changeLight(buttonLight43,button4_3)
                buttonLight23 = changeLight(buttonLight23,button2_3)}
            R.id.button3_4 -> {
                buttonLight34 = changeLight(buttonLight34,button3_4)
                buttonLight33 = changeLight(buttonLight33,button3_3)
                buttonLight35 = changeLight(buttonLight35,button3_5)
                buttonLight44 = changeLight(buttonLight44,button4_4)
                buttonLight24 = changeLight(buttonLight24,button2_4)}
            R.id.button3_5 -> {
                buttonLight35 = changeLight(buttonLight35,button3_5)
                buttonLight34 = changeLight(buttonLight34,button3_4)
                buttonLight45 = changeLight(buttonLight45,button4_5)
                buttonLight25 = changeLight(buttonLight25,button2_5)}

            R.id.button4_1 -> {
                buttonLight31 = changeLight(buttonLight31,button3_1)
                buttonLight41 = changeLight(buttonLight41,button4_1)
                buttonLight42 = changeLight(buttonLight42,button4_2)
                buttonLight51 = changeLight(buttonLight51,button5_1)}
            R.id.button4_2 -> {
                buttonLight32 = changeLight(buttonLight32,button3_2)
                buttonLight41 = changeLight(buttonLight41,button4_1)
                buttonLight42 = changeLight(buttonLight42,button4_2)
                buttonLight43 = changeLight(buttonLight43,button4_3)
                buttonLight52 = changeLight(buttonLight52,button5_2)}
            R.id.button4_3 -> {
                buttonLight43 = changeLight(buttonLight43,button4_3)
                buttonLight42 = changeLight(buttonLight42,button4_2)
                buttonLight44 = changeLight(buttonLight44,button4_4)
                buttonLight53 = changeLight(buttonLight53,button5_3)
                buttonLight33 = changeLight(buttonLight33,button3_3)}
            R.id.button4_4 -> {
                buttonLight44 = changeLight(buttonLight44,button4_4)
                buttonLight43 = changeLight(buttonLight43,button4_3)
                buttonLight45 = changeLight(buttonLight45,button4_5)
                buttonLight54 = changeLight(buttonLight54,button5_4)
                buttonLight34 = changeLight(buttonLight34,button3_4)}
            R.id.button4_5 -> {
                buttonLight45 = changeLight(buttonLight45,button4_5)
                buttonLight44 = changeLight(buttonLight44,button4_4)
                buttonLight55 = changeLight(buttonLight55,button5_5)
                buttonLight35 = changeLight(buttonLight35,button3_5)}

            R.id.button5_1 -> {
                buttonLight51 = changeLight(buttonLight51,button5_1)
                buttonLight41 = changeLight(buttonLight41,button4_1)
                buttonLight52 = changeLight(buttonLight52,button5_2)}
            R.id.button5_2 -> {
                buttonLight52 = changeLight(buttonLight52,button5_2)
                buttonLight51 = changeLight(buttonLight51,button5_1)
                buttonLight42 = changeLight(buttonLight42,button4_2)
                buttonLight53 = changeLight(buttonLight53,button5_3)}
            R.id.button5_3 -> {
                buttonLight53 = changeLight(buttonLight53,button5_3)
                buttonLight52 = changeLight(buttonLight52,button5_2)
                buttonLight54 = changeLight(buttonLight54,button5_4)
                buttonLight43 = changeLight(buttonLight43,button4_3)}
            R.id.button5_4 -> {
                buttonLight54 = changeLight(buttonLight54,button5_4)
                buttonLight53 = changeLight(buttonLight53,button5_3)
                buttonLight55 = changeLight(buttonLight55,button5_5)
                buttonLight44 = changeLight(buttonLight44,button4_4)}
            R.id.button5_5 -> {
                buttonLight55 = changeLight(buttonLight55,button5_5)
                buttonLight54 = changeLight(buttonLight54,button5_4)
                buttonLight45 = changeLight(buttonLight45,button4_5)}
            else -> view.setBackgroundColor(Color.RED)
        }
    }
    @SuppressLint("SetTextI18n")
    private fun isFinished():Boolean{
        if(buttonLight11==0 && buttonLight12==0 && buttonLight13==0 && buttonLight14==0 && buttonLight15==0 &&
            buttonLight21==0 && buttonLight22==0 && buttonLight23==0 && buttonLight24==0 && buttonLight25==0 &&
            buttonLight31==0 && buttonLight32==0 && buttonLight33==0 && buttonLight34==0 && buttonLight35==0 &&
            buttonLight41==0 && buttonLight42==0 && buttonLight43==0 && buttonLight44==0 && buttonLight45==0 &&
            buttonLight51==0 && buttonLight52==0 && buttonLight53==0 && buttonLight54==0 && buttonLight55==0){
            //won
            boxes.visibility= View.GONE
            move_count.visibility= View.GONE
            return true

        }else{
            return false
        }
    }
    @SuppressLint("SetTextI18n")
    private fun setListeners() {
        val button11 = button1_1
        val button12 = button1_2
        val button13 = button1_3
        val button14 = button1_4
        val button15 = button1_5

        val button21 = button2_1
        val button22 = button2_2
        val button23 = button2_3
        val button24 = button2_4
        val button25 = button2_5

        val button31 = button3_1
        val button32 = button3_2
        val button33 = button3_3
        val button34 = button3_4
        val button35 = button3_5

        val button41 = button4_1
        val button42 = button4_2
        val button43 = button4_3
        val button44 = button4_4
        val button45 = button4_5

        val button51 = button5_1
        val button52 = button5_2
        val button53 = button5_3
        val button54 = button5_4
        val button55 = button5_5

        val clickableViews: List<View> =
            listOf(button11,button12,button13,button14,button15,
                button21,button22,button23,button24,button25,
                button31,button32,button33,button34,button35,
                button41,button42,button43,button44,button45,
                button51,button52,button53,button54,button55)
        try{
            for (item in clickableViews) {
                item.setOnClickListener {
                    flip(it)
                    moves += 1
                    move_count.text = "Move Count: $moves"
                    if(isFinished()){
                        //won


                    }
                }
            }
        }catch (e: NullPointerException){

        }
    }
}