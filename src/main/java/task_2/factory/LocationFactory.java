package task_2.factory;

import task_2.model.location.Location;
import task_2.model.location.impl.City;
import task_2.model.location.impl.Desert;
import task_2.model.location.impl.Forest;

public class LocationFactory {
    public static Location createLocation(String location){
        return switch (location.toLowerCase()){
            case "city" -> new City();
            case "desert" -> new Desert();
            case "forest" -> new Forest();
            default -> throw new IllegalArgumentException("Invalid location: " + location);
        };
    }
}
