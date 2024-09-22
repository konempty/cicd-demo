package kr.beyondimagination.cicddemo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/main")
class MainController {
    @RequestMapping("/hello")
    fun hello(): String {
        return "Hello, 김한빈!"
    }
}
