package bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.utils;

import java.io.FileWriter;
import java.io.IOException;
import bwi.prog2B.SS2017.wi16b044_kapferer.SampleExam.provided.*;

public class MyFileWriter<T> {
	
	private IFormatter<T> format;
	
	private FileWriter out;
	
	public MyFileWriter(FileWriter file, IFormatter<T>  format) {
		if (file == null) {
			throw new IllegalArgumentException("expected non-null FileWriter");
		}
		
		if (format == null) {
			throw new IllegalArgumentException("expected non-null IFormatter");
		}
		
		this.out = file;
		this.format = format;
	}
	
	public boolean put(T t) {
		try {
			out.write(format.format(t) + '\n');
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
