package activity4.model;

import java.time.LocalTime;

/**
 *
 * @author Dan
 */
public class WelcomeService {

    // Evening - 5:00pm (17:00)
    public static final LocalTime EVENING_TIME = LocalTime.of(17, 0);
    
    private static final String MORNING = "morning";
    private static final String AFTERNOON = "afternoon";
    private static final String EVENING = "evening";
    
    public String getPartOfDay(LocalTime time) {
        if (time.isBefore(LocalTime.NOON)) {
            return MORNING;
        } else if (time.isBefore(EVENING_TIME)) {
            return AFTERNOON;
        } else {
            return EVENING;
        }
    }
    
    public String getGreeting(String name) {
        return String.format(
                "Good %s, %s. Welcome!",
                getPartOfDay(LocalTime.now()),
                name
        );
    }
    
}
