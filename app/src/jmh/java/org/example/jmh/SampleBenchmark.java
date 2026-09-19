package org.example.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

import org.example.CountingCards;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 2)
@Warmup(iterations = 2)
public class SampleBenchmark {
  @Param({"100", "1000", "10000", "50000"})
  int size;

  CountingCards countingCards = new CountingCards();

  @Benchmark
  @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
  public void shuffleSlow(Blackhole bh) {
    Integer[] arr = new Integer[size];
    for (int i = 0; i < size; i++) arr[i] = i;
    bh.consume(countingCards.shuffleSlow(arr));
  }

  @Benchmark
  @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
  public void shuffleBetter(Blackhole bh) {
    Integer[] arr = new Integer[size];
    for (int i = 0; i < size; i++) arr[i] = i;
    bh.consume(countingCards.shuffleBetter(arr));
  }

  @Benchmark
  @Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
  public void shuffleBest(Blackhole bh) {
    Integer[] arr = new Integer[size];
    for (int i = 0; i < size; i++) arr[i] = i;
    bh.consume(countingCards.shuffleBest(arr));
  }

}
