package com.your.dream.real;

import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class AppView {

	private static Logger mLog = Logger.getLogger(AppView.class.getName());
	private static final int MIN = 0;
	private static final int LINE = 2;

	public void showProgramStartMSG() {
		StringBuilder startmsg = new StringBuilder();
		startmsg.append("ActualCoding(Team_12)_Project: Bill Calculator is starting\n");
		startmsg.append("Please insert Data");
		mLog.log(Level.INFO, startmsg.toString());
	}

	public void printResult(BasicPlan plan, double bill) {
		StringBuilder printre = new StringBuilder();
		printre.append("[          Bill          ]\n");
		printre.append("BasicMinutes: " + plan.getFreeTime() + ", YourUsingMinutes: " + plan.getMinit() + "\n");
		printre.append("OverMinutes: " + (plan.getMinit() - plan.getFreeTime()) + "\n");
		printre.append("Your total charges are $" + bill);
		mLog.log(Level.INFO, printre.toString());
	}

	public List<BasicPlan> parseDataFromFile(String fileName) throws IOException {
		List<BasicPlan> dataList = new ArrayList();
		String line;
		String[] temp;

		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			while ((line = bufferedReader.readLine()) != null) {
				temp = line.split(" ");
				if ("Gold".equals(temp[1])) {
					dataList.add(new Gold(Double.parseDouble(temp[MIN]), Double.parseDouble(temp[LINE])));
				} else {
					dataList.add(new Silver(Double.parseDouble(temp[MIN]), Double.parseDouble(temp[LINE])));
				}
			}
		}
		return dataList;
	}
}
