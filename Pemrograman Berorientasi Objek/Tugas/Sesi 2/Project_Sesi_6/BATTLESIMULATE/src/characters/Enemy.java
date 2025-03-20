package characters;
import base.Player;

public class Enemy extends Player {
    public Enemy(String name, int health, int attackpower) {
        super(name, health, attackpower);
    }

    public int attack(){
        int damage;
        if (playerAvoid()% 2 ==1) {
            damage = 0;
            System.out.println(getName() + "Berhasil Menghindar");
        }
        else {
            damage = super.attack();
            boolean criticalHit = rand.nextDouble() > 0.4;
            if(criticalHit){
                damage *= 2;
                System.out.println("🔥Critcial Damage:" + getName() + "!!");
            } 
        }
        return damage;
    }

    @Override
    public void infoPlayer() {
        System.out.println("🧔‍♂️Enemy:" + getName() + "HP:" + getHealth());
    }
}
