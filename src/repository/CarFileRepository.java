package repository;

import domain.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by gobi on 3/19/17.
 */
public class CarFileRepository implements IRepository
{
    private Map<Integer, Car> cars;


    public CarFileRepository()
    {
        readFile();
    }

    @Override
    public void readFile()
    {
        Path filePath = Paths.get("cars.txt");

        try
        {
            Files.lines(filePath).forEach(
                    line ->
                    {
                        List<String> attributes = Arrays.asList(line.split(","));
                        int ID = Integer.parseInt(attributes.get(0));
                        String make = attributes.get(1);
                        String model = attributes.get(2);
                        int year = Integer.parseInt(attributes.get(3));
                        String plate = attributes.get(4);
                        String chassiscode = attributes.get(5);

                        Car temp = new Car(ID, make, model, year, plate, chassiscode);

                        try
                        {
                            save(temp);
                        }
                        catch(IllegalArgumentException exception)
                        {
                            exception.printStackTrace();
                        }

                    }
            );
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


    public Optional<Car> save(Car newCar)
    {
        if(newCar == null)
        {
            throw new IllegalArgumentException("Please give a valid Input!");
        }
        else
            return Optional.ofNullable(cars.putIfAbsent(newCar.getID(), newCar));
    }

    public Map<Integer, Car> getCars()
    {
        return cars;
    }
}
