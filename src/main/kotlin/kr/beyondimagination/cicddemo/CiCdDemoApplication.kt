package kr.beyondimagination.cicddemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiCdDemoApplication

fun main(args: Array<String>) {
    runApplication<CiCdDemoApplication>(*args)
}
