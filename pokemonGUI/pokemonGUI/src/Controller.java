
import java.util.ArrayList;

/*
*Programmer Nikolas Zbaraszewski
*
*
 */

/**
 *
 * @author zbaraszewski-n
 */
public class Controller {
    
    private PokemonGUI ui;
    private ArrayList<Pokemon> pokemonList = new ArrayList();
    private Pokemon p;     
    	
    
   protected void addUI(PokemonGUI g){
		 this.ui = g;
	 } // end addUI
    
   //creates new pokemon
   protected void createPokemon(){
       p = new Pokemon();
   }
   
   //prints out the pokemon tostring
   protected String toStringPokemon() {
       String output = p.toString();
       return output;
   }
   
   protected void keepButtonClickedInView() {
       pokemonList.add(p);
       ui.pokemonListModel.addElement(p);
   }
   
   //gets the pokemons information
   protected String getPokemon(int i) {
       p = pokemonList.get(i);
       String out = "Species: " +p.getSpecies() +"\nName: " +p.getName() +"\nLevel: " +p.getLevel() +"\nHP: " +p.getHP() +
                 "\nAttack: " +p.getAttack() +  "\nDefense: " +p.getDefense() +
                    "\nSpeed: " +p.getSpeed() +  "\nSpAttack: " +p.getSpattack() + "\nSpDefense: " +p.getSpdefense();
       return out;
   }
   
   //increases each of the pokemon's stats then returns a string to show the new stats
   protected String trainPokemon() {
       
       //runs the train method in Pokemon class
       p.train();
       
       String st = "";
       
       st += "Level up! \nLevel: " +p.getLevel();
       st += "\nHp: " +p.getHP();
       st += "\nAttack: " +p.getAttack();
       st += "\nDefense: " +p.getDefense();
       st += "\nSpeed: " +p.getSpeed();
       st += "\nSpAttack: " +p.getSpattack();
       st += "\nSpDefemse: " +p.getSpdefense();
       
       return st;
   }
   
   
   //renames the pokemon
   protected void renamePokemon(String st) {
       
       //runs the setName method in Pokemon class
       p.setName(st);
       
       
   }
   
   
   
   
   
   

}