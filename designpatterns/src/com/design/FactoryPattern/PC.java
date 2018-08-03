package com.design.FactoryPattern;

public class PC extends Computer{
	
    private String RAM;
    private String HDD;
    private String CPU;
	public PC(String RAM,String HDD,String CPU) {
		this.RAM=RAM;
		this.HDD=HDD;
		this.CPU=CPU;
	}

	@Override
	public String getRAM() {
		
		return RAM;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return CPU;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return HDD;
	}

}
