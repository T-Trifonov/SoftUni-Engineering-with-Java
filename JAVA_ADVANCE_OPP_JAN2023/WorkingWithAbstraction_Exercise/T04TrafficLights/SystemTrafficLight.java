package T04TrafficLights;

public class SystemTrafficLight {

    public static String next(String input) {

        int lastPosition = 0;
        String output = "";

        for (TrafficLights.TrafficLight current : TrafficLights.TrafficLight.values()) {
            if (current.getPosition() > lastPosition) {
                lastPosition = current.getPosition();
            }

        }

        if (TrafficLights.TrafficLight.valueOf(input).getPosition() != lastPosition) {
            for (TrafficLights.TrafficLight el : TrafficLights.TrafficLight.values()) {
                if (el.getPosition() == TrafficLights.TrafficLight.valueOf(input).getPosition() + 1) {
                    output = el.name();
                }
            }
        } else if (TrafficLights.TrafficLight.valueOf(input).getPosition() == lastPosition) {
            for (TrafficLights.TrafficLight el : TrafficLights.TrafficLight.values()) {
                if (el.getPosition() == 1) {
                    output = el.name();
                }
            }
        }

        return output;

    }
}
