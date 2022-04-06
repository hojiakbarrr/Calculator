package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var one: TextView
    lateinit var two: TextView
    lateinit var three: TextView
    lateinit var four: TextView
    lateinit var five: TextView
    lateinit var six: TextView
    lateinit var seven: TextView
    lateinit var eight: TextView
    lateinit var nine: TextView
    lateinit var zero: TextView
    ///////////////////////////////операции

    lateinit var multi: TextView
    lateinit var ravno: TextView
    lateinit var devision: TextView
    lateinit var minus: TextView
    lateinit var plus: TextView
    lateinit var dot: TextView
    lateinit var rightbracket: TextView
    lateinit var leftbracket: TextView

    /////////////////////////// очистка
    lateinit var back: TextView
    lateinit var clear: TextView

    /////////////////////////////видимость
    lateinit var vvod: TextView
    lateinit var rezult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)


        multi = findViewById(R.id.multi)
        devision = findViewById(R.id.devision)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)
        ravno = findViewById(R.id.равно)

        dot = findViewById(R.id.dot)
        back = findViewById(R.id.back)
        clear = findViewById(R.id.clear)
        vvod = findViewById(R.id.ввод)
        rezult = findViewById(R.id.результат)

        rightbracket = findViewById(R.id.rbracket)
        leftbracket = findViewById(R.id.lbracket)


        var count = 0


        ravno.setOnClickListener {




            try {
                val ex = ExpressionBuilder(vvod.text.toString()).build()
                val result = ex.evaluate()

                val longRes = result.toLong()
                if (result == longRes.toDouble()){
                    rezult.text = longRes.toString()
                }else
                    rezult.text = result.toString()
                count++

            }catch (e: Exception){
                Log.d("Ошибка", "сообщение: ${e.message}")
            }

        }

        clear.setOnClickListener {
            vvod.text = ""
            rezult.text = ""

        }

        back.setOnClickListener {

            val stroka = vvod.text.toString()

            try {
                vvod.text = stroka.substring(0,stroka.length -1)
                rezult.text = ""
            } catch (e: Exception) {
                println("fields are empty")
            }
        }


        leftbracket.setOnClickListener {

            if (vvod.text.isEmpty()) {
                vvod.text = leftbracket.text
            } else {
                vvod.append(leftbracket.text)
            }
        }

        rightbracket.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = rightbracket.text
            } else {
                vvod.append(rightbracket.text)
            }
        }

        one.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = one.text
            } else {
                vvod.append(one.text)
            }

        }

        two.setOnClickListener {

            if (vvod.text.isEmpty()) {
                vvod.text = two.text
            } else {
                vvod.append(two.text)
            }

        }

        three.setOnClickListener {

            if (vvod.text.isEmpty()) {
                vvod.text = three.text
            } else {
                vvod.append(three.text)
            }
        }

        four.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = four.text
            } else {
                vvod.append(four.text)
            }
        }

        five.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = five.text
            } else {
                vvod.append(five.text)
            }
        }

        six.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = six.text
            } else {
                vvod.append(six.text)
            }
        }

        seven.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = seven.text
            } else {
                vvod.append(seven.text)
            }
        }

        eight.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = eight.text
            } else {
                vvod.append(eight.text)
            }
        }

        nine.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = nine.text
            } else {
                vvod.append(nine.text)
            }
        }

        zero.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = zero.text
            } else {
                vvod.append(zero.text)
            }
        }

        multi.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = multi.text
            } else {
                vvod.append(multi.text)
            }
        }

        minus.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = minus.text
            } else {
                vvod.append(minus.text)
            }
        }

        plus.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = plus.text
            } else {
                vvod.append(plus.text)
            }
        }
        devision.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = devision.text
            } else {
                vvod.append(devision.text)
            }
        }
        dot.setOnClickListener {
            if (vvod.text.isEmpty()) {
                vvod.text = dot.text
            } else {
                vvod.append(dot.text)
            }
        }




////        val multi = multi.text.toString().toInt();
//        val devision = devision.text.toString().toInt();
//        val plus = plus.text.toString().toInt();
//        val minus = minus.text.toString().toInt();


    }




}