package com.practice.workingwithstreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsAPIs {

	public static void main(String[] args) throws IOException {
//		IntStream
//		.range(1,10)
//		.forEach((x)-> System.out.println(x));
		
		
//		IntStream
//		.range(1,10)
//		.skip(2)
//		.forEach((x)-> System.out.println(x));
		
		
//		int res=IntStream
//		.range(1,10)
//		.sum();
//		System.out.println(res);
		
		
		
//		Stream.of("Hello","bye","hi")
//		.sorted()
//		.findFirst()
//		.ifPresent((x)-> System.out.println(x));
		
		
		
		Stream<String> lines=Files.lines(Paths.get("files/table.txt"));
		lines.sorted()
		.filter(l->l.length() > 7)
		.forEach(x-> System.out.println(x));
		
		lines.close();
	
	
}
	
}
