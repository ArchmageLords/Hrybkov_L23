package com.example.hrybkov_l23.structural_patterns

interface DataSource {
    fun writeData()
    fun readData()
}

class  FileDataSource : DataSource {

    override fun readData() {
        println("Read data")
    }

    override fun writeData() {
        println("Write data")
    }
}

class EnhancedFileDataSource(private val dataSource: DataSource) : DataSource by dataSource {

    override fun writeData() {
        println("Enhanced write data")
    }

    override fun readData() {
        println("Enhanced read data")
    }

    fun encryptData() {
        println("Data encrypted")
    }
}

fun main() {
    val fileDataSource = FileDataSource()
    val enhancedFileDataSource = EnhancedFileDataSource(fileDataSource)

    fileDataSource.writeData()
    enhancedFileDataSource.writeData()
    enhancedFileDataSource.encryptData()
}