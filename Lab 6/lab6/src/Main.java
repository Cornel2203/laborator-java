import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class UsedCar implements Comparable<UsedCar> {
    private String marca;
    private String model;
    private int anfab;
    private String combustibil;
    private double pret;
    private double kilometraj;

    public UsedCar(String marca, String model, int anfab, String combustibil, double pret, double kilometraj) {
        this.marca = marca;
        this.model = model;
        this.anfab = anfab;
        this.combustibil = combustibil;
        this.pret = pret;
        this.kilometraj = kilometraj;
    }

    @Override
    public int compareTo(UsedCar otherCar) {
        return Double.compare(this.kilometraj, otherCar.kilometraj);
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", anul faburicatiei=" + anfab +
                ", combustibil='" + combustibil + '\'' +
                ", pret=" + pret +
                ", kilometraj=" + kilometraj +
                '}';
    }
}

class CSVReader {
    private String csvFile;
    private String csvDelimiter;

    public CSVReader(String csvFile, String csvDelimiter) {
        this.csvFile = csvFile;
        this.csvDelimiter = csvDelimiter;
    }

    public List<UsedCar> readData() {
        List<UsedCar> cars = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvDelimiter);

                if (data.length == 6) {
                    String marca = data[0].trim();
                    String model = data[1].trim();
                    int anfab = Integer.parseInt(data[2].trim());
                    String combustibil = data[3].trim();
                    double pret = Double.parseDouble(data[4].trim());
                    double kilometraj = Double.parseDouble(data[5].trim());

                    UsedCar car = new UsedCar(marca, model, anfab, combustibil, pret, kilometraj);
                    cars.add(car);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return cars;
    }
}

public class Main {
    public static void main(String[] args) {
        String csvFile = "cars.csv";
        String csvDelimiter = ",";

        CSVReader csvReader = new CSVReader(csvFile, csvDelimiter);
        List<UsedCar> cars = csvReader.readData();

        // Sortează mașinile în funcție de numărul de kilometri
        Collections.sort(cars);

        for (UsedCar car : cars) {
            System.out.println(car);
        }
    }
}
