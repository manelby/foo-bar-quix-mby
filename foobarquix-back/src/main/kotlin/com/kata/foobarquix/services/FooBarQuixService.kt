package com.kata.foobarquix.services

import org.springframework.stereotype.Component
import java.util.HashMap
import java.util.stream.Collectors

@Component
class FooBarQuixService {
    val THREE = 3
    val FIVE = 5
    val SEVEN = 7

    fun convertNumber(inputNumber: Int): String {
        val fooBarQixMap: MutableMap<Int, String> = HashMap()
        fooBarQixMap[THREE] = "Foo"
        fooBarQixMap[FIVE] = "Bar"

        var toReturn: String? = division(inputNumber, fooBarQixMap)
        val stringGivenNumber: String = inputNumber.toString()
        fooBarQixMap[SEVEN] = "Qix"
        toReturn += applyTheContainsFooBar(fooBarQixMap, stringGivenNumber)
        return if (toReturn!!.isEmpty()) inputNumber.toString() else toReturn

    }

    private fun division(givenNumber: Int, fooBarQixMap: Map<Int, String>): String? {
        return fooBarQixMap.keys.stream()
                .filter { number: Int -> givenNumber % number == 0 }
                .map { key: Int -> fooBarQixMap[key] }
                .collect(Collectors.joining())
    }

    private fun applyTheContainsFooBar(fooBarQixMap: Map<Int, String>, stringGivenNumber: String): String? {
        return stringGivenNumber.chars()
                .mapToObj { charUnit: Int -> fooBarQixMap[Character.getNumericValue(charUnit)] ?: "" }
                .collect(Collectors.joining())
    }

}