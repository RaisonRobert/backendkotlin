package br.com.raison.iniciando

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HeloController {

    @GetMapping
    fun hello():String{
        return "Hellow Word"
    }
}