/* **********************************************************
 * Programmer:	Nikolas Z
 * Class:		CS30S
 * 
 * Assignment:	GUI MVC assignment 5
 *
 * Description:	Pokemon object that will have the pokemon's info
 *
 * 
 * *************************************************************
 */
public class Pokemon {
    
    private species species;
    private String name;
    private int level;
    
    private int HP;
    private int attack;
    private int defense;
    private int speed;
    private int spattack;
    private int spdefense;
    
    public enum species{
        
        Pikachu, Charmander, Squirtle, Bulbasaur, Tynamo;
        
    }
    
    
    //default constructor, stats are generated randomly
    public Pokemon(){
         
        int speciesSelector = (int)(Math.random()*5+1);
        
         if(speciesSelector == 1){
            species = species.Pikachu;
            
        }else if(speciesSelector == 2){
            species = species.Charmander;
            
        }else if(speciesSelector == 3){
            species = species.Squirtle;
            
        }else if(speciesSelector == 4){
            species = species.Bulbasaur;
            
        }else if(speciesSelector == 5){
            species = species.Tynamo; 
        }
        
        name = "";
        
        level = (int)(Math.random()*10 + 1);
         
        HP = ((int)(Math.random()*(level)*2 +1));
        attack =((int)(Math.random()*level*2 +1));
        defense =   ((int)(Math.random()*level*2 +1));
        speed =  ((int)(Math.random()*level*2 +1));
        spattack = ((int)(Math.random()*level*2+1));
        spdefense =  ((int)(Math.random()*level*2 +1));
         
        System.out.println("Default Pokemon Created");
     }
    
    //initialized constructor n=name l=level h=HP a=attack d=defense s=speed spa=spattack spd=spdefense
    public Pokemon (species sp,String n, int l, int h, int a, int d, int s, int spa, int spd){
        
        species = sp;
        name = n;
        level = l;
         
        HP = h;
        attack = a;
        defense = d;
        speed = s;
        spattack = spa;
        spdefense = spd;
        System.out.println("Initialized Pokemon Created");
    }
    
    //*****
    //getters
    //*****
    public species getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHP() {
        return HP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpattack() {
        return spattack;
    }

    public int getSpdefense() {
        return spdefense;
    }

    
    
    //*****
    //setters
    //*****

    
    
    public void setSpecies(species species) {
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpattack(int spattack) {
        this.spattack = spattack;
    }

    public void setSpdefense(int spdefense) {
        this.spdefense = spdefense;
    }
    
    
    //overwrites the toString method and returns it as a string
    public String toString(){
            String out = "Species: " +species +"\nName: " +name +"\nLevel: " +level +"\nHP: " +HP +  "\nAttack: " +attack +  "\nDefense: " +defense +
                    "\nSpeed: " +speed +  "\nSpAttack: " +spattack + "\nSpDefense: " +spdefense;
         return out;
     }
    
    
    //adds a random amount of stats to a pokemon
    public void train() {
        level = ++level;
        
        HP = HP +((int)(Math.random()*2+1)); 
        attack = attack +((int)(Math.random()*2+1));
        defense = defense +((int)(Math.random()*2+1));
        speed = speed +((int)(Math.random()*2+1));
        spattack = spattack +((int)(Math.random()*2+1));
        spdefense = spdefense +((int)(Math.random()*2+1));         
                
                
    }
    
    //renames the pokemon and returns
    public String renamePokemon(String nm){
       name = nm;
       
       String st = "Pokemon name changed to " +nm;
       return st;
    }
    
    
    
}
