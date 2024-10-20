package com.rail.kotlincourse.lesson14

fun main () {

//1
    val cases = mapOf("Case1" to 234, "Case2" to 2532, "Case3" to 2423)
    println(cases.values.average())



//2
    val endpoint = mapOf("login" to "200", "register" to "400")
    println(endpoint.keys)


//3
    val results = mutableMapOf("test1" to "200OK", "test2" to "500Fail")
    results["test3"] = "200OK"
    println(results)


//4
    println(results.count { it.value == "200OK" })


//5
    val bugs = mutableMapOf("bug1" to "in test", "bug2" to "fix")
    bugs.remove("bug2")
    println(bugs)


//6
    val status = mapOf("vk.com" to "200OK", "linkedin.com" to "400BadRequest")
    status.forEach { (key, value) ->
        println("$key - is $value")
    }

//7
    val resp = mapOf("vk.com" to 50, "linkedin.com" to 4353)
    println(resp.filter { it.value > 60 })


//8
    val ends = mapOf("get" to "200OK", "post" to "200OK", "put" to "500")
    println(ends.getOrDefault("patch") { "not testing" })


//9
    val conf = mapOf("browserType" to "Chrome")
    println(conf.get("browserType"))

//10
    val conf1 = conf.toMutableMap()
    println(conf1)


//11
    val ustr = mapOf("OnePlus12" to "Android14", "Motorola" to "Android7")
    println(ustr.getOrDefault("Motorola", "change device"))


//12
    val errors = mapOf(418 to "I’m a teapot", 500 to "Server Error")
    println(errors.containsKey(404))


//14
    val scenaries = mapOf("TestID_Version1" to "Passed", "TestID_Version2" to "Failed", "TestID_Version3" to "Skipped")
    println(scenaries.filterKeys { it.endsWith("3") })


//15
    val modules = mapOf("Auth" to "Passed", "Regist" to "Failed")
    println(modules.filterValues { it == "Failed" }.keys)


//16
    val bugs1 = mapOf("bug1" to "open")
    val bugs2 = mapOf("bug2" to "closed")
    val bugs3 = bugs1 + bugs2
    println(bugs3)



//18
    val results1 = mapOf("test1" to "OK", "test2" to "skipped", "test3" to "OK")
    val results2 = results1.filter { it.value == "Skipped" }
    println(results2)


//20
    val results3 = mapOf("test1" to "Passed", "test2" to "Failed", "test3" to "Failed")
    println(results3.map { "${it.key} Test ID: ${it.value}" })



//23
    val resurses = mutableMapOf("v1" to 100, "v2" to 200)
    val resurses1 = resurses.mapValues { it.value  * 1.1}
    println(resurses1)

//24
    val errors1 = mapOf<Int, String>()
    println(errors1.isEmpty())

//25
    val testNG = mapOf("test1" to "Passed")
    println(testNG.isNotEmpty())




}

