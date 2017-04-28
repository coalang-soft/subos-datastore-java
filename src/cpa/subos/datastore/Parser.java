package cpa.subos.datastore;

import java.io.InputStream;

import cpa.subos.io.IOBase;

public interface Parser {

	<T> T parse(Class<T> c, InputStream s) throws ParseException;
	<T> T parse(Class<T> c, IOBase<?> b) throws ParseException;
	
}
