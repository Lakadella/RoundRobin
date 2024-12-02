package com.example.kotlinbasics

import android.view.textclassifier.TextLinks


class F1UtilClass

fun main() {
    print(createString(2024, 1))

}

fun createString(year: Int, race: Int) : String {
    return "http://ergast.com/api/f1/" + year +"/" + race + "/results"
}



