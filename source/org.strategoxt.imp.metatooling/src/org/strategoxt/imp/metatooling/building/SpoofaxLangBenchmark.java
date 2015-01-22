package org.strategoxt.imp.metatooling.building;

import com.google.caliper.BeforeExperiment;
import com.google.caliper.Benchmark;
import com.google.caliper.Param;

public final class SpoofaxLangBenchmark {
	@Param({"5", "10", "15"}) int number; // number to factorial -Dnumber-1,2,3
	
	@BeforeExperiment
	void setup(){
		System.out.println("Setting up experiment");
	}
	
	@Benchmark
	long recursive(int rep) {
		int number = this.number;
		long dummy = 0; // to avoid optimized out of call to recursive
		for (int i = 0; i < rep; i++) {
			dummy |= Factorial.recursive(number);
		}

		return dummy;
	}

	@Benchmark
	long iterative(int rep) {
		int number = this.number;
		long dummy = 0; // to avoid optimized out of call to recursive
		for (int i = 0; i < rep; i++) {
			dummy |= Factorial.iterative(number);
		}

		return dummy;
	}
}


class Factorial {
	static long recursive(int number) {
		switch (number) {
			case 0:
				return number;

			default:
				return (number * recursive(number - 1));
		}
	}

	static long iterative(int number) {
		long result = 1;
		for (int i = number; i > 0; i--) {
			result *= i;
		}
		return result;
	}

}