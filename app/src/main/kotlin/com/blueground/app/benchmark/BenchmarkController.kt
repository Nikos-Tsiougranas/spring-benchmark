package com.blueground.app.benchmark

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller("/api/spring-benchmark")
class BenchmarkController(
  private val benchmarkService: BenchmarkService
) {

  @GetMapping
  @ResponseBody
  fun get(): List<Benchmark> {
    println("hello")
    return benchmarkService.getAll()
  }
}
