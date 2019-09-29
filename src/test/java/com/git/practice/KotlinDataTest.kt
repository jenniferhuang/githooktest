package com.ringcentral.ta.glip.test.jenniferignore

import org.testng.annotations.Test


/**
 * Created by jennifer.huang on 2019-07-22.
 */

class KotlinDataTest {

    @Test
    //TODO: TO CAUSE  ForbiddenComment-udpate-update-update-test
    //jennifer branch , test merge/rebase
    fun testMap() {
        var myMap: HashMap<String, String> = HashMap()

        myMap["TEST1"] = "TEST1VALUE"
        myMap["TEST1"] = "TEST1VALUE-upDATE"


        var myMap2 = hashMapOf<String, String>()
        var myMap3 = mutableMapOf<String, String>()

        myMap2["TEST1"] = "TEST1VALUE"
        myMap2["TEST1"] = "TEST1VALUE-upDATE"
        print(myMap2["TEST1"])


        myMap3["TEST1"] = "TEST1VALUE"
        myMap3["TEST1"] = "TEST1VALUE-upDATE"
        print(myMap3["TEST1"])


    }


    @Test
    //TODO: TO CAUSE  ForbiddenComment-udpate-update-update-test
    fun testData() {
//        var timeLapse: Long = 4933
//        println((timeLapse.toFloat() / 1000))
//        println((timeLapse / 1000).toString())
//
//        val array: DoubleArray = doubleArrayOf()
//
//        array.plus(0.01)
//        array.plus(0.02)
//        println(Arrays.toString(array))
////        http://zetcode.com/kotlin/arrays/
//
//        ///
        val array2: ArrayList<Double> = ArrayList<Double>()

        val threadhold = 0.8

        array2.add(0.03)
        array2.add(0.04)
        array2.add(0.84)
        array2.add(0.84)
        array2.add(0.84)
        array2.add(0.14)

        val count1 = array2.count { temp -> temp < threadhold }
        val count2 = array2.count()
        print("test:" + count1)
        print("test2: " + count2)

        val actualExecutionTime = 40
        val expectedDurationSeconds = 62
        val videoSampleTimeRatio = 0.8
        if (actualExecutionTime < expectedDurationSeconds * videoSampleTimeRatio) {
            println(true)
        }

        println(expectedDurationSeconds * videoSampleTimeRatio)

        val map = hashMapOf<String, Any>()
        val rate: Double = 0.8
        map["111"] = rate
    }
}