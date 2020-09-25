package com.blueground.app.benchmark

import org.springframework.stereotype.Service

@Service
class BenchmarkService(
  private val benchmarkRepository: BenchmarkRepository
) {
  fun getAll(): List<Benchmark> = benchmarkRepository.findAll()
}
