package com.practice.lambdaexpression;

@FunctionalInterface
public interface CalculateSum<T1,T2> {
	T2 compute(T1 a, T2 b);
}
