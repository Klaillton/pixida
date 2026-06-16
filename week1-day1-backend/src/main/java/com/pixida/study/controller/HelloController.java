package com.pixida.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pixida.study.dto.HelloResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/v1/hello")
@Tag(name = "Hello", description = "Exemplo inicial - dia 1")
public class HelloController {

    @Operation(summary = "Saudações com nome", description = "Endpoint de exemplo para Semana 1")
    @GetMapping("/{name}")
    public HelloResponse sayHello(@PathVariable String name) {
        return new HelloResponse("Hello, " + name + "!");
    }
}
