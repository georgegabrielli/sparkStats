package repository;

import domain.TechnicalInspection;

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
public class TechnicalInspectionFileRepository implements IRepository
{
    Map<Integer, TechnicalInspection> ITP;

    public TechnicalInspectionFileRepository()
    {
        ITP = new HashMap<>();
        readFile();
    }

    @Override
    public void readFile()
    {
        Path filePath = Paths.get("ITP.txt");

        try
        {
            Files.lines(filePath).forEach(
                    line ->
                    {
                        List<String> attributes = Arrays.asList(line.split(","));

                        int ID = Integer.parseInt(attributes.get(0));
                        int carID = Integer.parseInt(attributes.get(1));
                        SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
                        Date expiration = null;
                        try
                        {
                            expiration = parser.parse(attributes.get(2));
                        } catch (ParseException e)
                        {
                            e.printStackTrace();
                        }

                        TechnicalInspection temp = new TechnicalInspection(ID, carID, expiration);

                        save(temp);


                    }
            );
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Optional<TechnicalInspection> save (TechnicalInspection entity)
    {
        if (entity == null)
        {
            throw new IllegalArgumentException("ITP");
        }

        else
            return Optional.ofNullable(ITP.putIfAbsent(entity.getID(), entity));
    }
}
