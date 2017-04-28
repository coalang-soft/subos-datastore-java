package cpa.subos.datastore;

import java.io.OutputStream;

import cpa.subos.io.BufferIOBase;
import cpa.subos.io.IOBase;
import cpa.subos.io.OutputStreamIOBase;

public interface Writer {

	BufferIOBase write(Object o) throws WriteException;
	OutputStreamIOBase write(Object in, OutputStream out) throws WriteException;
	<T extends IOBase<?>> T write(Object o, T t) throws WriteException;
	
}
