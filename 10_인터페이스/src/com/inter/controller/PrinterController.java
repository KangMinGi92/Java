package com.inter.controller;

import com.inter.common.PrinterDriver;

public class PrinterController {
	
//	private SamsungPrinter printer;
	private PrinterDriver printer;
	
//	public PrinterController(SamsungPrinter printer) {
//		this.printer=printer;
//		
//	}
	public PrinterController(PrinterDriver printer) {
		super();
		this.printer = printer;
	}
	public void print() {
//		this.printer.samPrint();
		this.printer.print();
		
	}

}
