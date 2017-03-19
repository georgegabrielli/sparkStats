package repository;

import domain.Maintenance;
import ui.Main;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by gobi on 3/19/17.
 */
public class MaintenanceFileRepository implements IRepository
{
    Map<Integer, Maintenance> maintenance;

    public MaintenanceFileRepository()
    {
        maintenance = new HashMap<>();
        readFile();
    }

    @Override
    public void readFile()
    {
        Path filePath = Paths.get("maintenance.txt");

        try
        {
            Files.lines(filePath).forEach(
                    line ->
                    {
                        List<String> attributes = Arrays.asList(line.split(","));

                        int ID = Integer.parseInt(attributes.get(0));
                        int carID = Integer.parseInt(attributes.get(1));
                        String description = attributes.get(2);
                        long sum = Long.parseLong(attributes.get(3));
                        String currency = attributes.get(4);
                        SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = null;
                        try
                        {
                            date = parser.parse(attributes.get(5));
                        } catch (ParseException e)
                        {
                            e.printStackTrace();
                        }

                        Maintenance temp = new Maintenance(ID, carID, description, sum, currency, date);

                        save(temp);
                    }
            );
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Optional<Maintenance> save(Maintenance entity)
    {
        if(entity == null)
        {
            throw new IllegalArgumentException("Maintenance");
        }

        else return Optional.ofNullable(maintenance.putIfAbsent(entity.getID(), entity));
    }
}
