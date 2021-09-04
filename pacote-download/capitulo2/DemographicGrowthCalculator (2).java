/*2.34 (Calculadora de crescimento demográfico mundial) Utilize a internet para 
descobrir a população mundial atual e a taxa de crescimento demográfico mundial 
anual. Escreva um aplicativo que introduza esses valores e, então, que exiba a 
população mundial estimada depois de um, dois, três, quatro e cinco anos.
 */
package capitulo2;

public class DemographicGrowthCalculator {

    public static void main(String[] args) {
        double current_wlrd_popu = 7900000000.0;
        double demo_growth_rate = 1.5 / 100.0;
        
        System.out.printf("In 2022 there will be %,.0f inhabitants on the planet.%n",(current_wlrd_popu*(1.0+demo_growth_rate)));
        current_wlrd_popu = current_wlrd_popu * (1.0 + demo_growth_rate);
        
        System.out.printf("In 2023 there will be %,.0f inhabitants on the planet.%n",(current_wlrd_popu*(1.0+demo_growth_rate)));
        current_wlrd_popu = current_wlrd_popu * (1.0 + demo_growth_rate);
        
        System.out.printf("In 2024 there will be %,.0f inhabitants on the planet.%n",(current_wlrd_popu*(1.0+demo_growth_rate)));
        current_wlrd_popu = current_wlrd_popu * (1.0 + demo_growth_rate);
        
        System.out.printf("In 2025 there will be %,.0f inhabitants on the planet.%n",(current_wlrd_popu*(1.0+demo_growth_rate)));
        current_wlrd_popu = current_wlrd_popu * (1.0 + demo_growth_rate);
        
        System.out.printf("In 2026 there will be %,.0f inhabitants on the planet.%n",(current_wlrd_popu*(1.0+demo_growth_rate)));
        current_wlrd_popu = current_wlrd_popu * (1.0 + demo_growth_rate);
    }
}
