package home.trainpassengers.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Train_Passengers {
	public static void main(String[] args) throws IOException {

		Passengers[][] p = { {
				// compartment1
				new Passengers(23456, "Kashmir Express", 01, "Kalaiyarasan", "Chennai", 9514821902L),
				new Passengers(23456, "Kashmir Express", 02, "Sangeetha", "Chennai", 9514821905L), },
				{
						// compartment2
						new Passengers(23456, "Kashmir Express", 11, "Tabrez sir", "Bangalore", 8614821902L),
						new Passengers(23456, "Kashmir Express", 12, "Bharath sir", "Bangalore", 9518822905L),
						new Passengers(23456, "Kashmir Express", 13, "Harish sir", "Bangalore", 7514821892L),
						new Passengers(23456, "Kashmir Express", 14, "Suriya sir", "Chennai", 9515831905L), },
				{
						// compartment3
						new Passengers(23456, "Kashmir Express", 31, "Santhosh", "Chennai", 6614826603L),
						new Passengers(23456, "Kashmir Express", 32, "Sakthi Vel", "Chennai", 9518826603L),
						new Passengers(23456, "Kashmir Express", 33, "Vibin kri", "Bangalore", 8514821892L),
						new Passengers(23456, "Kashmir Express", 34, "Ilavarasan", "Delhi", 6515831115L),
						new Passengers(23456, "Kashmir Express", 31, "Maruthappan", "Bangalore", 7614821902L),
						new Passengers(23456, "Kashmir Express", 32, "Bala bro", "Delhi", 9517722905L),
						new Passengers(23456, "Kashmir Express", 33, "Thenu Mozhi", "Chennai", 7515721892L),
						new Passengers(23456, "Kashmir Express", 34, "Suriya vel", "Bangalore", 9515221905L), },
				{
						// compartment4
						new Passengers(23456, "Kashmir Express", 41, "Warner da", "Delhi", 8614822912L),
						new Passengers(23456, "Kashmir Express", 42, "Smith sm", "Delhi", 9517722935L),
						new Passengers(23456, "Kashmir Express", 43, "Sheryas", "Delhi", 7514821002L),
						new Passengers(23456, "Kashmir Express", 44, "Virat kohli", "Bangalore", 9515832902L), },
				{
						// compartment5
						new Passengers(23456, "Kashmir Express", 51, "Pradeeksha", "Chennai", 7714821902L),
						new Passengers(23456, "Kashmir Express", 52, "Srinidhi", "Chennai", 9518833905L),
						new Passengers(23456, "Kashmir Express", 53, "Geethapasupeti", "Bangalore", 7544821892L),
						new Passengers(23456, "Kashmir Express", 54, "Pooja hegde", "Bangalore", 9515831903L), } };
		// creating chennai files
		File chennai_file = new File("D://Chennai Passengers.txt");
		chennai_file.createNewFile();
		Writer cw = new FileWriter(chennai_file);
		cw.write("--------------------------------------------------\n");
		cw.write("|Passengers  name|Passenger id\t|Passengers phone |\n");
// 	cw.write("|----------------|--------------|-----------------\n");
		cw.write("|-------------------------------------------------\n");
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				if (p[i][j].passenger_travel == "Chennai") {
					cw.write("|" + p[i][j].passenger_name + "\t |" + p[i][j].passenger_id + "\t\t|"
							+ p[i][j].passenger_phone + "\t |\n");
				}
			}
		}
		cw.write("--------------------------------------------------\n");
		cw.write("\t\tChennai Passengers\t\t\n");
		cw.write("--------------------------------------------------\n");
		cw.flush();

		// creating bangalore file
		File bangalore_file = new File("D://Bangalore Passengers.txt");
		bangalore_file.createNewFile();
		Writer bw = new FileWriter(bangalore_file);
		bw.write("--------------------------------------------------\n");
		bw.write("|Passengers  name|Passenger id\t|Passengers phone |\n");
//	 	bw.write("|----------------|--------------|-----------------\n");
		bw.write("|-------------------------------------------------\n");
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				if (p[i][j].passenger_travel == "Bangalore") {
					bw.write("|" + p[i][j].passenger_name + "\t |" + p[i][j].passenger_id + "\t\t|"
							+ p[i][j].passenger_phone + "\t |\n");
				}
			}
		}
		bw.write("--------------------------------------------------\n");
		bw.write("\t\tBangalore Passengers\t\t\n");
		bw.write("--------------------------------------------------\n");
		bw.flush();

		// creating delhi files
		File delhi_file = new File("D://Delhi Passengers.txt");
		delhi_file.createNewFile();
		Writer dw = new FileWriter(delhi_file);
		dw.write("--------------------------------------------------\n");
		dw.write("|Passengers  name|Passenger id\t|Passengers phone |\n");
//		 	bw.write("|----------------|--------------|-----------------\n");
		dw.write("|-------------------------------------------------\n");
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				if (p[i][j].passenger_travel == "Delhi") {
					dw.write("|" + p[i][j].passenger_name + "\t |" + p[i][j].passenger_id + "\t\t|"
							+ p[i][j].passenger_phone + "\t |\n");
				}
			}
		}
		dw.write("--------------------------------------------------\n");
		dw.write("\t\tDelhi Passengers\t\t\n");
		dw.write("--------------------------------------------------\n");
		dw.flush();
		System.out.println("File Created");
	}

}