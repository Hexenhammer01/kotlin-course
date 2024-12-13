package com.rail.kotlincourse.lesson28.homework


import java.io.File

fun main() {

    val file1 = File("workspace/task1/example.txt")
    file1.parentFile.mkdirs()
    file1.mkdirs()
    file1.writeText("Hello, Kotlin!")

    if (file1.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }

    // Задача 2
    val dir1 = File("workspace/task2/testDir")
    dir1.mkdirs()
    if (dir1.isDirectory) {
        println(dir1)
    }

    // Задача 3
    val dir3 = File("workspace/task3/structure/myDir")
    val subDir1 = File("workspace/task3/structure/myDir/subDir1")
    val subDir2 = File("workspace/task3/structure/myDir/subDir1/subDir2")
    dir3.mkdirs()
    subDir1.mkdirs()
    subDir2.mkdirs()

    if (subDir1.isDirectory && subDir2.isDirectory) {
        println(subDir1)
        println(subDir2)
    }


    // Задача 4
    val tempDerFile = File("workspace/task4/temp/tempDer/file3.txt")
    tempDerFile.parentFile.mkdirs()
    val tempFile = File("workspace/task4/temp/file.txt")
    val tempFile1 = File("workspace/task4/temp/file1.txt")
    tempFile1.createNewFile() && tempFile.createNewFile() && tempDerFile.createNewFile()
    val deleteDer = File("workspace/task4")
    deleteDer.deleteRecursively()

    // Задача 5
    val configFile = File("workspace/task5/config/config.txt")
    configFile.parentFile.mkdirs()
    configFile.createNewFile()
    configFile.writeText("ключ1=значение1\nключ2=значение2\nключ3=значение3")

    configFile.readLines().forEach { znachenie ->
        val vivod = znachenie.substringAfter("=")
        println(vivod)
    }

    //Задача 6
    println("666666")
    val workspaceDir = File("workspace")


    val directories = workspaceDir.walkTopDown().filter { it.isDirectory }
    val files = workspaceDir.walkTopDown().filter { it.isFile }


    println("files")
    files.forEach { (println(it.parentFile)) }
    println("direct")
    directories.forEach { (println(it.parentFile)) }
    println("end")


    // Задача 7
    val workspace = File("workspace/task9/docs")
    workspace.mkdirs()
    val readme = File("workspace/task9/docs/readme.md")
    if (readme.exists()) {
        println("file exist")
    } else {
        readme.createNewFile()
        readme.writeText("This is a README file.")
    }


}