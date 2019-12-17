package pl.n2god.data;

import java.util.Objects;

/**
 * @author n2god on 16/12/2019
 * @project jdbcEeExercise
 */
public class City {
	private String name;
	private int population;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public City() {
	}

	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		City city = (City) o;
		return population == city.population &&
				Objects.equals(name, city.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, population);
	}
}