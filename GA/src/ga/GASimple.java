/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

import org.apache.commons.math3.genetics.*;

/**
 *
 * @author antares
 */
public class GASimple implements Runnable{

  int TOURNAMENT_ARITY = 2;
  int NUM_GENERATIONS = 100;
  int POPULATION_SIZE = 100;
  double ELITIST_RATE = 0.05;
  
  @Override
  public void run() {
    
    // initialize a new genetic algorithm
GeneticAlgorithm ga = new GeneticAlgorithm(
    new OnePointCrossover<Integer>(),
    1,
    new RandomKeyMutation(),
    0.10,
    new TournamentSelection(TOURNAMENT_ARITY)
);
        
// initial population
Population initial = getInitialPopulation();
        
// stopping condition
StoppingCondition stopCond = new FixedGenerationCount(NUM_GENERATIONS);
        
// run the algorithm
Population finalPopulation = ga.evolve(initial, stopCond);
        
// best chromosome from the final population
Chromosome bestFinal = finalPopulation.getFittestChromosome();    

  }

  private Population getInitialPopulation() {
    return new ElitisticListPopulation(POPULATION_SIZE, ELITIST_RATE) ;
  }
  
}
