package K_ExamPreparation.LAB;

import java.util.*;

public class T03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int players = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroes = new LinkedHashMap<>();

        for (int i = 1; i <= players; i++) {
            String[] hero = scanner.nextLine().split("\\s+");
            String heroName = hero[0];
            int HP = Integer.parseInt(hero[1]);
            int MP = Integer.parseInt(hero[2]);

            heroes.put(heroName, new ArrayList<>());

            if (HP >= 100) {
                heroes.get(heroName).add(100);
            } else {
                heroes.get(heroName).add(HP);
            }

            if (MP >= 200) {
                heroes.get(heroName).add(200);
            } else {
                heroes.get(heroName).add(MP);
            }

        }

        String[] command = scanner.nextLine().split("\\s+-\\s+");

        while (!command[0].equals("End")) {

            if (command[0].equals("CastSpell")) {

                List<Integer> values = heroes.get(command[1]);

                int valueMPHero = values.get(1);
                int valueMPRequired = Integer.parseInt(command[2]);

                if (valueMPRequired <= valueMPHero) {

                    valueMPHero = valueMPHero - valueMPRequired;

                    values.set(1, valueMPHero);

                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", command[1], command[3], valueMPHero);

                } else {

                    System.out.printf("%s does not have enough MP to cast %s!%n", command[1], command[3]);

                }

            } else if (command[0].equals("TakeDamage")) {

                List<Integer> values = heroes.get(command[1]);

                int valueHPHero = values.get(0);
                int valueHPRequired = Integer.parseInt(command[2]);

                if ((valueHPHero-valueHPRequired)>0) {

                    System.out.printf("%s was hit for %s HP by %s and now has %d HP left!%n", command[1], command[2], command[3], valueHPHero - valueHPRequired);

                    values.set(0, valueHPHero - valueHPRequired);

                } else {

                    System.out.printf("%s has been killed by %s!%n", command[1], command[3]);
                    heroes.remove(command[1]);

                }

            } else if (command[0].equals("Recharge")) {

                List<Integer> values = heroes.get(command[1]);

                int rechargeValue = Integer.parseInt(command[2]);
                int currentMPValue = values.get(1);

                int amount = (rechargeValue + currentMPValue);

                if (amount > 200) {
                    values.set(1, 200);
                    amount = 200;
                } else {
                    values.set(1, amount);
                }

                System.out.printf("%s recharged for %d MP!%n", command[1], amount - currentMPValue);


            } else if (command[0].equals("Heal")) {

                List<Integer> values = heroes.get(command[1]);

                int rechargeValue = Integer.parseInt(command[2]);
                int currentMPValue = values.get(0);

                int amount = (rechargeValue + currentMPValue);

                if (amount > 100) {
                    values.set(0, 100);
                    amount = 100;
                } else {
                    values.set(0, amount);
                }
                System.out.printf("%s healed for %d HP!%n", command[1], amount - currentMPValue);

            }

            command = scanner.nextLine().split("\\s+-\\s+");
        }



        for (Map.Entry<String, List<Integer>> output : heroes.entrySet()) {

            System.out.println(output.getKey());
            List<Integer> values = output.getValue();
            System.out.println("  HP: " + values.get(0));
            System.out.println("  MP: " + values.get(1));

        }

    }
}


