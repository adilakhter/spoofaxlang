package org.strategoxt.imp.metatooling.building;

import com.google.caliper.runner.CaliperMain;


public class CaliperLoadTestRunner {
	public static void main(String [] args){
		CaliperMain.main(SpoofaxLangBenchmark.class, new String[]{"-i",  "runtime"});
	}
	
}
