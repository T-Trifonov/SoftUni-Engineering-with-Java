package T04TrafficLights;

public class TrafficLights {

    enum TrafficLight {

        RED(1),
        GREEN(2),
        YELLOW(3);

        private final int position;

        TrafficLight(int position) {
            this.position = position;
        }

        public int getPosition() {
            return position;
        }



    }




}
