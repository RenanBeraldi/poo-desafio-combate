package entities;

public class Champion {
    private String name;
    private Integer life;
    private Integer attack;
    private Integer armor;

    public Champion(String name, Integer life, Integer attack, Integer armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion attacker) {
        if (this.armor >= attacker.attack) {
            this.life -= 1;
        } else {
            this.life -= (attacker.attack - this.armor);
        }

        this.life = this.life <= 0 ? 0 : this.life;
    }

    public String status() {
        return this.life > 0 ?
                this.name + ": " + this.life + " de vida" :
                this.name + ": " + this.life + " de vida (morreu)";
    }
}
