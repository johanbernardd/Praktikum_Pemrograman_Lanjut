//Link Hackerrank: https://www.hackerrank.com/contests/class-and-object/challenges/simple-game-simulation/problem

import java.util.Scanner;

    class detailPlayer {
        private String nama;
        private double attackPower;
        
        public detailPlayer(String nama, double attackPower) {
            this.nama = nama;
            this.attackPower = attackPower;
        }

        public String getNama() {
            return nama;
        }

        public double getPlayerAttackPower() {
            return attackPower;
        }
    }

    class detailEnemy {
        private double healthOfEnemy;

    public detailEnemy (double healthOfEnemy) {
        this.healthOfEnemy = healthOfEnemy;
    }

    public double getHealth() {
        return healthOfEnemy;
    }

    public void decreaseHealthOfEnemy(double damagetoEnemy) {
        healthOfEnemy -= damagetoEnemy;
        if (healthOfEnemy < 0) {
            healthOfEnemy = 0;
        }
    }
    }

public class simpleGameSimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String Nama = input.nextLine();
        double AttackOfPower = input.nextDouble();
        detailPlayer objek1 = new detailPlayer(Nama, AttackOfPower);

        double HealthOfEnemy = input.nextDouble();
        detailEnemy objek2 = new detailEnemy(HealthOfEnemy);

        System.out.printf("%s attacking enemy with attack power %.2f\n", objek1.getNama(), objek1.getPlayerAttackPower());
        objek2.decreaseHealthOfEnemy(objek1.getPlayerAttackPower());
        
        System.out.printf("Health of Enemy = %.2f", objek2.getHealth());
    }
}