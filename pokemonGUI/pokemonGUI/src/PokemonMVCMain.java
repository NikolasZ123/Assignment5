/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zbaraszewski-n
 */
public class PokemonMVCMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pokemon bob = new Pokemon();
        System.out.println(bob.toString());
        
        
        PokemonGUI pokemonUI = new PokemonGUI();
		pokemonUI.setVisible(true);
		
		Controller controller = new Controller();
		controller.addUI(pokemonUI);
		pokemonUI.addController(controller);
        
        
    }
    
}
