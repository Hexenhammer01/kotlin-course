package com.rail.kotlincourse.lesson28

import com.rail.kotlincourse.lesson4.keyValues
import java.io.File

fun main() {
//    val file = File("path/to/your/file.txt")
//    val directory = File("path/to/your/directory")
//
//    file.parentFile.mkdirs()
//    file.createNewFile()
//
//    val isNewFileCreated: Boolean = file.createNewFile()
//    if (isNewFileCreated) {
//        println("Файл был создан")
//    } else {
//        println("Файл уже существует")
//    }
//
//    if (file.exists()) {
//        println("Файл существует")
//    } else {
//        println("Файл не найден")
//    }
//    file.writeText("Hello, world!")
//
//    val text = file.readText()
//    println(text)
//
//
//    (1..5).forEach {
//        file.parentFile.resolve("$it").mkdirs()
//    }
//
//    val files = directory.listFiles()
//    files?.forEach { file ->
//        if (file.isFile) {
//            println(file)
//        }
//    }
//
////    if (file.delete()) {
////        println("Файл удален")
////    } else {
////        println("Не удалось удалить файл")
////    }
//
////    file.walk().filter { it.isFile }
////        .associate { it.readLines() }
////        .filterValues { data ->
////            data.any {it.contains("text")}
////        }
//
//    val t: String = file.parent
//    val k: File = file.parentFile
//
//    println(file.absoluteFile)
//    println(file.parentFile)
//    println(file.parent)
//
//    val baseDir = File("path/to")
//    val file1 = File("path/to/nested/file.txt")
//    val relative = file1.toRelativeString(baseDir)
//    println(file1.toRelativeString(baseDir))
//    val baseDir2 = File("path2/to")
//    val file3 = baseDir2.resolve(relative)
//    file3.parentFile.mkdirs()
//    file3.createNewFile()
    val mapp = mapOf("1" to 1.1, "2" to 2.2, "3" to 3.3, "4" to 4.4)
    writeDataToFile(mapp,"path/folder/molder/nazvanie.txt")

    println( readLines("path/folder/molder/nazvanie.txt"))
}

fun createOrFileDirectory(f: String) {
    File(f).apply {
        if (f.endsWith("/")) {
            mkdirs()
        } else {
            parentFile.mkdirs()
            createNewFile()

        }
    }

}

fun writeDataToFile(data: Map<String, Double>, f1: String) {
    val write = data.map { "${it.key}=${it.value}" }.joinToString("\n")
    createOrFileDirectory(f1)
    File(f1).writeText(write)
}

fun readLines(t:String): Map<String, Double> {
    val file2 = File(t).readLines()
    return file2.associate {
        val ss = it.split("=")
        ss[0] to ss[1].toDouble()}
}
